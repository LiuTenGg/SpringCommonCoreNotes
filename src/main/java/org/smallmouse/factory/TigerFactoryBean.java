package org.smallmouse.factory;

import org.smallmouse.bean.Tiger;
import org.springframework.beans.factory.FactoryBean;

public class TigerFactoryBean implements FactoryBean<Tiger> {

  //返回Bean的对象
  @Override
  public Tiger getObject() throws Exception {
    return new Tiger();
  }

  //返回Bean的类型
  @Override
  public Class<?> getObjectType() {
    return Tiger.class;
  }

  //是否为单例
  @Override
  public boolean isSingleton() {
    return false;
  }
}
