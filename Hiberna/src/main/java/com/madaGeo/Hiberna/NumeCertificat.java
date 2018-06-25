package com.madaGeo.Hiberna;

import javax.persistence.Embeddable;

@Embeddable
public class NumeCertificat {

	private String numeMic;
	private String numeFamilie;
	public String getNumeMic() {
		return numeMic;
	}
	public void setNumeMic(String numeMic) {
		this.numeMic = numeMic;
	}
	public String getNumeFamilie() {
		return numeFamilie;
	}
	public void setNumeFamilie(String numeFamilie) {
		this.numeFamilie = numeFamilie;
	}
	@Override
	public String toString() {
		return "NumeCertificat [numeMic=" + numeMic + ", numeFamilie=" + numeFamilie + "]";
	}
	
}
