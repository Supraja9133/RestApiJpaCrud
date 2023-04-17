package com.SpringbootRestApiJPACRUD333.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringbootRestApiJPACRUD333.entity.User;

public interface UserRepo extends JpaRepository<User,Long> {

}
