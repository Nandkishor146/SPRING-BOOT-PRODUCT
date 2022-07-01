package productRepo;

import org.springframework.data.repository.CrudRepository;

import ProductBean.Product;

public interface ProductRepository extends CrudRepository<Product,String> {

}
