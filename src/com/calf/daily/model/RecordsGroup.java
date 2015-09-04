package com.calf.daily.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
@Entity
public class RecordsGroup implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;

    private String groupname;

    private String groupvisible;

    private String grouowner;

    private Date grouptime;

    private String groupdid;

    private String groupcomm;

    public RecordsGroup() {
		super();
	}

	public RecordsGroup(String id, String groupname, String groupvisible, String grouowner, Date grouptime,
			String groupdid, String groupcomm) {
		super();
		this.id = id;
		this.groupname = groupname;
		this.groupvisible = groupvisible;
		this.grouowner = grouowner;
		this.grouptime = grouptime;
		this.groupdid = groupdid;
		this.groupcomm = groupcomm;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getGroupvisible() {
        return groupvisible;
    }

    public void setGroupvisible(String groupvisible) {
        this.groupvisible = groupvisible == null ? null : groupvisible.trim();
    }

    public String getGrouowner() {
        return grouowner;
    }

    public void setGrouowner(String grouowner) {
        this.grouowner = grouowner == null ? null : grouowner.trim();
    }

    public Date getGrouptime() {
        return grouptime;
    }

    public void setGrouptime(Date grouptime) {
        this.grouptime = grouptime;
    }

    public String getGroupdid() {
        return groupdid;
    }

    public void setGroupdid(String groupdid) {
        this.groupdid = groupdid == null ? null : groupdid.trim();
    }

    public String getGroupcomm() {
        return groupcomm;
    }

    public void setGroupcomm(String groupcomm) {
        this.groupcomm = groupcomm == null ? null : groupcomm.trim();
    }
}