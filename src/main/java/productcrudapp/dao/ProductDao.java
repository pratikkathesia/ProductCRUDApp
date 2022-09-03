package productcrudapp.dao;

import javax.transaction.Transactional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import productcrudapp.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Creating Product
	@Transactional
	public void createProduct(Product product) 
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}

	// Get all products
	public List<Product> getProducts() 
	{
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	// Delete the single product
	@Transactional
	public void deleteProduct(int pid) 
	{
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}

	// Get the single product
	public Product getProduct(int pid) 
	{
		return this.hibernateTemplate.get(Product.class, pid);
	}
}
