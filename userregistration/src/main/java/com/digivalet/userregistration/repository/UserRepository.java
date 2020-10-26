package com.digivalet.userregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digivalet.userregistration.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
