package com.osterhoutgroup.sharedlibraryplugin.models.applicationregion;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.osterhoutgroup.sharedlibraryplugin.models.application.BaseApplication;
import com.osterhoutgroup.sharedlibraryplugin.models.region.BaseRegion;

@Entity
@Table(name = "application_region")
@SuppressWarnings("serial")
public class BaseApplicationRegion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "region_id")
    private BaseRegion region;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "application_id")
    private BaseApplication application;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BaseRegion getRegion() {
        return region;
    }

    public void setRegion(BaseRegion region) {
        this.region = region;
    }

    public BaseApplication getApplication() {
        return application;
    }

    public void setApplication(BaseApplication application) {
        this.application = application;
    }
}
