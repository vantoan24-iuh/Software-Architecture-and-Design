package vn.edu.iuh.fit.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.dto.ProductDTO;
import vn.edu.iuh.fit.entities.Product;
import vn.edu.iuh.fit.repository.ProductRepository;
import vn.edu.iuh.fit.services.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public Product createProduct(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setStock(dto.getStock());
        return repository.save(product);
    }


    @Override
    public Product updateProduct(Long id, ProductDTO dto) {
        return repository.findById(id).map(p -> {
            p.setName(dto.getName());
            p.setPrice(dto.getPrice());
            p.setDescription(dto.getDescription());
            p.setStock(dto.getStock());
            return repository.save(p);
        }).orElseThrow();
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
