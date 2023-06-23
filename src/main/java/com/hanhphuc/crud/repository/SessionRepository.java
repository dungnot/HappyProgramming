package com.hanhphuc.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hanhphuc.crud.entity.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Integer> {

}
