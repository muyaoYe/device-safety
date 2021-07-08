package cn.soc.securityoperationscenter.utils;

import cn.soc.securityoperationscenter.common.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * @author wjs
 * @Classname PageHelperUtils
 * @Description TODO
 * @Date 2021/7/8 12:13
 * @Created by wjs
 */
public class PageHelperUtils {

    /**
     * 分页工具方法
     * 传入参数为pageNum-页数，pageSize-每页数量
     *
     * @param pageNum
     * @param pageSize
     * @return Page<Object>
     */
    public static Page<Object> page(Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        page.setReasonable(true);
        return page;
    }

    /**
     * 分页工具方法
     * 传入参数为pageNum-页数，每页默认条数5条
     * @param pageNum
     * @return
     */
    public static Page<Object> page(Integer pageNum) {
        if (pageNum == null) {
            pageNum = 1;
        }
        Page<Object> page = PageHelper.startPage(pageNum, 5);
        page.setReasonable(true);
        return page;
    }

    public static PageResult getPageResult(Page page){
        PageResult pageResult = new PageResult();
        pageResult.setList(page.getResult());
        pageResult.setNowPageNum(page.getResult().size());
        pageResult.setPageCount(page.getPages());
        pageResult.setPageNum(page.getPageNum());
        pageResult.setPageSize(page.getPageSize());
        pageResult.setTotal(page.getTotal());
        return pageResult;
    }
}
