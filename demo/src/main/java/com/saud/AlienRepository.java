package com.saud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends JpaRepository<Alien, Integer> {

}
