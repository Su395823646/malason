package com.sf.su.malason.dao.domain;

import java.util.Date;

public class AgentUpgrade {
    private Integer id;

    private String agentVersion;

    private String downLoadUrl;

    private String upgradeJobName;

    private String upgradeJobInterval;

    private String script;

    private String logType;

    private String gatherClassName;

    private Boolean isDeleted;

    private Date createdTm;

    private Date modifiedTm;

    public AgentUpgrade(Integer id, String agentVersion, String downLoadUrl, String upgradeJobName, String upgradeJobInterval, String script, String logType, String gatherClassName, Boolean isDeleted, Date createdTm, Date modifiedTm) {
        this.id = id;
        this.agentVersion = agentVersion;
        this.downLoadUrl = downLoadUrl;
        this.upgradeJobName = upgradeJobName;
        this.upgradeJobInterval = upgradeJobInterval;
        this.script = script;
        this.logType = logType;
        this.gatherClassName = gatherClassName;
        this.isDeleted = isDeleted;
        this.createdTm = createdTm;
        this.modifiedTm = modifiedTm;
    }

    public AgentUpgrade() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion == null ? null : agentVersion.trim();
    }

    public String getDownLoadUrl() {
        return downLoadUrl;
    }

    public void setDownLoadUrl(String downLoadUrl) {
        this.downLoadUrl = downLoadUrl == null ? null : downLoadUrl.trim();
    }

    public String getUpgradeJobName() {
        return upgradeJobName;
    }

    public void setUpgradeJobName(String upgradeJobName) {
        this.upgradeJobName = upgradeJobName == null ? null : upgradeJobName.trim();
    }

    public String getUpgradeJobInterval() {
        return upgradeJobInterval;
    }

    public void setUpgradeJobInterval(String upgradeJobInterval) {
        this.upgradeJobInterval = upgradeJobInterval == null ? null : upgradeJobInterval.trim();
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getGatherClassName() {
        return gatherClassName;
    }

    public void setGatherClassName(String gatherClassName) {
        this.gatherClassName = gatherClassName == null ? null : gatherClassName.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreatedTm() {
        return createdTm;
    }

    public void setCreatedTm(Date createdTm) {
        this.createdTm = createdTm;
    }

    public Date getModifiedTm() {
        return modifiedTm;
    }

    public void setModifiedTm(Date modifiedTm) {
        this.modifiedTm = modifiedTm;
    }
}