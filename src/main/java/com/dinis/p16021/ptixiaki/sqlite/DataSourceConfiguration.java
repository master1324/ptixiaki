package com.dinis.p16021.ptixiaki.sqlite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {
	
	
	@Bean
	public DataSource dataSource() {
	    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("org.sqlite.JDBC");
	    dataSource.setUrl("jdbc:sqlite:api.db");
	    dataSource.setUsername("sa");
	    dataSource.setPassword("sa");
	    return dataSource;
	}

}
