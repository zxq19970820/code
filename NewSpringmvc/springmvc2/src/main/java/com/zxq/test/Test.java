package com.zxq.test;

import com.zxq.domain.Person;
import com.zxq.validator.PersonValidator;
import org.springframework.validation.Errors;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.HashMap;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/19 19:32
 * 4
 */
public class Test {
    //测试
    public static void main(String[] args) {
        //创建校验的对象
        Validator validator = new PersonValidator();
        //创建校验的目标对象
        Person person = new Person("",130);

        //还需要存储错误信息的对象
        Errors errors = new MapBindingResult(new HashMap(),"person");
        //调用校验方法
        validator.validate(person,errors);
        //如果有错误，就保存在了errors
        //遍历错误的信息
        List<ObjectError> allErrors = errors.getAllErrors();
        for(ObjectError error:allErrors){
            //error.getObjectName()：错误的属性的名字， code：错误的信息
            System.out.println(error.getObjectName()+" : " + error.getCode());
        }
        System.out.println("-----over--------");
    }
}
