package org.burdzi0.hermes.model.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.StringJoiner;

import static java.time.ZonedDateTime.now;

@Entity
@Table(name = "HERMES_STATEMENTS")
public class Statement {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "USER_ID", nullable = false)
	private User author;

	private ZonedDateTime created;

	@Column(nullable = false)
	private String title;

	@Lob
	private String content;

	public Statement() {
	}

	public Statement(User author, String title, String content) {
		this.author = author;
		this.title = title;
		this.content = content;
		this.created = now();
	}

	public Statement(User author, ZonedDateTime created, String title, String content) {
		this.author = author;
		this.created = created;
		this.title = title;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public ZonedDateTime getCreated() {
		return created;
	}

	public void setCreated(ZonedDateTime created) {
		this.created = created;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		Statement statement = (Statement) object;
		return Objects.equals(id, statement.id) &&
				Objects.equals(author, statement.author) &&
				Objects.equals(created, statement.created) &&
				Objects.equals(title, statement.title) &&
				Objects.equals(content, statement.content);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, author, created, title, content);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Statement.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("author=" + author)
				.add("created=" + created)
				.add("title='" + title + "'")
				.add("content='" + content + "'")
				.toString();
	}
}
