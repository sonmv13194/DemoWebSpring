package market.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
@Id
@GeneratedValue
private int idcomment;
@Column(name="content")
private String content;
@ManyToOne
@JoinColumn(name="idcustomer")
private Customer customer;
@ManyToOne
@JoinColumn(name="idproduct")
private Product product;
public Comment() {
	super();
}

public Comment(String content, Customer customer, Product product) {
	super();
	this.content = content;
	this.customer = customer;
	this.product = product;
}

public int getIdcomment() {
	return idcomment;
}
public void setIdcomment(int idcomment) {
	this.idcomment = idcomment;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}

}
