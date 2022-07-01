package productControl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ProductBean.Product;
import productServ.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;

	@RequestMapping("/products")
	public List<Product> getallproduct() {
		return productservice.getAllproduct();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addproduct(@RequestBody Product product) {

		productservice.addproduct(product);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
	public void updateproduct(@PathVariable String id, @RequestBody Product product) {

		productservice.updateproduct(id, product);

	}

	public void deleteproduct(@PathVariable String id) {
		productservice.deleteproduct(id);

	}

}
