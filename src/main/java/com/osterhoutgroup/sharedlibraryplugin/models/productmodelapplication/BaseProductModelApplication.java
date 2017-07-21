package com.osterhoutgroup.sharedlibraryplugin.models.productmodelapplication;

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
import com.osterhoutgroup.sharedlibraryplugin.models.productmodel.BaseProductModel;

@Entity
@Table(name = "product_model_application")
public class BaseProductModelApplication extends CreateAndUpdateTimes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_model_id")
    private BaseProductModel productModel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "application_id")
    private BaseApplication application;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BaseProductModel getProductModel() {
        return productModel;
    }

    public void setProductModel(BaseProductModel productModel) {
        this.productModel = productModel;
    }

    public BaseApplication getApplication() {
        return application;
    }

    public void setApplication(BaseApplication application) {
        this.application = application;
    }
}
