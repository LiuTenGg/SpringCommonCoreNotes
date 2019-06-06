package org.smallmouse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Dog implements BeanPostProcessor {

  public Dog(){
    System.out.println("this is Dog");
  }
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("init之前");
    return bean;
  }
  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("init之后");
    return bean;
  }

  public void initl(){
    System.out.println("Dog的init");
  }
}
