package com.recruit.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    @Select("select * from user")
    public List<Map<String,Object>> queryuser();

}
