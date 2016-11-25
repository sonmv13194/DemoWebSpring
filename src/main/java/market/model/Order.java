package market.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private int idorder;
@Column(name="nameorder")
private String nameorder;
@Column(name="email")
private String email;
@Column(name="phonenumber")
private String phonenumber;
@Column(name="address")
private String address;

public Order() {
	super();
}


public Order(String nameorder, String email, String phonenumber, String address, List<OrderDetail> listdetail) {
	super();
	this.nameorder = nameorder;
	this.email = email;
	this.phonenumber = phonenumber;
	this.address = address;
}


public int getIdorder() {
	return idorder;
}

public void setIdorder(int idorder) {
	this.idorder = idorder;
}

public String getNameorder() {
	return nameorder;
}

public void setNameorder(String nameorder) {
	this.nameorder = nameorder;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Order [idorder=" + idorder + ", nameorder=" + nameorder + ", email=" + email + ", phonenumber="
			+ phonenumber + ", address=" + address + "]";
}

}
