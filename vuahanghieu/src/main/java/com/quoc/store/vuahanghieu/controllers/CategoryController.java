package com.quoc.store.vuahanghieu.controllers;

import com.quoc.store.vuahanghieu.configs.MessageUtil;
import com.quoc.store.vuahanghieu.payloads.CategoryDTO;
import com.quoc.store.vuahanghieu.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public CategoryDTO saveCategory(@RequestBody CategoryDTO categoryDTO) {
        return this.categoryService.saveCategory(categoryDTO);
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() {
        return this.categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public CategoryDTO getSingleCategory(@PathVariable(value = "id") String id) {
        return this.categoryService.getSingleCategory(id);
    }
    @DeleteMapping("/{id}")
    public Map<String, String> deleteCategory (@PathVariable(value = "id") String id){
        this.categoryService.deleteCategory(id);
        return MessageUtil.CategoryMessage.deletedSuccessfullyMessage;
    }

    @PutMapping("/{id}")
    public CategoryDTO updateCategory(@PathVariable(value = "id") String id, @RequestBody CategoryDTO categoryDTO) {
        return this.categoryService.updateCategory(id, categoryDTO);
    }

}
