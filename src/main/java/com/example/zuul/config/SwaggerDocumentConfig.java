package com.example.zuul.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Primary
@Component
public class SwaggerDocumentConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        return new ArrayList() {{
            add(buildSwaggerResource("用户中心", "/user-service/v2/api-docs", "1.0"));
            add(buildSwaggerResource("社区中心", "/user-community/v2/api-docs", "1.0"));
        }};
    }

    private SwaggerResource buildSwaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
