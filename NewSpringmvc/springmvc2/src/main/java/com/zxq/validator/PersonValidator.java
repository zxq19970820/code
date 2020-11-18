package com.zxq.validator;

import com.zxq.domain.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.HashMap;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/19 19:27
 * 4
 */
public class PersonValidator implements Validator {

    //支持校验的类型
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    //校验的方法，校验的目标对象
    //校验该对象的属性是否符合要求
    //Errors：校验不符合要求，将错误的信息存入Errors
    public void validate(Object target, Errors errors) {
        //将target向下转型为Person，才能获取用户名和年龄
        if(target !=null && target instanceof Person){
            Person person = (Person) target;
            //age的条件，大于10，小于100
            if(person.getAge() <=10){
                //错误信息，年龄过小
                errors.rejectValue("age","年龄过小");
            }
            if(person.getAge() >100){
                //错误信息，年龄过大
                errors.rejectValue("age","年龄过大");
            }
            if(person.getName()==null || person.getName().equals("")){
                errors.rejectValue("name","姓名为空");
            }
        }
    }


}
