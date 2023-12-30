package com.vimoc.depart.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vimoc.depart.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}