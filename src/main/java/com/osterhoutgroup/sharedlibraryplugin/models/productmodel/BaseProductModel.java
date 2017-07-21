/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.productmodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.osterhoutgroup.sharedlibraryplugin.models.CreateAndUpdateTimes;

/**
 * @author wilbur.yu
 *
 */
@Entity
@Table(name = "product_model")
@SuppressWarnings("serial")
public class BaseProductModel extends CreateAndUpdateTimes implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String description;

	public Long getId() {
		return this.id;
	}

    // need this one to save a query for adding it to referencing records
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
