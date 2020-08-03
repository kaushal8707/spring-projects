package com.spring.basics.app.componentscans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ComponentDao
{
    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

    public ComponentJdbcConnection getComponentJdbcConnection()
    {
        return componentJdbcConnection;
    }
    public void setJdbcConnection(ComponentJdbcConnection componentJdbcConnection)
    {
        this.componentJdbcConnection = componentJdbcConnection;
    }
}
