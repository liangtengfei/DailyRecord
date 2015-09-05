package com.calf.daily.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RecordSysLog implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;

    private String content;

    private Date logtime;

    private String logmethod;

    public RecordSysLog() {
		super();
	}

	public RecordSysLog(String id, String content, Date logtime, String logmethod) {
		super();
		this.id = id;
		this.content = content;
		this.logtime = logtime;
		this.logmethod = logmethod;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    public String getLogmethod() {
        return logmethod;
    }

    public void setLogmethod(String logmethod) {
        this.logmethod = logmethod == null ? null : logmethod.trim();
    }
}