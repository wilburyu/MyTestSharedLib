package com.osterhoutgroup.sharedlibraryplugin.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.fasterxml.jackson.annotation.JsonProperty;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@SuppressWarnings("serial")
public class CreateAndUpdateTimes implements Serializable {
    @Column(name = "created_on")
    @JsonProperty("created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    @JsonProperty("updated_on")
    private Date updatedOn;

    public Date getCreatedOn() {
        return createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    @PrePersist
    @PreUpdate
    protected void onSave() {
        if (this.createdOn == null) {
            this.createdOn = new Date();
        }
        this.updatedOn = new Date();
    }
}
