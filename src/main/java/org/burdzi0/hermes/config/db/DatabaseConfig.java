package org.burdzi0.hermes.config.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

	@Bean
	public DataSource getDataSource(@Autowired PostgresConfig config) {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(config.getDriver());
		dataSourceBuilder.url(config.getUrl());
		dataSourceBuilder.username(config.getUsername());
		dataSourceBuilder.password(config.getPassword());
		return dataSourceBuilder.build();
	}
}
