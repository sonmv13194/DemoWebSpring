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
@Table(name="supplier")
public class Supplier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int idsupplier;
@Column(name="name")
private String name;

@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="supplier")
private List<Product> listproduct;
public Supplier() {
	super();
}

public Supplier(int idsupplier, String name) {
	super();
	this.idsupplier = idsupplier;
	this.name = name;
}

public int getIdsupplier() {
	return idsupplier;
}

public void setIdsupplier(int idsupplier) {
	this.idsupplier = idsupplier;
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


}
