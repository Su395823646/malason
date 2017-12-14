package com.sf.su.malason.dao.mapper;

import com.sf.su.malason.dao.domain.AgentUpgrade;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import static org.junit.Assert.*;

/**
 * @author 591030 on 2017/12/14.
 */
@ContextConfiguration(locations = {"/test-dao.xml"})
public class AgentUpgradeMapperTest  extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private AgentUpgradeMapper agentUpgradeMapper;

    @Test
    public void insertSelective() throws Exception {

        AgentUpgrade agentUpgrade = new AgentUpgrade();
        agentUpgrade.setDownLoadUrl("");
        agentUpgrade.setGatherClassName("gatherClassName");
        int result = agentUpgradeMapper.insertSelective(agentUpgrade);
        Assert.assertSame(result,1);
    }

}