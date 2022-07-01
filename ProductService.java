package productServ;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProductBean.Product;
import productRepo.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	public ProductRepository productRepo;
	public List<Product> getAllproduct()
	{
		
		List<Product> product=new ArrayList<>();
		productRepo.findAll().forEach(product::add);
		return product;

}
	public void addproduct(Product product) {
	productRepo.save(product);
		
	}
	public void updateproduct(String id, Product product) {
		productRepo.save(product);
	
	}
	public void deleteproduct(String id) {
		productRepo.deleteById(id);
		
	}
	
	
}
