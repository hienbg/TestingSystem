package com.vti.rw41.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GroupAccountId implements Serializable {
    private static final long serialVersionUID = 4536170217793912327L;
    @Column(name = "GroupID", nullable = false)
    private Integer groupID;

    @Column(name = "AccountID", nullable = false)
    private Integer accountID;

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        GroupAccountId entity = (GroupAccountId) o;
        return Objects.equals(this.accountID, entity.accountID) &&
                Objects.equals(this.groupID, entity.groupID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID, groupID);
    }

}