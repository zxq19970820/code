package com.wangyicourse.service;

import com.wangyicourse.entity.Pictures;


import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/14 14:25
 * 4
 */
public interface pictureService {

    List<Pictures> getPictures(String page);

    List<Pictures> selectByDes1(String des);

    String getTouXiang(String id);

}
