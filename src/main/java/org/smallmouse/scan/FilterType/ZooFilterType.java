package org.smallmouse.scan.FilterType;

import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
//自定义的FilterType需要实现TypeFilter接口
public class ZooFilterType implements TypeFilter {

  @Override
  public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
      throws IOException {
    //获取当前注解源信息
    AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
    //获取当前类class源信息
    ClassMetadata classMetadata = metadataReader.getClassMetadata();
    //获取当前类资源信息
    Resource resource = metadataReader.getResource();

    if (classMetadata.getClassName().contains("dao")) {
      System.out.println("print true");
      return true; //返回true的时候才会执行includeFilters或excludeFilters的逻辑
    }
    return false;//返回false的时候@ComponentScan只会扫描到自身
  }
}
