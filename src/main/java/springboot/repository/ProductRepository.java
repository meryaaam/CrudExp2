package springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.model.Product;



public interface ProductRepository  extends JpaRepository<Product, Long> {
	
	List<Product> findByname(String name) ; 

}
