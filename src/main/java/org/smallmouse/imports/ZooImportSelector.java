package org.smallmouse.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ZooImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata annotationMetadata) {
    //可以获取导入类的注解信息
    return new String[]{"org.smallmouse.scan.dao.CatDao","org.smallmouse.scan.dao.MouseDao"};
  }
}
