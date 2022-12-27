package com.mys.niucommunity.entity;

import lombok.Data;

/**
 * @author mys
 * @date 2022/12/26 17:55
 */
// 封装分页相关的信息
@Data
public class Page {
    // 当前页码
    private int current = 1;
    // 显示上限
    private int limit = 10;
    // 总页数
    private int rows;
    // 查询路径（复用分页链接）
    private String path;

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    // 获取当前页的起始行
    public int getOffset() {
        // current * limit - limit
        return (current - 1) * limit;
    }

    // 获取总页数
    public int getTotal() {
        // rows / limit [+1]
        return rows % limit == 0 ? rows / limit : rows / limit + 1;
    }

    // 从 获取起始页码
    public int getFrom() {
        int from = current - 2;
        return Math.max(from, 1);
    }
    // 到 获取结束页码
    public int getTo() {
        int to = current + 2;
        int total = getTotal();
        return Math.min(to, total);
    }
}
