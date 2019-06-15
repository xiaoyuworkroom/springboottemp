package com.xiaoyu.springbootdemo.mapper;

import com.xiaoyu.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT *  FROM T_USER  WHERE phone = #{phone}")
    User findUserByPhone(@Param("phone") String phone);

    @Insert("INSERT INTO T_USER ( NAME, PASSWORD, PHONE ) VALUES(#{name},#{password},#{phone})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("phone") String phone);

}
