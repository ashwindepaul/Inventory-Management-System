package com.ashwin.InventoryMgtSystem.repository;

import com.ashwin.InventoryMgtSystem.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
