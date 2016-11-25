package market.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idlocation;
@Column(name="name")
private String name;

@OneToMany(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER,mappedBy="locat",orphanRemoval=true)
private List<Product> listproduct;
public Location() {
	
}
public Location(int idlocation, String name) {
	this.idlocation = idlocation;
	this.name = name;
}
public int getIdlocation() {
	return idlocation;
}
public void setIdlocation(int idlocation) {
	this.idlocation = idlocation;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public List<Product> getListproduct() {
	return listproduct;
}
public void setListproduct(List<Product> listproduct) {
	this.listproduct = listproduct;
}
@Override
public String toString() {
	return "Location [idlocation=" + idlocation + ", name=" + name + "]";
}

}
