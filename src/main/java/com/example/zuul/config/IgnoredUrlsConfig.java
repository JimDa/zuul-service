package com.example.zuul.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

////@Component
//@ConfigurationProperties(prefix = "allowed.routes")
//@Setter
//@Getter

//@Data
public class IgnoredUrlsConfig {
    private String all;
    private List<String> path = new ArrayList<>();

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

    public void setPath(List<String> path) {
        this.path = path;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }
}
