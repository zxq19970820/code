
package com.wangyicourse.service.impl;

import com.wangyicourse.entity.Section;
import com.wangyicourse.mappers.SectionMapper;
import com.wangyicourse.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionServiceImpl implements SectionService {
    @Autowired
    SectionMapper sectionMapper;
//    @Autowired
//    SectionMapper sectionMapper;
//
//    @Override
//    public List<Section> findAllSection() {
//        return sectionMapper.selectByExample(new SectionExample());
//    }

    @Override
    public String getVideoUrl(int sectionid) {
        Section section=sectionMapper.selectByPrimaryKey(sectionid);
        return section.getVedio();
    }
}