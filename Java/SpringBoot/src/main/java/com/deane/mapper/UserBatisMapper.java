package com.deane.mapper;

import com.deane.entity.UserBatis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Deane
 * Date: 2018/10/6
 * Time: 11:33 AM
 */
@Mapper
public interface UserBatisMapper {
    @Select("SELECT * FROM t_user WHERE name = #{name}" )
    List<UserBatis> findByName(@Param("name") String username);

    int insert(UserBatis user);
}
