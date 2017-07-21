package com.osterhoutgroup.sharedlibraryplugin.models.buildtypeapplication;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;
import com.osterhoutgroup.sharedlibraryplugin.models.application.BaseApplication;
import com.osterhoutgroup.sharedlibraryplugin.models.buildtype.BaseBuildType;

@Entity
@Table(name = "build_type_application")
public class BaseBuildTypeApplication extends CreateAndUpdateTimes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "build_type_id")
    private BaseBuildType buildType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "application_id")
    private BaseApplication application;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BaseBuildType getBuildType() {
        return buildType;
    }

    public void setBuildType(BaseBuildType buildType) {
        this.buildType = buildType;
    }

    public BaseApplication getApplication() {
        return application;
    }

    public void setApplication(BaseApplication application) {
        this.application = application;
    }
}
