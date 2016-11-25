package market.model;

import java.io.Serializable;
import java.util.List;
/*import java.util.List;*/
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product  implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private Integer idproduct;
@Column(name="name")
private String name;
@Column(name="description")
private String description;
@Column(name="price")
private float price;
@Column(name="view")
private float view;
@Column(name="image")
private String image;
@Column(name="status")
private String status;
@ManyToOne()
@JoinColumn(name="idcategory")
private Category category;
@ManyToOne()
@JoinColumn(name="idsupplier")
private Supplier supplier;
@ManyToOne()
@JoinColumn(name="idlocation")
private Location locat;
@ManyToOne
@JoinColumn(name="idevent")
private Event event;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="product")
private Set<CartItem> listCartItem;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="product")
private Set<Comment> listComment;
@OneToOne(fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="product")
private Detailproduct detailproduct;
@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="product")
private List<OrderDetail> listorderdetail;
public Product() {
	
}

public Product(String name, String description, float price, float view, String image, Category category,
		Supplier supplier, Location locat, Event event, Set<CartItem> listCartItem, Detailproduct detailproduct,
		List<OrderDetail> listorderdetail, String status,Set<Comment> listComment) {
	super();
	this.name = name;
	this.description = description;
	this.price = price;
	this.view = view;
	this.image = image;
	this.category = category;
	this.supplier = supplier;
	this.locat = locat;
	this.event = event;
	this.listCartItem = listCartItem;
	this.detailproduct = detailproduct;
	this.listorderdetail = listorderdetail;
	this.status=status;
	this.listComment=listComment;
}


public Integer getIdproduct() {
	return idproduct;
}

public void setIdproduct(Integer idproduct) {
	this.idproduct = idproduct;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getView() {
	return view;
}
public void setView(float view) {
	this.view = view;
}

public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}

public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}
public Location getLocat() {
	return locat;
}
public void setLocat(Location locat) {
	this.locat = locat;
}

public Set<CartItem> getListCartItem() {
	return listCartItem;
}
public void setListCartItem(Set<CartItem> listCartItem) {
	this.listCartItem = listCartItem;
}
public Event getEvent() {
	return event;
}
public void setEvent(Event event) {
	this.event = event;
}

public Detailproduct getDetailproduct() {
	return detailproduct;
}
public void setDetailproduct(Detailproduct detailproduct) {
	this.detailproduct = detailproduct;
}

public List<OrderDetail> getListorderdetail() {
	return listorderdetail;
}
public void setListorderdetail(List<OrderDetail> listorderdetail) {
	this.listorderdetail = listorderdetail;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}


public Set<Comment> getListComment() {
	return listComment;
}

public void setListComment(Set<Comment> listComment) {
	this.listComment = listComment;
}

@Override
public String toString() {
	return "Product [idproduct=" + idproduct + ", name=" + name + ", description=" + description + ", price=" + price
			+ ", view=" + view + ", image=" + image + ", category=" + category + ", supplier=" + supplier + ", locat="
			+ locat + "]";
}


}
