package com.kl.ssm.admin.user.service;

import com.kl.ssm.admin.user.model.UserLogin;
import com.kl.ssm.admin.user.model.UserLoginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLoginService  {

    //根据条件汇总记录数
    long countByExample(UserLoginExample example);
    //根据条件删除
    int deleteByExample(UserLoginExample example);
    //根据主键删除
    int deleteByPrimaryKey(String userId);
    //全字段添加记录
    int insert(UserLogin record);
    //选择性添加记录
    int insertSelective(UserLogin record);
    //根据条件查询
    List<UserLogin> selectByExample(UserLoginExample example);
    //根据主键查询
    UserLogin selectByPrimaryKey(String userId);
    //根据条件有选择的更新
    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);
    //根据条件全字段更新
    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);
    //根据主键有选择的更新
    int updateByPrimaryKeySelective(UserLogin record);
    //根据主键全字段更新
    int updateByPrimaryKey(UserLogin record);
}
