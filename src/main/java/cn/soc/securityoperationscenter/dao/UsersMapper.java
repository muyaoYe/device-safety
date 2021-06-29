package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.Users;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}