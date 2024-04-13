package com.quoc.store.vuahanghieu.repositories;

import com.quoc.store.vuahanghieu.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
