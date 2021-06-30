package cn.soc.securityoperationscenter.service.impl;

import cn.soc.securityoperationscenter.dao.UsersMapper;
import cn.soc.securityoperationscenter.entity.Users;
import cn.soc.securityoperationscenter.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        Users user = usersMapper.selectByPrimaryKey(id);
        return user;
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

    @Override
    public Users selectByNamePass(String username, String password) {
        Users user = usersMapper.selectByNamePass(username,password);
        return user;
    }
}
