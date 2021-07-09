package cn.soc.securityoperationscenter;


import cn.soc.securityoperationscenter.dao.UsersMapper;
import cn.soc.securityoperationscenter.entity.Users;
import cn.soc.securityoperationscenter.service.IUsersService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SecurityOperationsCenterApplicationTests {

    @Autowired
    UsersMapper usersMapper;

    @Test
    void contextLoads() {
        Page<Object> page = PageHelper.startPage(1,3);
//        page.setOrderBy("id desc");
//        List<Users> users = usersMapper.selectAll();
        System.out.println("-----------------------------");
        System.out.println(page);
    }

}
