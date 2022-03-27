package com.carlosrobson.bookstoremanager.users.repository;

import com.carlosrobson.bookstoremanager.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
