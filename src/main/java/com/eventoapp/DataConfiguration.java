package com.eventoapp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {
	
	@Bean
	public DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.msql.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost3306/eventosapp");
	dataSource.setUsername("root");
	dataSource.setPassword("leo5907");
	return dataSource;
	
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
	HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	adapter.setDatabase(Database.MYSQL);
	adapter.setShowSql(true);
	adapter.setGenerateDdl(true);
	adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
	adapter.setPrepareConnection(true);
	return adapter;
	}
}
