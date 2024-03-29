package org.burdzi0.hermes.repository;

import org.burdzi0.hermes.model.entity.Statement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatementRepository extends JpaRepository<Statement, Long> {

	List<Statement> getAllByTitle(String title);
}
