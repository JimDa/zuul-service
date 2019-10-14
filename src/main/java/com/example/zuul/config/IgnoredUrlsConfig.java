package com.example.zuul.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "allowed.routes")
public class IgnoredUrlsConfig {
    private List<String> path = new ArrayList<>();
    private String haha;

    public String[] getUrls() {
        String[] urlArr = new String[this.path.size()];
        for (int i = 0; i < urlArr.length; i++) {
            urlArr[i] = this.path.get(i);
        }
        return urlArr;
    }

    public List<String> getPath() {
        return path;
    }

    public String getHaha() {
        return haha;
    }

    public void setHaha(String haha) {
        this.haha = haha;
    }
}
