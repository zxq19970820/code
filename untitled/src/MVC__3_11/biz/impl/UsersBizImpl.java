package MVC__3_11.biz.impl;

import MVC__3_11.biz.UsersBiz;
import MVC__3_11.dao.UsersDao;
import MVC__3_11.dao.impl.UsersDaoImpl;
import MVC__3_11.pojo.Users;

public class UsersBizImpl implements UsersBiz {

    private UsersDao dao = new UsersDaoImpl();

    @Override
    public Users login(String uname, String pwd) {
        Users u = dao.login(uname, pwd);
        return u;
    }

    @Override
    public boolean register(Users user) {
        return dao.register(user) > 0;
    }

    @Override
    public boolean update(Users user) {
        return dao.update(user) > 0;
    }

    @Override
    public boolean updatePassword(int userid, String oldPassword, String newPassword) {
        return false;
    }
}
