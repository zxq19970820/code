package com.ssm.mapper;

import com.ssm.entity.Cartpro;
import com.ssm.entity.CartproExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartproMapper {
    long countByExample(CartproExample example);

    int deleteByExample(CartproExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cartpro record);

    int insertSelective(Cartpro record);

    List<Cartpro> selectByExample(CartproExample example);

    Cartpro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cartpro record, @Param("example") CartproExample example);

    int updateByExample(@Param("record") Cartpro record, @Param("example") CartproExample example);

    int updateByPrimaryKeySelective(Cartpro record);

    int updateByPrimaryKey(Cartpro record);

//    自定义

    //批量删除购物车中的商品
    //(1,2)利用foreach标签，int[] 或 List<Integer>，( , )
    //更新操作：方法返回类型 int  boolean  long  void
    //更新操作的结果做处理的话，不推荐使用void，可以使用boolean（true），int\long(>0)
    boolean deleteProsByPid(@Param("ids") int[] ids,@Param("cid") int cid);

    List<Cartpro> selectProductById(@Param("userId")int userId) ;
}