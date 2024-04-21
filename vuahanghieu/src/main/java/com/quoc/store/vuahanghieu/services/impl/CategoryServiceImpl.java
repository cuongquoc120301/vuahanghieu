package com.quoc.store.vuahanghieu.services.impl;

import com.quoc.store.vuahanghieu.entities.Category;
import com.quoc.store.vuahanghieu.payloads.CategoryDTO;
import com.quoc.store.vuahanghieu.repositories.CategoryRepository;
import com.quoc.store.vuahanghieu.services.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = this.categoryRepository.findAll();
        return categories.stream().map(category -> this.modelMapper.map(category, CategoryDTO.class)).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
        Category category = this.modelMapper.map(categoryDTO, Category.class);
        Category savedCategory = this.categoryRepository.save(category);
        return this.modelMapper.map(savedCategory, CategoryDTO.class);
    }

    @Override
    public void deleteCategory(String id) {
        Category category = this.categoryRepository.findById(id).get();
        this.categoryRepository.delete(category);
    }

    @Override
    public CategoryDTO updateCategory(String id, CategoryDTO categoryDTO) {
        Category category = this.categoryRepository.findById(id).get();
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());
        Category savedCategory = this.categoryRepository.save(category);
        return this.modelMapper.map(savedCategory, CategoryDTO.class);
    }

    @Override
    public CategoryDTO getSingleCategory(String id) {
        Category category = this.categoryRepository.findById(id).get();
        return this.modelMapper.map(category, CategoryDTO.class);
    }
}
