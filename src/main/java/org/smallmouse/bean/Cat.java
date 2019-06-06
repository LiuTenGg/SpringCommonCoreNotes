package org.smallmouse.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean,DisposableBean {
 public Cat(){
   System.out.println("this is Cat");
 }

  @Override
  public void destroy() throws Exception {
    System.out.println("Cat已经销毁");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("创建Cat");
  }
}
