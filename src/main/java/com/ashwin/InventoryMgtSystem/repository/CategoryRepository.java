package com.ashwin.InventoryMgtSystem.repository;

import com.ashwin.InventoryMgtSystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}