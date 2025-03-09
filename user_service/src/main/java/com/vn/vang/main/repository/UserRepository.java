package com.vn.vang.main.repository;

import com.vn.vang.main.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserRepository
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}