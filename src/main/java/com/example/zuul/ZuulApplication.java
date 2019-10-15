package com.example.zuul;

import com.example.zuul.config.IgnoredUrlsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@EnableConfigurationProperties
@RestController
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Bean(name = "ignoredUrls")
    @ConfigurationProperties(prefix = "allowed.routes")
    public IgnoredUrlsConfig getIgnoredUrls() {
        return new IgnoredUrlsConfig();
    }

    @GetMapping(value = "/urls")
    public ResponseEntity<IgnoredUrlsConfig> getUrls() {
        return ResponseEntity.ok(getIgnoredUrls());
    }
}
