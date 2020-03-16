package springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "Pname")
	private String name;
	
	@Column(name = "Pprice")
	private float Price;

	@Column(name = "Qt")
	private int Qt;
	
	@Column(name = "Pcat")
	private String cat;
	
	
	public Product () {}
	
	
	public Product(String name, float price, int qt, String cat) {
	
		this.name = name;
		Price = price;
		Qt = qt;
		this.cat = cat;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCat() {
		return cat;
	}


	public void setCat(String cat) {
		this.cat = cat;
	}


	public float getPrice() {
		return Price;
	}


	public void setPrice(float price) {
		Price = price;
	}


	public int getQt() {
		return Qt;
	}


	public void setQt(int qt) {
		Qt = qt;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Price=" + Price + ", Qt=" + Qt + ", cat=" + cat + "]";
	}
	
	

}
