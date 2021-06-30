package cn.soc.securityoperationscenter.dao;

import cn.soc.securityoperationscenter.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);

    Users selectByNamePass(@Param("username") String username,@Param("password")  String password);

}