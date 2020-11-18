package com.wangyicourse.service.impl;

import com.wangyicourse.entity.Chapter;
import com.wangyicourse.mappers.ChapterMapper;
import com.wangyicourse.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    ChapterMapper chapterMapper;

    @Override
    public List<Chapter> findAllChapter() {
        return chapterMapper.findAllChapters();
    }
}
