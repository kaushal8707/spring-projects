package com.spring.basics.app.cdi;
import com.spring.basics.app.jdbcdao.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CdiApplication
{
    private static Logger LOGGER= LoggerFactory.getLogger(CdiApplication.class);
    public static void main(String args[])
    {
        ApplicationContext applicationContext=SpringApplication.run(CdiApplication.class,args);
        CdiBusinessService cdiBusinessService= applicationContext.getBean(CdiBusinessService.class);
        LOGGER.info("{}   Dao-{}",cdiBusinessService,cdiBusinessService.getCdiDao());

    }
}
