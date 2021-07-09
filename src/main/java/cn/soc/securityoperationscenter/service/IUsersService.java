package cn.soc.securityoperationscenter.service;

import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.Users;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUsersService {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer id);

    /**
     * 实现分页查询与模糊查询一体化
     *
     * @param pageNum
     * @param pageSize
     * @param users
     * @return
     */
    PageResult selectAll(Integer pageNum, Integer pageSize, Users users);

    int updateByPrimaryKey(Users record);

    Users selectByNamePass(String username, String password);

    /**
     * 电话已经邮箱是否已经被使用
     * 已经被使用返回-使用人id
     * 未被使用返回-0
     *
     * @param telephone
     * @param email
     * @return
     */
    int[] isOnlyTelephoneEmail(String telephone, String email);
}
