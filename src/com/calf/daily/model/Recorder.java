package com.calf.daily.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Recorder implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;

    private String username;

    private String userpass;

    private String userrole;

    private String usercomm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole == null ? null : userrole.trim();
    }

    public String getUsercomm() {
        return usercomm;
    }

    public void setUsercomm(String usercomm) {
        this.usercomm = usercomm == null ? null : usercomm.trim();
    }
}