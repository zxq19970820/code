package com.wangyicourse.service;

import com.wangyicourse.entity.Section;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SectionService {
//    List<Section> findAllSection();
    //新加
    public String getVideoUrl(int sectionid);
}
