package com.wangyicourse.service;

import com.wangyicourse.entity.Chapter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChapterService {
    List<Chapter> findAllChapter();
}
