package main.java.entity;

import java.util.Date;

/**
 * 角色管理
 */
public class Role {

    private String id;

    private String roleName;

    private String liableId;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getLiableId() {
        return liableId;
    }

    public void setLiableId(String liableId) {
        this.liableId = liableId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rId='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
                ", liableId='" + liableId + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
