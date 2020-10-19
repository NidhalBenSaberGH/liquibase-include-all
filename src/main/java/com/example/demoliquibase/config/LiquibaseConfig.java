package com.example.demoliquibase.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class LiquibaseConfig {

    private static final  String CHANGELOGFILE="classpath:/db/changelog/db.changelog-master.xml";

    private static final String LIQUIBASESCHEMA="myschema";

    @Autowired
    private DataSource dataSource;

    @Bean
    public SpringLiquibase liquibase() {
        final SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog(CHANGELOGFILE);
        liquibase.setDefaultSchema(LIQUIBASESCHEMA);
        liquibase.setDataSource(dataSource);
        return liquibase;
    }

}
