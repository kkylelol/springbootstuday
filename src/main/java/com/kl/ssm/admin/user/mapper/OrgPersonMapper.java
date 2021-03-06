package com.kl.ssm.admin.user.mapper;

import com.kl.ssm.admin.user.model.OrgPerson;
import com.kl.ssm.admin.user.model.OrgPersonExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrgPersonMapper {
    long countByExample(OrgPersonExample example);

    int deleteByExample(OrgPersonExample example);

    int deleteByPrimaryKey(String orgPersonId);

    int insert(OrgPerson record);

    int insertSelective(OrgPerson record);

    List<OrgPerson> selectByExample(OrgPersonExample example);

    OrgPerson selectByPrimaryKey(String orgPersonId);

    int updateByExampleSelective(@Param("record") OrgPerson record, @Param("example") OrgPersonExample example);

    int updateByExample(@Param("record") OrgPerson record, @Param("example") OrgPersonExample example);

    int updateByPrimaryKeySelective(OrgPerson record);

    int updateByPrimaryKey(OrgPerson record);
}