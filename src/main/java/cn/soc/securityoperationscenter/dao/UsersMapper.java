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

    List<Users> selectAll(Users user);

    int updateByPrimaryKey(Users record);

    Users selectByNamePass(@Param("username") String username,@Param("password")  String password);

    /**
     * 验证手机号码以及邮箱是否被使用过
     * @param telephone
     * @param email
     * @return
     */
    List<Users> validateTelephoneEmail(@Param("telephone") String telephone,@Param("email")  String email);

}