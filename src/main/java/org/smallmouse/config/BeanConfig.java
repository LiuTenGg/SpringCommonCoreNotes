package org.smallmouse.config;

import org.smallmouse.bean.Cat;
import org.smallmouse.bean.Dog;
import org.smallmouse.bean.Mouse;
import org.smallmouse.bean.Tiger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

  //在不指定@Scope的情况下所有的Bean都是单例的，且为饿汉式加载
  @Bean
  public Cat cat(){
    return new Cat();
  }

  @Bean(initMethod = "init",destroyMethod = "destory") //指定这个Bean的创建方法以及销毁方法，方法写在Bean的实体里
  public Tiger tiger(){
    return new Tiger();
  }

  /**
   * 指定@Scope为 prototype 表示为多实例的，而且还是懒汉式加载
   *  singleton 单实例的(默认)
   *  prototype 多实例的
   *  request 同一次请求
   *  session 同一个会话级别
   * @return
   */
  @Bean
  @Scope(value = "prototype")
  public Mouse mouse(){
    return new Mouse();
  }

  //使@Bean变成单例，懒汉式加载
  @Bean(initMethod = "initl")
  @Lazy
  public Dog dog(){
    return new Dog();
  }

}
