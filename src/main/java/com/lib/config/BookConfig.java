package com.lib.config;

import com.lib.controller.BookController;
import com.lib.manager.BookManager;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration

public class BookConfig {


    @Bean
    public DataSource dataSource(){
        DataSource dataSource=DataSourceBuilder.create().driverClassName("org.postgresql.Driver").password("admin").username("postgres").url("jdbc:postgresql://localhost:5432/Library").build();
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean=new LocalContainerEntityManagerFactoryBean();
        JpaVendorAdapter vendorAdapter=new HibernateJpaVendorAdapter();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPackagesToScan("com.lib.domain");
        entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
        entityManagerFactoryBean.setJpaProperties(jpaProperties());
        entityManagerFactoryBean.setPersistenceUnitName("books");
        return entityManagerFactoryBean;
    }

    Properties jpaProperties(){
        Properties prop=new Properties();
        prop.setProperty("hibernate.show_sql","true");
        prop.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
        return prop;
    }
}
