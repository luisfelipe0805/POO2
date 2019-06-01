package br.edu.ifg.poo2.trabalhofinal.dao;

import java.net.URI;
import java.net.URISyntaxException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {
/**
 * Nao mexer nisso 
 * ainda nao sei o que fazer
 */
	
//	@Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/poo2");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("oobj.postgres");
//        return dataSource;
//    }
//	
//	@Bean
//	public JpaVendorAdapter jpaVendorAdapter(){
//		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//		adapter.setDatabase(Database.POSTGRESQL);
//		adapter.setShowSql(true);
//		adapter.setGenerateDdl(true);
//		adapter.setDatabasePlatform("org.postgresql.Driver");
//		adapter.setPrepareConnection(true);
//		return adapter;
//	}
}
