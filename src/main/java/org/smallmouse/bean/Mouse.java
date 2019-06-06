package org.smallmouse.bean;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mouse {
  public Mouse(){
    System.out.println("this is Mouse");
  }

  @PostConstruct
  public void initl(){
    System.out.println("Mouse的PostConstruct标志的方法");
  }

  @PreDestroy
  public void des(){
    System.out.println("Mouse的PreDestory标注的方法");
  }
}
