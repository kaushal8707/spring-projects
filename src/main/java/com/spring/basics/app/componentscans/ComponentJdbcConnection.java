package com.spring.basics.app.componentscans;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
@Component
public class ComponentJdbcConnection
{
    public ComponentJdbcConnection()
    {
        System.out.println("JDBC connection created");
    }
}
