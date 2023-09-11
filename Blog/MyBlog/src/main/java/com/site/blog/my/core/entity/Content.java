package com.site.blog.my.core.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "contents")

public class Content {
    @Id
    @Column(name = "post_id", nullable = false)
    private Integer id;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

    @Lob
    @Column(name = "content")
    private String content;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "head_patch_log_id")
    private Integer headPatchLogId;

    @Lob
    @Column(name = "original_content")
    private String originalContent;

    @Column(name = "patch_log_id")
    private Integer patchLogId;

    @Column(name = "status")
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPatchLogId() {
        return patchLogId;
    }

    public void setPatchLogId(Integer patchLogId) {
        this.patchLogId = patchLogId;
    }

    public String getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    public Integer getHeadPatchLogId() {
        return headPatchLogId;
    }

    public void setHeadPatchLogId(Integer headPatchLogId) {
        this.headPatchLogId = headPatchLogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
