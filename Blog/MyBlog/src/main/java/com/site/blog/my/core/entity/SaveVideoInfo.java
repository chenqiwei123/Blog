package com.site.blog.my.core.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SaveVideoInfo {
    private Long id;
    private String href;
    private String img;
    private String language;
    private String download;
    private String title;
    private String content;
    private String detail;
}
