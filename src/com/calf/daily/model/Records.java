package com.calf.daily.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Records implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;

    private String recordlabel;

    private String recordtitle;

    private String recordcontent;

    private String recordsms;

    private String recordvisible;

    private String recordgroup;

    private String recordimages;

    private Date recordtime;

    private Date recordlasttime;

    private String recorduser;

    public Records() {
		super();
	}

	public Records(String recordlabel, String recordtitle, String recordcontent, String recordgroup,
			String recordimages, String recorduser) {
		super();
		this.recordlabel = recordlabel;
		this.recordtitle = recordtitle;
		this.recordcontent = recordcontent;
		this.recordgroup = recordgroup;
		this.recordimages = recordimages;
		this.recorduser = recorduser;
	}

	public Records(String id, String recordlabel, String recordtitle, String recordcontent, String recordsms,
			String recordvisible, String recordgroup, String recordimages, Date recordtime, Date recordlasttime,
			String recorduser) {
		super();
		this.id = id;
		this.recordlabel = recordlabel;
		this.recordtitle = recordtitle;
		this.recordcontent = recordcontent;
		this.recordsms = recordsms;
		this.recordvisible = recordvisible;
		this.recordgroup = recordgroup;
		this.recordimages = recordimages;
		this.recordtime = recordtime;
		this.recordlasttime = recordlasttime;
		this.recorduser = recorduser;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRecordlabel() {
        return recordlabel;
    }

    public void setRecordlabel(String recordlabel) {
        this.recordlabel = recordlabel == null ? null : recordlabel.trim();
    }

    public String getRecordtitle() {
        return recordtitle;
    }

    public void setRecordtitle(String recordtitle) {
        this.recordtitle = recordtitle == null ? null : recordtitle.trim();
    }

    public String getRecordcontent() {
        return recordcontent;
    }

    public void setRecordcontent(String recordcontent) {
        this.recordcontent = recordcontent == null ? null : recordcontent.trim();
    }

    public String getRecordsms() {
        return recordsms;
    }

    public void setRecordsms(String recordsms) {
        this.recordsms = recordsms == null ? null : recordsms.trim();
    }

    public String getRecordvisible() {
        return recordvisible;
    }

    public void setRecordvisible(String recordvisible) {
        this.recordvisible = recordvisible == null ? null : recordvisible.trim();
    }

    public String getRecordgroup() {
        return recordgroup;
    }

    public void setRecordgroup(String recordgroup) {
        this.recordgroup = recordgroup == null ? null : recordgroup.trim();
    }

    public String getRecordimages() {
        return recordimages;
    }

    public void setRecordimages(String recordimages) {
        this.recordimages = recordimages == null ? null : recordimages.trim();
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public Date getRecordlasttime() {
        return recordlasttime;
    }

    public void setRecordlasttime(Date recordlasttime) {
        this.recordlasttime = recordlasttime;
    }

    public String getRecorduser() {
        return recorduser;
    }

    public void setRecorduser(String recorduser) {
        this.recorduser = recorduser == null ? null : recorduser.trim();
    }
}