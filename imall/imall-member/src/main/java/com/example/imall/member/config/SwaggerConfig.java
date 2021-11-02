package com.example.imall.member.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by BobZhang on 2021/11/2
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    //@Profile(value = { "dev","devlocal","prodlocal"})
    public Docket webDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                //.groupName("web")
                //.genericModelSubstitutes(DeferredResult.class)
                //.useDefaultResponseMessages(false)
                //.forCodeGeneration(true)
                //.pathMapping("/springboot")
                .select()
                //.apis(RequestHandlerSelectors.basePackage("cn.xglory.tmc.web"))//api过滤，匹配包
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))//api过滤，匹配类注解
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))//api过滤，匹配方法注解
                //.paths(PathSelectors.any())
                //.paths(Predicates.not(PathSelectors.regex("/api/.*")))//api过滤，路径过滤
                .build();
        //.directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class) // Java8时间类型替换方案
        //.directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
        //.apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Open API")
                .description("")
                .termsOfServiceUrl("服务URL的规范描述")
                .contact(new Contact("zhangzhentao", "http://xglory.cn", "ztzhang@xglory.cn"))
                .version("1.0")
                .build();
    }
}
