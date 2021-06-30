package cn.soc.securityoperationscenter.service;

import cn.soc.securityoperationscenter.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUsersService {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);

    Users selectByNamePass(String username,String password);

}
