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
@Table(name="detailproduct")
public class Detailproduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int iddetailproduct;
@Column(name="cpu")
private String cpu;
@Column(name="chipset")
private String chipset;
@Column(name="ram")
private String ram;
@Column(name="hdd")
private String hdd;
@Column(name="graphic")
private String graphic;
@Column(name="weight")
private String weight;
@Column(name="os")
private String os;
@Column(name="screen")
private String screen;
@Column(name="microsd")
private String microsd;
@Column(name="camera")
private String camera;
@Column(name="connection")
private String connection;
@Column(name="batteries")
private String batteries;
@Column(name="size")
private String size;
@Column(name="optical")
private String optical;
@Column(name="display")
private String display;
@Column(name="network")
private String network;
@Column(name="io")
private String io;
@Column(name="other")
private String other;
@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
@PrimaryKeyJoinColumn
private Product product;
public Detailproduct() {
	super();
}
public int getIddetailproduct() {
	return iddetailproduct;
}

public void setIddetailproduct(int iddetailproduct) {
	this.iddetailproduct = iddetailproduct;
}

public String getCpu() {
	return cpu;
}

public void setCpu(String cpu) {
	this.cpu = cpu;
}

public String getChipset() {
	return chipset;
}

public void setChipset(String chipset) {
	this.chipset = chipset;
}

public String getRam() {
	return ram;
}

public void setRam(String ram) {
	this.ram = ram;
}

public String getHdd() {
	return hdd;
}

public void setHdd(String hdd) {
	this.hdd = hdd;
}

public String getGraphic() {
	return graphic;
}

public void setGraphic(String graphic) {
	this.graphic = graphic;
}

public String getWeight() {
	return weight;
}

public void setWeight(String weight) {
	this.weight = weight;
}

public String getOs() {
	return os;
}

public void setOs(String os) {
	this.os = os;
}

public Product getProduct() {
	return product;
}



public void setProduct(Product product) {
	this.product = product;
}



public String getScreen() {
	return screen;
}
public void setScreen(String screen) {
	this.screen = screen;
}
public String getMicrosd() {
	return microsd;
}
public void setMicrosd(String microsd) {
	this.microsd = microsd;
}
public String getCamera() {
	return camera;
}
public void setCamera(String camera) {
	this.camera = camera;
}
public String getConnection() {
	return connection;
}
public void setConnection(String connection) {
	this.connection = connection;
}
public String getBatteries() {
	return batteries;
}
public void setBatteries(String batteries) {
	this.batteries = batteries;
}
public String getSize() {
	return size;
}
public String getOptical() {
	return optical;
}
public void setOptical(String optical) {
	this.optical = optical;
}
public String getDisplay() {
	return display;
}
public void setDisplay(String display) {
	this.display = display;
}
public String getNetwork() {
	return network;
}
public void setNetwork(String network) {
	this.network = network;
}
public String getIo() {
	return io;
}
public void setIo(String io) {
	this.io = io;
}
public void setSize(String size) {
	this.size = size;
}
public String getOther() {
	return other;
}
public void setOther(String other) {
	this.other = other;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public String toString() {
	return "Detailproduct [iddetailproduct=" + iddetailproduct + ", cpu=" + cpu + ", chipset=" + chipset + ", ram="
			+ ram + ", hdd=" + hdd + ", graphic=" + graphic + ", weight=" + weight + ", os=" + os + ", screen=" + screen
			+ ", microsd=" + microsd + ", camera=" + camera + ", connection=" + connection + ", batteries=" + batteries
			+ ", size=" + size + ", optical=" + optical + ", display=" + display + ", network=" + network + ", io=" + io
			+ ", other=" + other + ", product=" + product + "]";
}





}
