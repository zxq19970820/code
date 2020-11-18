package com.zxq.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/12 20:01
 */
//扫描mapper文件夹
@MapperScan("com.zxq.mapper")
@Configuration  //配置类
@EnableTransactionManagement       //启动事务管理
public class MyBatisPlusConfig {


    //    注册乐观锁插件
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    //    分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


    //    逻辑删除组件
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }



    /**
     * SQL 执行性能分析插件
     * 开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长
     * 三种环境
     * dev:开发环境
     * test:测试环境
     * prod:生产环境
     */
    //    sql执行效率
    @Bean
    @Profile({"dev", "test"})    //设置dev test环境开启，保证我们的效率
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setMaxTime(1000); //ms毫秒  设置sql执行的最大时间，如果超过了则不执行
        performanceInterceptor.setFormat(true); //是否开启sql格式化支持
        return performanceInterceptor;
    }

}
