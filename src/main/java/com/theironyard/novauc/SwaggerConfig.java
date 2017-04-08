package com.theironyard.novauc;


import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error")))
                .build()
                .apiInfo(metaData())
                .pathMapping("/");
    }
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "TJefferson People Group",
                "RESTful API built for class ass",
                "1.0",
                "the tree of liberty",
                new Contact("Vegas C", "https://github.com/VTCurry", "vtcurry@gmail.com"),
                "Too long to read this?",
                "https://twitter.com/vegastcurry?lang=en");
        return apiInfo;
    }
}