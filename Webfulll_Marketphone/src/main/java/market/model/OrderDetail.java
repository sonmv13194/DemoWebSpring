package market.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderdetail")
public class OrderDetail implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idorderdetail;
@Column(name="totalprice")
private double totalprice;
@Column(name="quantity")
private int quantity;
@Column(name="createdate")
private Date createdate;
@Column(name="status")
private String status;
@Column(name="lastupdate")
private Date lastupdate;
@ManyToOne
@JoinColumn(name="idproduct")
private Product product;
@ManyToOne
@JoinColumn(name="idcustomer")
private Customer customer;



public OrderDetail() {
	super();
}



public OrderDetail(double totalprice, int quantity, Date createdate, String status, Product product,
		Customer customer,Date lastupdate) {
	super();
	this.totalprice = totalprice;
	this.quantity = quantity;
	this.createdate = createdate;
	this.status = status;
	this.product = product;
	this.customer = customer;
	this.lastupdate=lastupdate;
}



public double getTotalprice() {
	return totalprice;
}

public void setTotalprice(double totalprice) {
	this.totalprice = totalprice;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public int getIdorderdetail() {
	return idorderdetail;
}

public void setIdorderdetail(int idorderdetail) {
	this.idorderdetail = idorderdetail;
}

public Date getCreatedate() {
	return createdate;
}

public void setCreatedate(Date createdate) {
	this.createdate = createdate;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public Date getLastupdate() {
	return lastupdate;
}



public void setLastupdate(Date lastupdate) {
	this.lastupdate = lastupdate;
}



@Override
public String toString() {
	return "OrderDetail [idorderdetail=" + idorderdetail + ", totalprice=" + totalprice + ", quantity=" + quantity
			+ ", createdate=" + createdate + ", status=" + status + ", product=" + product + ", customer=" + customer
			+ "]";
}




}
