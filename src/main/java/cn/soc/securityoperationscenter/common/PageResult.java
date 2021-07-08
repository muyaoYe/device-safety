package cn.soc.securityoperationscenter.common;

/**
 * @author wjs
 * @Classname PageResult
 * @Description 分页查询输出返回类
 * @Date 2021/7/8 17:57
 * @Created by wjs
 */
public class PageResult {
    private Integer pageNum;
    private Integer pageSize;
    private Integer pageCount;
    private Integer nowPageNum;
    private Long total;
    private Object list;

    public PageResult() {
    }

    public PageResult(Integer pageNum, Integer pageSize, Integer pageCount, Integer nowPageNum, Long total, Object list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.nowPageNum = nowPageNum;
        this.total = total;
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", pageCount=" + pageCount +
                ", nowPageNum=" + nowPageNum +
                ", total=" + total +
                ", list=" + list +
                '}';
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getNowPageNum() {
        return nowPageNum;
    }

    public void setNowPageNum(Integer nowPageNum) {
        this.nowPageNum = nowPageNum;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }
}
