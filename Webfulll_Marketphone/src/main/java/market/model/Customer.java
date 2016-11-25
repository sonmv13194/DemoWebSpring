package market.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idcustomer;
@Column(name="name")
private String 	name;
@Column(name="email")
private String email;
@Column(name="age")
private String age;
@Column(name="phonenumber")
private String phonenumber;
@Column(name="streetname")
private String streetname;


@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="customer")
private List<OrderDetail> listdetail;
@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="customer")
private Set<Comment> listComment;
public Customer() {
	super();
}

public Customer( String name, String email, String age, String phonenumber, String streetname) {
	super();
	this.name = name;
	this.email = email;
	this.age = age;
	this.phonenumber = phonenumber;
	this.streetname = streetname;
}


public int getIdcustomer() {
	return idcustomer;
}
public void setIdcustomer(int idcustomer) {
	this.idcustomer = idcustomer;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}

public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}

public List<OrderDetail> getListdetail() {
	return listdetail;
}

public void setListdetail(List<OrderDetail> listdetail) {
	this.listdetail = listdetail;
}

public Set<Comment> getListComment() {
	return listComment;
}

public void setListComment(Set<Comment> listComment) {
	this.listComment = listComment;
}

@Override
public String toString() {
	return "Customer [idcustomer=" + idcustomer + ", name=" + name + ", email=" + email + ", age=" + age
			+ ", phonenumber=" + phonenumber + ", streetname=" + streetname +  "]";
}
}
