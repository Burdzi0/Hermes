package org.burdzi0.hermes.repository;

import org.burdzi0.hermes.model.entity.Statement;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatementRepository extends JpaRepository<Statement, Long> {

	Page<Statement> getAllByTitle(String title);
}
