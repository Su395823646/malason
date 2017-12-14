package com.sf.su.malason.web.controller;

import com.sf.framework.base.SystemPreconditions;
import com.sf.framework.domain.Result;
import com.sf.su.malason.dao.domain.AgentUpgrade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author 591030 on 2017/12/14.
 */
@RequestMapping("user")
@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(getClass());


    @RequestMapping("send")
    @ResponseBody
    public Result<AgentUpgrade> insert(AgentUpgrade record) {
        Result<AgentUpgrade> result = new Result<>();

        try {
            SystemPreconditions.checkNotNull(record, "record");
            SystemPreconditions.checkNotNull(record.getAgentVersion(), "appCode");
            record.setAgentVersion("version");
            record.setCreatedTm(new Date());
            record.setDownLoadUrl("url");
            record.setGatherClassName("com.su.sf.class");
            result.setSuccess(true);
            result.setObj(record);
        } catch (Exception e) {
            logger.error(e.getMessage());
            result.setSuccess(false);
            result.setErrorMessage(e.getMessage());
        }
        return result;
    }
}
