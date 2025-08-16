package com.ashwin.InventoryMgtSystem.service;

import com.ashwin.InventoryMgtSystem.dtos.CategoryDTO;
import com.ashwin.InventoryMgtSystem.dtos.Response;

public interface CategoryService {
	Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
