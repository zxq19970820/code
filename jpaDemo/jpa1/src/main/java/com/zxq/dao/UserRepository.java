package com.zxq.dao;

import com.zxq.doamin.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {      //实体类型和实体类中的Id类型

//        使用自定义方法命名，进行查询服务，并添加分页功能
//    List<User> findByNameContaining(String name, Pageable pageable);        //…… where name like ‘%?%’

    /**
     * 6      * @Query进行 自定义sql编写
     * 7      * nativeQuery=true：表示定义的SQL为标准SQL（没有这一项，SQL语句中的表名和字段名是实体类名和实体类中的字段名）
     * 8      * 传参数使用占位符？代替，但需要注意的是这里的占位符后面需要跟数字（第几个？N 数字N从1开始）
     * 9
     */
    @Query(value = " select  * from t_user where name = :username ",nativeQuery =true )
    public User findUser(@Param("username") String name);


//    如涉及到删除和修改在需要加上@Modifying.
//    也可以根据需要添加 @Transactional 对事物的支持，查询超时的设置等
    @Transactional()
    @Modifying(clearAutomatically = true)       //clearAutomatically = true 表示清理实体类里的数据。
    @Query(value = "update t_user  set name=:username where  id=:id",nativeQuery = true)
    int updateById(String username,Integer id);



}

