package com.example.zuul.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IgnoredUrlsConfig {
    private List<String> path;

    public String[] getUrls() {
        String[] urlArr = new String[this.path.size()];
        for (int i = 0; i < urlArr.length; i++) {
            urlArr[i] = this.path.get(i);
        }
        return urlArr;
    }
}
