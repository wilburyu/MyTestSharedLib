/**
 * 
 */
package com.osterhoutgroup.sharedlibraryplugin.models.region;

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
@Table(name = "region")
@SuppressWarnings("serial")
public class BaseRegion implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String continent;

	private String country;

	private String code;

	private boolean active;

	public Long getId() {
		return this.id;
	}

    // need this one to save a query for adding it to referencing records
    public void setId(Long id) {
        this.id = id;
    }

    public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getActive() {
		return this.active;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BaseRegion region = (BaseRegion) o;

        return this.code.equals(region.code);
    }

    @Override
    public int hashCode() {
        return this.code.hashCode();
    }
}
