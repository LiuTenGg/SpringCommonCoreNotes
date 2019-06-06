package org.smallmouse.config;

import org.smallmouse.bean.Cat;
import org.smallmouse.bean.Mouse;
import org.smallmouse.imports.ZooBeanDefinitionRegister;
import org.smallmouse.imports.ZooImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Cat.class,Mouse.class,ZooImportSelector.class,ZooBeanDefinitionRegister.class})
public class ImportConfig {

}
