package org.smallmouse.config;

import org.smallmouse.scan.FilterType.ZooFilterType;
import org.smallmouse.scan.dao.CatDao;
import org.smallmouse.scan.dao.DogDao;
import org.smallmouse.scan.service.CatService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
/**
 * 注解形式的FilterType.ANNOTATION @Controller @Service @Repository @Compent
 * 指定类型的 FilterType.ASSIGNABLE_TYPE
 * aspectj类型的 FilterType.ASPECTJ(不常用)
 * 正则表达式的 FilterType.REGEX(不常用)
 * 自定义的 FilterType.CUSTOM
 */
@ComponentScan(basePackages = {"org.smallmouse.scan"},excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class}),
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {DogDao.class})
})//扫描时过滤掉@Controller和DogDao类型

/*@ComponentScan(basePackages = {"org.smallmouse.scan"},includeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Repository.class}),
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {CatDao.class}),
    @ComponentScan.Filter(type = FilterType.CUSTOM,value = {ZooFilterType.class})//设置自定义的FilterType类
},useDefaultFilters = false)//引入@Repository和CatDao类型,引入时要将useDefaultFilters(默认为true,表示扫描全部)设置成false
*/
public class ScanConfig {

}
