package com.zhangdi.website.mapper;

import com.zhangdi.website.domain.UserDemo;
import com.zhangdi.website.domain.UserDemoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDemoMapper {
    long countByExample(UserDemoExample example);

    int deleteByExample(UserDemoExample example);

    int insert(UserDemo record);

    int insertSelective(UserDemo record);

    List<UserDemo> selectByExample(UserDemoExample example);

    int updateByExampleSelective(@Param("record") UserDemo record, @Param("example") UserDemoExample example);

    int updateByExample(@Param("record") UserDemo record, @Param("example") UserDemoExample example);
}