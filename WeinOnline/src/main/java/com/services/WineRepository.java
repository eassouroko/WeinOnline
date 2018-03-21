package com.services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Wine;
@Repository
public interface WineRepository extends JpaRepository<Wine,Long> {

}
