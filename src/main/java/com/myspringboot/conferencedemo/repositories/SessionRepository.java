package com.myspringboot.conferencedemo.repositories;

import com.myspringboot.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
