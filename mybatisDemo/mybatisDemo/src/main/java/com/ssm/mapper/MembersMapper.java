package com.ssm.mapper;

import com.ssm.entity.Members;
import com.ssm.entity.MembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

//会员管理不涉及删除操作
public interface MembersMapper {
//    计数
    long countByExample(MembersExample example);

    //有条件的删除，条件可以使and或者or等
    int deleteByExample(MembersExample example);
//根据主键进行会员删除
    int deleteByPrimaryKey(Integer id);


    //b包含Members中所有属性：id，id是自增的
    int insert(Members record);

    int insertSelective(Members record);

//1)查询所有：MembersExample的属性List<Criteria>容量为0
//2）根据时间查询：List<Criteria>集合中添加Criteria对象，andBirthdateBetween(Date value1,Date value2)
//3) 根据姓名，手机号，邮箱查询：andUsernameLike(String value)或andPhoneLike(String value)或
//    andEmailLike(String value)
//4)根据时间并且姓名，手机号，邮箱查询：andBirthdateBetween()  ,andUsernameLike(),andPhoneLike()
//andEmailLike()

    List<Members> selectByExample(MembersExample example);


    Members selectByPrimaryKey(Integer id);


    //有选择性地更新表，对每个属性判断是否为null，当！=null才进行更新
    int updateByExampleSelective(@Param("record") Members record, @Param("example") MembersExample example);


    //members：提供POJO属性，set xxx=yyy
    //MemberExample：提供条件
    //更新表中所有字段，保证所有属性必须赋值
    int updateByExample(@Param("record") Members record, @Param("example") MembersExample example);


    //update members set state=  ?  where (id=?)   只有条件是id时才可以使用
    int updateByPrimaryKeySelective(Members record);

    int updateByPrimaryKey(Members record);
}












