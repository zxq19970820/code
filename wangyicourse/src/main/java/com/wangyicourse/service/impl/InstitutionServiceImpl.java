package com.wangyicourse.service.impl;

import com.wangyicourse.entity.Institution;
import com.wangyicourse.entity.InstitutionExample;
import com.wangyicourse.mappers.InstitutionMapper;
import com.wangyicourse.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/24 15:32
 * 4
 */
@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    InstitutionMapper im;

    @Override
    public List<Institution> getAllJIGouByState(String state) {
        InstitutionExample ie = new InstitutionExample();
        ie.createCriteria().andStateEqualTo(state);
        List<Institution> all = im.selectByExample(ie);
        return all;
    }

    @Override
    public List<Institution> findByName1(String name) {
        InstitutionExample ie = new InstitutionExample();
        ie.createCriteria().andInnameLike("%" + name + "%").andStateEqualTo("已启用");
        List<Institution> institutions = im.selectByExample(ie);
        return institutions;
    }

    @Override
    public List<Institution> findByName2(String name) {
        InstitutionExample ie = new InstitutionExample();
        ie.createCriteria().andInnameLike("%" + name + "%").andStateEqualTo("已删除");
        List<Institution> institutions = im.selectByExample(ie);
        return institutions;
    }


    @Override
    public int deleteById(int id) {
        System.out.println("接收到的课程id为。。。。" + id);
        Institution it = new Institution();
        it.setId(id);
        it.setState("已删除");
        int i = im.updateByPrimaryKeySelective(it);
        return i;
    }

    @Override
    public int HuiFuById(int id) {
        System.out.println("接收到的课程id为。。。。" + id);
        Institution it = new Institution();
        it.setId(id);
        it.setState("已启用");
        int i = im.updateByPrimaryKeySelective(it);
        return i;
    }

    @Override
    public int addJiGou(Institution it) {
        it.setState("已启用");
        int i = im.insertSelective(it);
        return i;
    }

    @Override
    public int updateJiGou(Institution it) {
        int i = im.updateByPrimaryKeySelective(it);
        return i;
    }


}
