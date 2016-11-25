package market.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="addressship")
public class AddressShipping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idaddressship;
@Column(name="housenumber")
private String housenumber;
@Column(name="streetname")
private String streetname;
@Column(name="city")
private String city;
@Column(name="district")
private String district;

@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@PrimaryKeyJoinColumn
private Customer customer;
public AddressShipping() {
	super();
}

public AddressShipping(String housenumber, String streetname, String city, String district, Customer customer) {
	super();
	this.housenumber = housenumber;
	this.streetname = streetname;
	this.city = city;
	this.district = district;
	this.customer = customer;
}

public String getHousenumber() {
	return housenumber;
}
public void setHousenumber(String housenumber) {
	this.housenumber = housenumber;
}
public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getIdaddressship() {
	return idaddressship;
}
public void setIdaddressship(int idaddressship) {
	this.idaddressship = idaddressship;
}

@Override
public String toString() {
	return "AddressShipping [idaddressship=" + idaddressship + ", housenumber=" + housenumber + ", streetname="
			+ streetname + ", city=" + city + ", district=" + district + ", customer=" + customer + "]";
}





}
