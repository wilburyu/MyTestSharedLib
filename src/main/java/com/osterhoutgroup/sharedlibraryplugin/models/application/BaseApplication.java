/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.application;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;
import com.osterhoutgroup.sharedlibraryplugin.models.buildtype.BaseBuildType;
import com.osterhoutgroup.sharedlibraryplugin.models.category.BaseCategory;
import com.osterhoutgroup.sharedlibraryplugin.models.productmodel.BaseProductModel;
import com.osterhoutgroup.sharedlibraryplugin.models.region.BaseRegion;
import com.osterhoutgroup.sharedlibraryplugin.models.screenshot.Screenshot;
import com.osterhoutgroup.sharedlibraryplugin.models.tester.BaseTester;

/**
 * @author wilbur.yu
 *
 */
@Entity
@Table(name = "application")
@SuppressWarnings("serial")
public class BaseApplication extends CreateAndUpdateTimes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "package_name")
    private String package_name;

    private String company;

    @Column(name = "icon")
    private String icon;

    @Column(name = "featured_img")
    private String featured_img;

    @Column(name = "featured_img_glasses")
    private String featured_img_glasses;

    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private BaseCategory category;

    @Column(name = "is_featured")
    private boolean is_featured;

    private Double price;

    @Column(name = "product_id")
    private String product_id;

    @Column(name = "customer_id")
    private String customer_id;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "is_published")
    private boolean is_published;

    @Column(name = "is_approved")
    private boolean is_approved;

    private String website;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "product_model_application", joinColumns = @JoinColumn(name = "application_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "product_model_id", referencedColumnName = "id"))
    @JsonProperty("product_models")
    private Set<BaseProductModel> productModels;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "application_region", joinColumns = @JoinColumn(name = "application_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "region_id", referencedColumnName = "id"))
    private Set<BaseRegion> regions;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "build_type_application", joinColumns = @JoinColumn(name = "application_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "build_type_id", referencedColumnName = "id"))
    @JsonProperty("build_types")
    private Set<BaseBuildType> buildTypes;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "application", cascade = CascadeType.ALL)
    @JsonProperty("screen_shots")
    private Set<Screenshot> screenshots;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "application", cascade = CascadeType.ALL)
    private Set<BaseTester> testers;

    @Column(name = "purchase_type")
    private int purchase_type;

    @Column(name = "subscription_type")
    private int subscription_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPackage_name(String name) {
        this.package_name = name;
    }

    public String getPackage_name() {
        return this.package_name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setFeatured_img(String img) {
        this.featured_img = img;
    }

    public String getFeatured_img() {
        return this.featured_img;
    }

    public void setFeatured_img_glasses(String img) {
        this.featured_img_glasses = img;
    }

    public String getFeatured_img_glasses() {
        return this.featured_img_glasses;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCategory(BaseCategory category) {
        this.category = category;
    }

    public BaseCategory getCategory() {
        return this.category;
    }

    public void setIs_featured(boolean featured) {
        this.is_featured = featured;
    }

    public boolean getIs_featured() {
        return this.is_featured;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setProduct_id(String id) {
        this.product_id = id;
    }

    public String getProduct_id() {
        return this.product_id;
    }

    public void setCustomer_id(String id) {
        this.customer_id = id;
    }

    public String getCustomer_id() {
        return this.customer_id;
    }

    public void setUser_id(Long id) {
        this.user_id = id;
    }

    public Long getUser_id() {
        return this.user_id;
    }

    public void setIs_published(boolean published) {
        this.is_published = published;
    }

    public boolean getIs_published() {
        return this.is_published;
    }

    public void setIs_approved(boolean approved) {
        this.is_approved = approved;
    }

    public boolean getIs_approved() {
        return this.is_approved;
    }

    public void setWebsite(String site) {
        this.website = site;
    }

    public String getWebsite() {
        return this.website;
    }

    public Set<BaseProductModel> getProductModels() {
        return productModels;
    }

    public void setProductModels(Set<BaseProductModel> productModels) {
        this.productModels = productModels;
    }

    public Set<BaseRegion> getRegions() {
        return regions;
    }

    public void setRegions(Set<BaseRegion> regions) {
        this.regions = regions;
    }

    public Set<BaseBuildType> getBuildTypes() {
        return buildTypes;
    }

    public void setBuildTypes(Set<BaseBuildType> buildTypes) {
        this.buildTypes = buildTypes;
    }

    public Set<Screenshot> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(Set<Screenshot> screenshots) {
        this.screenshots = screenshots;
    }

    public Set<BaseTester> getTesters() {
        return testers;
    }

    public void setTesters(Set<BaseTester> testers) {
        this.testers = testers;
    }

    public void setPurchase_type(int type) {
        this.purchase_type = type;
    }

    public int getPurchase_type() {
        return this.purchase_type;
    }

    public void setSubscription_type(int type) {
        this.subscription_type = type;
    }

    public int getSubscription_type(int type) {
        return this.subscription_type;
    }
}
