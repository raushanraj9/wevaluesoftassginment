package com.demo.repositories;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries if needed
}