package cn.soc.securityoperationscenter.core.service.impl.user;

import cn.soc.securityoperationscenter.core.service.user.IUsersService;
import cn.soc.securityoperationscenter.server.dao.user.UsersMapper;
import cn.soc.securityoperationscenter.server.pojo.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUsersServiceImpl implements IUsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = usersMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(Users record) {
        int i = usersMapper.insert(record);
        return i;
    }

    @Override
    public Users selectByPrimaryKey(Integer id) {
        Users users = usersMapper.selectByPrimaryKey(id);
        return users;
    }

    @Override
    public List<Users> selectAll() {
        List<Users> usersList = usersMapper.selectAll();
        return usersList;
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        int i = usersMapper.updateByPrimaryKey(record);
        return i;
    }
}
