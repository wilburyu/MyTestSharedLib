/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.category;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wilbur.yu
 *
 */
@Entity
@Table(name = "category")
@SuppressWarnings("serial")
public class BaseCategory implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

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
}
