package com.osterhoutgroup.sharedlibraryplugin.models.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;

@Entity
@Table(name = "user")
public class User extends CreateAndUpdateTimes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accepted_terms")
    private boolean acceptedTerms;

    private boolean active;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "custom_fee")
    private Double customFee;

    private String email;

    @Column(name = "first_name")
    private String firstName;

    private String hash;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "hash_timestamp")
    private Date hashTimestamp;

    @Column(name = "is_on_mailing_list")
    private boolean isOnMailingList;

    @Column(name = "is_disabled")
    private boolean isDisabled;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(name = "last_name")
    private String lastName;

    private String password;

    @Column(name = "profile_picture_url")
    private String profilePictureUrl;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_role_id")
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAcceptedTerms() {
        return acceptedTerms;
    }

    public void setAcceptedTerms(boolean acceptedTerms) {
        this.acceptedTerms = acceptedTerms;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Date getHashTimestamp() {
        return hashTimestamp;
    }

    public void setHashTimestamp(Date hashTimestamp) {
        this.hashTimestamp = hashTimestamp;
    }

    public boolean isOnMailingList() {
        return isOnMailingList;
    }

    public void setOnMailingList(boolean isOnMailingList) {
        this.isOnMailingList = isOnMailingList;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
