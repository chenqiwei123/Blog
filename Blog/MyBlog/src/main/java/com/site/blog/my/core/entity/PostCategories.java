package com.site.blog.my.core.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@Table(name = "content_patch_logs")
public class PostCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;


    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "category_id")
    private Integer tagId;

}
