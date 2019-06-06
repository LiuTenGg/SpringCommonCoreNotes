package org.smallmouse.test;

import org.smallmouse.config.ScanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanConfigTest {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ScanConfig.class);
    for (String compentName:ctx.getBeanDefinitionNames()){
      System.out.println("@ComponentScan在容器中扫描到: "+compentName);
    }
  }
}
