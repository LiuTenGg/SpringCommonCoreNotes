package org.smallmouse.config;

import org.smallmouse.bean.Cat;
import org.smallmouse.bean.Dog;
import org.smallmouse.bean.Mouse;
import org.smallmouse.bean.Tiger;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
public class BeanConfig {

    //在不指定@Scope的情况下所有的Bean都是单例的，且为饿汉式加载
    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean(initMethod = "init", destroyMethod = "destory") //指定这个Bean的创建方法以及销毁方法，方法写在Bean的实体里
    public Tiger tiger() {
        return new Tiger();
    }

    /**
     * 指定@Scope为 prototype 表示为多实例的，而且还是懒汉式加载
     * singleton 单实例的(默认)
     * prototype 多实例的
     * request 同一次请求
     * session 同一个会话级别
     *
     * @return
     */
    @Bean
    @Scope(value = "prototype")
    public Mouse mouse() {
        return new Mouse();
    }

    //使@Bean变成单例，懒汉式加载
    @Bean
    @Lazy
    @Conditional(value = beanConditional.class)
    public Dog dog() {
        return new Dog();
    }

    class beanConditional implements Condition {//实现Condition接口

        @Override
        public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
            if (conditionContext.getBeanFactory().containsBean("cat")) {//判断cat是否在容器中
                return true; //如果在容器中才会创建
            }
            return false;//不在则不创建
        }
    }
}
