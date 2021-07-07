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

    Users selectByNamePass(String username, String password);

    /**
     * 电话已经邮箱是否已经被使用
     * 已经被使用返回-1
     * 未被使用返回-0
     * @param telephone
     * @param email
     * @return
     */
    int isOnlyTelephoneEmail(String telephone, String email);
}
