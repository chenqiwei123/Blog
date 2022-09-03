package com.site.blog.my.core.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SearchInfoEntity {
    private String SearchInfo;
    private int page;

    public SearchInfoEntity(int page) {
        this.page = page;
    }
}
