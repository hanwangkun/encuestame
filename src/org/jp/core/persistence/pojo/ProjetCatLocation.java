package org.jp.core.persistence.pojo;

// Generated 29-may-2009 13:17:50 by Hibernate Tools 3.2.2.GA

/**
 * ProjetCatLocation generated by hbm2java
 */
public class ProjetCatLocation implements java.io.Serializable {

	private ProjetCatLocationId id;
	private Boolean state;

	public ProjetCatLocation() {
	}

	public ProjetCatLocation(ProjetCatLocationId id) {
		this.id = id;
	}

	public ProjetCatLocation(ProjetCatLocationId id, Boolean state) {
		this.id = id;
		this.state = state;
	}

	public ProjetCatLocationId getId() {
		return this.id;
	}

	public void setId(ProjetCatLocationId id) {
		this.id = id;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

}
