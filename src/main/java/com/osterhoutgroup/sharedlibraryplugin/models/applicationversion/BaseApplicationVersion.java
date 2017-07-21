/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.applicationversion;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;
import com.osterhoutgroup.sharedlibraryplugin.models.application.BaseApplication;

/**
 * @author Gary.Qin
 *
 */
@Entity
@Table(name = "application_version")
@SuppressWarnings("serial")
public class BaseApplicationVersion extends CreateAndUpdateTimes implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "application_id")
    private BaseApplication application;

	@Column(name = "version_name")
    private String versionName;

	@Column(name = "version_code")
    private Long versionCode;

    @Column(name = "min_sdk")
    private Long minSdk;

    @Column(name = "download_uri")
    private String downloadUri;

    @Column(name = "release_date")
	@Type(type="timestamp")
    private Date releaseDate;

	private String updates;

    @Column(name = "description")
    private String description;

	@Column(name = "sku_id")
    private String skuId;

    @Column(name = "app_type")
    private int appType;

	private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BaseApplication getApplication() {
        return application;
    }

    public void setApplication(BaseApplication application) {
        this.application = application;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Long getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Long versionCode) {
        this.versionCode = versionCode;
    }

    public Long getMinSdk() {
        return minSdk;
    }

    public void setMinSdk(Long minSdk) {
        this.minSdk = minSdk;
    }

    public String getDownloadUri() {
        return downloadUri;
    }

    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUpdates() {
        return updates;
    }

    public void setUpdates(String updates) {
        this.updates = updates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getAppType() {
        return appType;
    }

    public void setAppType(int appType) {
        this.appType = appType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BaseApplicationVersion appVersion = (BaseApplicationVersion) o;

        return this.id == appVersion.id;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
