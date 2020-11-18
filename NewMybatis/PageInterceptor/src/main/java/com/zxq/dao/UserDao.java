package com.zxq.dao;

import com.zxq.domain.User;
import com.zxq.mappers.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDao {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is !=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public SqlSession openSesson(){
        return sqlSessionFactory.openSession();
    }

    /**
     * 分页查询
     * 当前页的第一条记录的索引值
     * 每页显示的个数
     * @return
     */
    public List<User> findLimit(Integer startIndex, Integer count){
        SqlSession sqlSession = openSesson();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findLimit(startIndex, count);
        sqlSession.close();
        return userList;
    }

    /**
     * 所有记录个数
     * @return
     */
    public long findCount(){
        SqlSession sqlSession = openSesson();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        long count = mapper.findCount();
        sqlSession.close();
        return count;
    }
}
