package org.burdzi0.hermes.service;

import org.burdzi0.hermes.model.dto.StatementDto;
import org.burdzi0.hermes.model.entity.Statement;

import java.util.List;

public interface StatementService {

	List<StatementDto> getByTitle(String title);
	StatementDto save(Statement statement);
	void delete(Statement statement);
	void delete(Long statementId);

}
