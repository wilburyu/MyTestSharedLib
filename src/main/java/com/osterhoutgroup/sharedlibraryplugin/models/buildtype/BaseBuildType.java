package com.osterhoutgroup.sharedlibraryplugin.models.buildtype;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;

@Entity
@Table(name = "build_type")
@SuppressWarnings("serial")
public class BaseBuildType extends CreateAndUpdateTimes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "build_type_name")
    private String buildTypeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuildTypeName() {
        return buildTypeName;
    }

    public void setBuildTypeName(String buildTypeName) {
        this.buildTypeName = buildTypeName;
    }

}
