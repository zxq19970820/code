package MVC__3_11.biz;

import MVC__3_11.pojo.Users;



//业务逻辑
public interface UsersBiz {

    public Users login(String uname, String pwd);

    public boolean register(Users user);

    public boolean update(Users user);

    public boolean updatePassword(int userid,String oldPassword, String newPassword);

}
