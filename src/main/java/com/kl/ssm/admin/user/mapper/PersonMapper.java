package com.kl.ssm.admin.user.mapper;

import com.kl.ssm.admin.user.model.Person;
import com.kl.ssm.admin.user.model.PersonExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {
    long countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(String personId);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(String personId);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}