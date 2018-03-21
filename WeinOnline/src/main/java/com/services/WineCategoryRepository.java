package com.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.WineCategory;
@Repository
public interface WineCategoryRepository extends JpaRepository<WineCategory,Long> {

}
