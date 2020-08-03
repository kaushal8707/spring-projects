package com.spring.basics.app.jdbcdao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class ScopeApplication
{
    private static Logger LOGGER= LoggerFactory.getLogger(ScopeApplication.class);
    public static void main(String args[])
    {
        ApplicationContext applicationContext=SpringApplication.run(ScopeApplication.class,args);
        PersonDao personDao1= applicationContext.getBean(PersonDao.class);
        LOGGER.info("{}",personDao1);
        LOGGER.info("{}",personDao1.getJdbcConnection());
        LOGGER.info("{}",personDao1.getJdbcConnection());

        PersonDao personDao2= applicationContext.getBean(PersonDao.class);
        LOGGER.info("{}",personDao2);
        LOGGER.info("{}",personDao2.getJdbcConnection());
        ApplicationContext applicationContext1=SpringApplication.run(ScopeApplication.class,args);
        PersonDao personDaotemp= applicationContext1.getBean(PersonDao.class);
        LOGGER.info("{}",personDaotemp);

    }
}
