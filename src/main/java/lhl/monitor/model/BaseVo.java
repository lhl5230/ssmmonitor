package lhl.monitor.model;

import java.util.Date;

public class BaseVo {
    private String recId;
    private Date lastModDateTime;
    private Date createdDateTime;
    private String lastModBy;
    private String createdBy;

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public Date getLastModDateTime() {
        return lastModDateTime;
    }

    public void setLastModDateTime(Date lastModDateTime) {
        this.lastModDateTime = lastModDateTime;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getLastModBy() {
        return lastModBy;
    }

    public void setLastModBy(String lastModBy) {
        this.lastModBy = lastModBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
