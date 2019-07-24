package org.burdzi0.hermes.service;

import org.burdzi0.hermes.model.dto.StatementDto;
import org.burdzi0.hermes.model.entity.Statement;
import org.burdzi0.hermes.repository.StatementRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static org.burdzi0.hermes.model.dto.StatementDto.fromStatement;

@Service
public class StatementServiceImpl implements StatementService {

	private StatementRepository repository;

	public StatementServiceImpl(StatementRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<StatementDto> getByTitle(String title) {
		return repository.getAllByTitle(title)
				.stream()
				.map(StatementDto::fromStatement)
				.collect(Collectors.toList());
	}

	@Override
	public StatementDto save(Statement statement) {
		return fromStatement(repository.save(statement));
	}

	@Override
	public void delete(Statement statement) {
		repository.delete(statement);
	}

	@Override
	public void delete(Long statementId) {
		repository.deleteById(statementId);
	}
}
