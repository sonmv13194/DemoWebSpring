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
@Table(name="category")
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idcategory;
@Column(name="name")
private String name;

@OneToMany(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER,mappedBy="category")
private List<Product> listproduct;
public Category() {
	// TODO Auto-generated constructor stub
}


public Category(int idcategory, String name) {
	super();
	this.idcategory = idcategory;
	this.name = name;
}


public int getIdcategory() {
	return idcategory;
}
public void setIdcategory(int idcategory) {
	this.idcategory = idcategory;
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
	return "Category [idcategory=" + idcategory + ", name=" + name + ", listproduct=" + listproduct + "]";
}



}

