package productcrudapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product 
{ 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String name;
	public String Description;
	public long price;
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getDescription() 
	{
		return Description;
	}
	
	public void setDescription(String description) 
	{
		Description = description;
	}
	public long getPrice() 
	{
		return price;
	}
	
	public void setPrice(long price) 
	{
		this.price = price;
	}
	
	public Product(int id, String name, String description, long price) 
	{
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.price = price;
	}
	
	public Product() 
	{
		super();
	}
	
	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + ", Description=" + Description + ", price=" + price + "]";
	}
	
	
	
	
}