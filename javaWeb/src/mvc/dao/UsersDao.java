package mvc.dao;


import mvc.pojo.Users;

//数据访问    ,只负责数据
public interface UsersDao {

    public Users login(String uname, String pwd);

    public int register(Users user);

    public int update(Users user);

    public int updatePassword(int userid, String oldPassword, String newPassword);
}
