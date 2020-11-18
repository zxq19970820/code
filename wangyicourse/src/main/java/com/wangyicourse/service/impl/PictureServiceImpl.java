package com.wangyicourse.service.impl;


import com.wangyicourse.entity.Pictures;
import com.wangyicourse.entity.PicturesExample;
import com.wangyicourse.mappers.PicturesMapper;
import com.wangyicourse.service.pictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/14 14:28
 * 4
 */
@Service
public class PictureServiceImpl implements pictureService {


    @Autowired
    PicturesMapper pm;


    @Override
    public List<Pictures> getPictures(String title) {

        PicturesExample pe = new PicturesExample();
        pe.createCriteria().andTitleEqualTo(title);


        List<Pictures> pictures = pm.selectByExample(pe);

        return pictures;
    }

    @Override
    public List<Pictures> selectByDes1(String des) {
        PicturesExample pe=new PicturesExample();
        pe.createCriteria().andDes1Like("%"+des+"%");
        List<Pictures> pictures = pm.selectByExample(pe);
        return pictures;
    }

    public String getTouXiang(String id){
        PicturesExample pe=new PicturesExample();
        pe.createCriteria().andTitleEqualTo("头像").andPageEqualTo("头像").andDes1EqualTo(id);
        List<Pictures> pictures = pm.selectByExample(pe);
        String img = pictures.get(0).getPicture();
        return img;

    }


}
