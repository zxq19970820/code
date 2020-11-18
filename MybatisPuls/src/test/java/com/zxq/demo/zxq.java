package com.zxq.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/13 13:40
 */

//代码生成器
public class zxq {
    public static void main(String[] args) {

//        需要构建一个代码自动生成器对象
        AutoGenerator mpg = new AutoGenerator();

//        配置策略
//        1.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");      //获取当前项目路径
        gc.setOutputDir(projectPath + "/src/main/java");      //生成到指定路径
        gc.setOpen(false);  //是否打开资源管理器
        gc.setAuthor("zxq");    //设置作者
        gc.setFileOverride(false);      //设置覆盖
        gc.setServiceName("%sService");     //正则表达式去除Service的I前缀
        gc.setIdType(IdType.ID_WORKER);     //默认初始主键
        gc.setDateType(DateType.ONLY_DATE);      //配置时间
        gc.setSwagger2(true);

        mpg.setGlobalConfig(gc);

//      2.设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/mybatisplus?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

//        3.包的配置
        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("blog");
        pc.setParent("com.zxq");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");

        mpg.setPackageInfo(pc);

//        4.策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("user");  //设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);  //包     下划线转驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//列  下划线转驼峰命名
        strategy.setEntityLombokModel(true);  //自动lombok
        strategy.setLogicDeleteFieldName("deleted");//设置逻辑删除


//        自动填充配置
        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        TableFill updateTime = new TableFill("update_time", FieldFill.INSERT_UPDATE);

        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(createTime);
        tableFills.add(updateTime);
        strategy.setTableFillList(tableFills);

//        乐观锁
        strategy.setVersionFieldName("version");

//        开启restful的驼峰命名格式
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true); //localhost:8080/hello_id_2

        mpg.setStrategy(strategy);

        mpg.execute();  //执行

    }
}
