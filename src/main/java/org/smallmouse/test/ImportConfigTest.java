package org.smallmouse.test;

import org.smallmouse.config.ImportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportConfigTest {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        ImportConfig.class);
    for (String compentName : ctx.getBeanDefinitionNames()) {
      System.out.println("@Import在容器中扫描到: " + compentName);
    }
  }
}
