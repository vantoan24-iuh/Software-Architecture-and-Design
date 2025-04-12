package vn.edu.iuh.fit.services;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.dto.ProductDTO;
import vn.edu.iuh.fit.entities.Product;

import java.util.List;

@Service
public interface ProductService {
    Product createProduct(ProductDTO dto);
    Product updateProduct(Long id, ProductDTO dto);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
}
