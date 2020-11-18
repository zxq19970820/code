package com.zxq.handle;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/12 19:08
 */

@Slf4j
@Component  //将处理器加到Ioc容器中
public class MyMetaObjectHandler implements MetaObjectHandler {

    //    插入时的填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill....");

//        setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject)
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    //    更新时的填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
