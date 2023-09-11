package com.site.blog.my.core.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "content_patch_logs")
public class ContentPatchLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

    @Lob
    @Column(name = "content_diff")
    private String contentDiff;

    @Lob
    @Column(name = "original_content_diff")
    private String originalContentDiff;

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "publish_time")
    private Instant publishTime;

    @Column(name = "source_id", nullable = false)
    private Integer sourceId;

    @Column(name = "status")
    private Integer status;

    @Column(name = "version", nullable = false)
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Instant getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Instant publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getOriginalContentDiff() {
        return originalContentDiff;
    }

    public void setOriginalContentDiff(String originalContentDiff) {
        this.originalContentDiff = originalContentDiff;
    }

    public String getContentDiff() {
        return contentDiff;
    }

    public void setContentDiff(String contentDiff) {
        this.contentDiff = contentDiff;
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
