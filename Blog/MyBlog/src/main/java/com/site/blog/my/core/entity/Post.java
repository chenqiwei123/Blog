package com.site.blog.my.core.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

    @Column(name = "disallow_comment")
    private Boolean disallowComment;

    @Column(name = "edit_time")
    private Instant editTime;

    @Column(name = "editor_type")
    private Integer editorType;

    @Lob
    @Column(name = "format_content")
    private String formatContent;

    @Column(name = "likes")
    private Long likes;

    @Column(name = "meta_description", length = 1023)
    private String metaDescription;

    @Column(name = "meta_keywords", length = 511)
    private String metaKeywords;

    @Lob
    @Column(name = "original_content")
    private String originalContent;

    @Column(name = "password")
    private String password;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "status")
    private Integer status;

    @Lob
    @Column(name = "summary")
    private String summary;

    @Column(name = "template")
    private String template;

    @Column(name = "thumbnail", length = 1023)
    private String thumbnail;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "top_priority")
    private Integer topPriority;

    @Column(name = "url")
    private String url;

    @Column(name = "version")
    private Integer version;

    @Column(name = "visits")
    private Long visits;

    @Column(name = "word_count")
    private Long wordCount;

    public Post() {
        this.type = 0;
        this.createTime = new Date().toInstant();
        this.updateTime = new Date().toInstant();
        this.disallowComment = true;
        this.editTime = new Date().toInstant();
        this.editorType = 0;
        this.likes = Long.valueOf(0);
        this.status = 0;
        this.topPriority = 0;
        this.version = 1;
        this.visits = Long.valueOf(135);
        this.wordCount = Long.valueOf(135);
    }

    public Long getWordCount() {
        return wordCount;
    }

    public void setWordCount(Long wordCount) {
        this.wordCount = wordCount;
    }

    public Long getVisits() {
        return visits;
    }

    public void setVisits(Long visits) {
        this.visits = visits;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getTopPriority() {
        return topPriority;
    }

    public void setTopPriority(Integer topPriority) {
        this.topPriority = topPriority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public String getFormatContent() {
        return formatContent;
    }

    public void setFormatContent(String formatContent) {
        this.formatContent = formatContent;
    }

    public Integer getEditorType() {
        return editorType;
    }

    public void setEditorType(Integer editorType) {
        this.editorType = editorType;
    }

    public Instant getEditTime() {
        return editTime;
    }

    public void setEditTime(Instant editTime) {
        this.editTime = editTime;
    }

    public Boolean getDisallowComment() {
        return disallowComment;
    }

    public void setDisallowComment(Boolean disallowComment) {
        this.disallowComment = disallowComment;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
