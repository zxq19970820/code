package com.wangyicourse.service;

import com.wangyicourse.entity.Institution;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/24 15:30
 * 4
 */
public interface InstitutionService {

    List<Institution> getAllJIGouByState(String state);

    List<Institution> findByName1(String name);

    List<Institution> findByName2(String name);

    int deleteById(int id);

    int HuiFuById(int id);

    int addJiGou(Institution it);

    int updateJiGou(Institution it);

}
