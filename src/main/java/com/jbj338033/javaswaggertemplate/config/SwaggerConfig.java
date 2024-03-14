package com.jbj338033.javaswaggertemplate.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder().group("v12").pathsToMatch("/**").build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI().info(new Info().title("Swagger Template").description("Swagger Template with Java").version("v0.0.1"));
    }
}
