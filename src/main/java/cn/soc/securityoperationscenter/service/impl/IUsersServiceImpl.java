package cn.soc.securityoperationscenter.service.impl;

import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.dao.UsersMapper;
import cn.soc.securityoperationscenter.entity.Users;
import cn.soc.securityoperationscenter.service.IUsersService;
import cn.soc.securityoperationscenter.utils.PageHelperUtils;
import com.github.pagehelper.Page;
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
        Users user = usersMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public PageResult selectAll(Integer pageNum , Integer pageSize,Users users) {
        Page<Object> page = PageHelperUtils.page(pageNum,pageSize);
        usersMapper.selectAll(users);
        PageResult pageResult = PageHelperUtils.getPageResult(page);
        return pageResult;
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

    @Override
    public int[] isOnlyTelephoneEmail(String telephone, String email) {
        List<Users> users = usersMapper.validateTelephoneEmail(telephone, email);
        if (users==null || users.size() ==0){
            return null;
        }else {
            int[] result = new int[users.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = users.get(i).getId();
            }
            return result;
        }
    }
}
