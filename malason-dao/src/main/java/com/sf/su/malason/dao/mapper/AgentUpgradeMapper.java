package com.sf.su.malason.dao.mapper;

import com.sf.su.malason.dao.domain.AgentUpgrade;

public interface AgentUpgradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentUpgrade record);

    int insertSelective(AgentUpgrade record);

    AgentUpgrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentUpgrade record);

    int updateByPrimaryKey(AgentUpgrade record);
}