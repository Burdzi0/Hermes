package org.burdzi0.hermes.repository;

import org.burdzi0.hermes.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
