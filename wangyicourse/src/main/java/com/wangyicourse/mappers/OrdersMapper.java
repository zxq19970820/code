package com.wangyicourse.mappers;

import com.wangyicourse.entity.Orders;
import com.wangyicourse.entity.OrdersExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> selectOrderByUserId(@Param("userid") int userid) ;
    List<Orders> selectOrderByUserIdAndState(@Param("userid") int userid, @Param("state") String state) ;
    List<Orders> selectOrderByUserIdAndOrderId(@Param("userid") int userid, @Param("orderId") int orderId);
}