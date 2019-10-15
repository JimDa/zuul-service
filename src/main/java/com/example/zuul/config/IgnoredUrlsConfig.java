package com.example.zuul.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "allowed.routes")
@Setter
@Getter
@EnableConfigurationProperties
@Configuration
public class IgnoredUrlsConfig {
    private List<String> path = new ArrayList<>();

    public String[] getUrls() {
        String[] urlArr = new String[this.path.size()];
        for (int i = 0; i < urlArr.length; i++) {
            urlArr[i] = this.path.get(i);
        }
        return urlArr;
    }
}
