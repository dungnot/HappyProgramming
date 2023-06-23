package com.hanhphuc.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.hanhphuc.crud.entity.Times;

@Repository
public interface TimeRepository extends JpaRepository<Times, Integer> {

}
