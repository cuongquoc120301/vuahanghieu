package com.quoc.store.vuahanghieu.services;

import com.quoc.store.vuahanghieu.payloads.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO saveCategory(CategoryDTO categoryDTO);
    void deleteCategory(String id);
    CategoryDTO updateCategory(String id, CategoryDTO categoryDTO);
    CategoryDTO getSingleCategory(String id);
}
