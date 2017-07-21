/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.tester;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.osterhoutgroup.sharedlibraryplugin.models.application.BaseApplication;

/**
 * @author wilbur.yu
 *
 */
@Entity
@Table(name = "tester")
@SuppressWarnings("serial")
public class BaseTester implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "application_id")
    private BaseApplication application;

    @JsonProperty("tester_emails")
    @Column(name = "tester_emails")
    private String testerEmails;

    @JsonProperty("supported_staging")
    @Column(name = "supported_staging")
    private int supportedStaging;

    @JsonProperty("group_name")
    @Column(name = "group_name")
    private String groupName;

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

	public String getTesterEmails() {
        return testerEmails;
    }

    public void setTesterEmails(String testerEmails) {
        this.testerEmails = testerEmails;
    }

    public int getSupportedStaging() {
        return supportedStaging;
    }

    public void setSupportedStaging(int supportedStaging) {
        this.supportedStaging = supportedStaging;
    }

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
