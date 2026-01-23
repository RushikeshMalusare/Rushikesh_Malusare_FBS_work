package pac;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Embeddable
public class StudAddress {

	String gaon;
	
	String city;
	
	public StudAddress() {
		super();
	}
	
	public StudAddress(String gaon, String city) {
		super();
		this.gaon = gaon;
		this.city = city;
	}

	public String getGaon() {
		return gaon;
	}

	public void setGaon(String gaon) {
		this.gaon = gaon;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
