package com.spring.basics.app.jdbcdao;
import com.spring.basics.app.componentscans.ComponentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.basics.app.componentscans")
public class ComponentScanApplication
{
    private static Logger LOGGER= LoggerFactory.getLogger(ComponentScanApplication.class);
    public static void main(String args[])
    {
        ApplicationContext applicationContext=SpringApplication.run(ComponentScanApplication.class,args);
        ComponentDao componentDao= applicationContext.getBean(ComponentDao.class);
        LOGGER.info("{}",componentDao);
        LOGGER.info("{}",componentDao.getComponentJdbcConnection());
    }
}
