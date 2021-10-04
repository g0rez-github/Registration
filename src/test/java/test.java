import com.g0rez.dao.UserDao;
import com.g0rez.dao.impl.UserDaoImpl;
import com.g0rez.entity.User;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        UserDao userDao = new UserDaoImpl();
        Integer num = userDao.insertUser(user);
        System.out.println(num);
    }
}
