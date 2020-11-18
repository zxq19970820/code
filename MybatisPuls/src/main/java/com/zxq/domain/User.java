package com.zxq.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/12 14:12
 */

@AllArgsConstructor     //全参构造器
@NoArgsConstructor      //无参构造器
@Data      // @Data注解在类上，会为类的所有属性自动生成setter/getter、equals、canEqual、hashCode、toString方法，
// 如为final属性，则不会为该属性生成setter方法。
public class User implements Serializable {

    //    对应数据库中的主键(uuid，自增id，雪花算法，redis，zookeeper！)
//    @TableId(type = IdType.AUTO) //自增
//    @TableId(type = IdType.INPUT) //需要自己手动添加id
    //    @TableId(type = IdType.ID_WORKER) //mp自带策略，生成19位值,针对long
//    @TableId(type = IdType.ID_WORKER_STR) //mp自带策略，生成19位值,针对字符串
    private Long id;

    private String name;
    private Integer age;
    private String email;

    @Version        //乐观锁的注解
    private Integer version;

    @TableLogic     //逻辑删除
    private Integer deleted;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
}
