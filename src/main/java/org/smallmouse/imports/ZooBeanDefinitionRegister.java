package org.smallmouse.imports;

import org.smallmouse.bean.Cat;
import org.smallmouse.bean.Dog;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ZooBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

  @Override
  public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
      BeanDefinitionRegistry beanDefinitionRegistry) {
    //创建一个 根定义Bena 的对象
    RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Dog.class);
    //将根定义Bena对象导入到容器中
    beanDefinitionRegistry.registerBeanDefinition("dog", rootBeanDefinition);//自定义Bean的name，放入对应根定义Bena对象
  }
}
