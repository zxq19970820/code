package mvc.biz.impl;


import mvc.biz.UsersBiz;
import mvc.dao.UsersDao;
import mvc.dao.impl.UsersDaoImpl;
import mvc.pojo.Users;

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
