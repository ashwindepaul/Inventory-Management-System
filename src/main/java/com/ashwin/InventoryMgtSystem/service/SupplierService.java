package com.ashwin.InventoryMgtSystem.service;

import com.ashwin.InventoryMgtSystem.dtos.Response;
import com.ashwin.InventoryMgtSystem.dtos.SupplierDTO;

public interface SupplierService {
	Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);
}
