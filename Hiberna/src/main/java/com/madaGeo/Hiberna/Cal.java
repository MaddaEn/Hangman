package com.madaGeo.Hiberna;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
// @Table(name = "horse")
public class Cal {
	@Id
	private int cId;
	// @Column(name = "horse_name")
	private NumeCertificat cName;
	// @Transient
	private String cColor;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcColor() {
		return cColor;
	}

	public void setcColor(String cColor) {
		this.cColor = cColor;
	}

	public NumeCertificat getcName() {
		return cName;
	}

	public void setcName(NumeCertificat cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Cal [cId=" + cId + ", cName=" + cName + ", cColor=" + cColor + "]";
	}

}
