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
@Table(name="event")
public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idevent;
@Column(name="name")
private String name;
@Column(name="description")
private String description;
@Column(name="image")
private String image;
@Column(name="image1")
private String image1;
@Column(name="image2")
private String image2;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="event")
private List<Product> product;
public List<Product> getProduct() {
	return product;
}

public void setProduct(List<Product> product) {
	this.product = product;
}

public Event() {
	super();
}

public Event(int idevent, String name, String description) {
	super();
	this.idevent = idevent;
	this.name = name;
	this.description = description;
}

public int getIdevent() {
	return idevent;
}

public void setIdevent(int idevent) {
	this.idevent = idevent;
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

public static long getSerialversionuid() {
	return serialVersionUID;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public String getImage1() {
	return image1;
}

public void setImage1(String image1) {
	this.image1 = image1;
}

public String getImage2() {
	return image2;
}

public void setImage2(String image2) {
	this.image2 = image2;
}

@Override
public String toString() {
	return "Event [idevent=" + idevent + ", name=" + name + ", description=" + description + "]";
}


}
