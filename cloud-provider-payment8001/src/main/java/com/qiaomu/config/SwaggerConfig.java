package com.qiaomu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @package: com.qiaomu
 * @author: kexiong
 * @date: 2019/8/28 14:23
 * @Description: Swagger2.0配置
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {

//        List<Parameter> parameters = new ArrayList<Parameter>();
//        ParameterBuilder param = new ParameterBuilder();
//        Parameter build = param.name("userId").description("用户ID").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//        parameters.add(build);
//        build = param.name("token").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//        parameters.add(build);
//        build = param.name("version").description("版本").modelRef(new ModelRef("int")).parameterType("header").required(false).build();
//        parameters.add(build);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qiaomu.controller"))
                .paths(PathSelectors.any())
                .build();
//                .globalOperationParameters(parameters);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("项目名aaa")
                .description("接口文档")
                .contact(new Contact("乔木", "http://localhost:8001/swagger-ui.html", "664298431@qq.com"))
                .version("1.0")
                .build();
    }
}
