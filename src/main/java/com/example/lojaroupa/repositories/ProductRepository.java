package com.example.lojaroupa.repositories;

import com.example.lojaroupa.models.ProductModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{
    
}
