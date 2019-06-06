package org.smallmouse.test;

import org.smallmouse.bean.Cat;
import org.smallmouse.bean.Dog;
import org.smallmouse.bean.Mouse;
import org.smallmouse.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigTest {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        BeanConfig.class);
//    System.out.println(ctx.getBeanDefinitionNames());

//懒汉式加载在被调用的时候被创建
    ctx.getBean("mouse");
//    多实例模式-测试 return is false
    Mouse m1  = (Mouse) ctx.getBean("mouse");
    Mouse m2  = (Mouse) ctx.getBean("mouse");
    System.out.println("Mouse 多例测试结果:"+(m1==m2));
//    单实例模式-测试 return is true
    Cat c1  = (Cat) ctx.getBean("cat");
    Cat c2  = (Cat) ctx.getBean("cat");
    Dog d1 = (Dog)ctx.getBean("dog");
    Dog d2 = (Dog)ctx.getBean("dog");
    System.out.println("Cat单例测试结果:"+(c1==c2));
    System.out.println("Dog单例懒加载测试结果:"+(d1==d2));
  }

}
