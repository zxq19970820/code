package mvc.biz;


import mvc.pojo.Users;

//业务逻辑
public interface UsersBiz {

    public Users login(String uname, String pwd);

    public boolean register(Users user);

    public boolean update(Users user);

    public boolean updatePassword(int userid, String oldPassword, String newPassword);

}
