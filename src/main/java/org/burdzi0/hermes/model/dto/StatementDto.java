package org.burdzi0.hermes.model.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.burdzi0.hermes.model.entity.Statement;

import java.time.ZonedDateTime;

public class StatementDto {

	private long id;
	private long authorId;
	private ZonedDateTime created;
	private String title;
	private String content;

	@JsonCreator
	public StatementDto(@JsonProperty long id,
	                    @JsonProperty("author-id") long authorId,
	                    @JsonProperty ZonedDateTime created,
	                    @JsonProperty String title,
	                    @JsonProperty String content) {
		this.id = id;
		this.authorId = authorId;
		this.created = created;
		this.title = title;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public long getAuthorId() {
		return authorId;
	}

	public ZonedDateTime getCreated() {
		return created;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public static StatementDto fromStatement(Statement statement) {
		return new StatementDto(
				statement.getId(),
				statement.getAuthor().getId(),
				statement.getCreated(),
				statement.getTitle(),
				statement.getContent()
		);
	}
}
