package com.ashwin.InventoryMgtSystem.service;



import com.ashwin.InventoryMgtSystem.dtos.LoginRequest;
import com.ashwin.InventoryMgtSystem.dtos.RegisterRequest;
import com.ashwin.InventoryMgtSystem.dtos.Response;
import com.ashwin.InventoryMgtSystem.dtos.UserDTO;
import com.ashwin.InventoryMgtSystem.model.User;

public interface UserService {
	Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);

}
