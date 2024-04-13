package com.quoc.store.vuahanghieu.repositories;

import com.quoc.store.vuahanghieu.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
