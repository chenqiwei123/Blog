package com.site.blog.my.core.dao.master;

import com.site.blog.my.core.entity.SaveVideoInfo;
import com.site.blog.my.core.entity.SearchInfoEntity;

import java.util.List;

public interface CodeDaoMapper {
    List<SaveVideoInfo> SelectInfo(SearchInfoEntity searchInfo);
    int getCount(SearchInfoEntity searchInfo);
}
