package com.mys.niucommunity.dao;

import com.mys.niucommunity.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mys
 * @date 2022/12/26 14:55
 */
@Mapper
public interface DiscussPostMapper {
    // 分页查询
    List<DiscussPost> selectDiscussPorts(int userId, int offset, int limit);

    // 查询行数
    // @Param给参数取别名，如果只有一个参数，且在<if>里面使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
