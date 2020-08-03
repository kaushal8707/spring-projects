package com.spring.basics.app.cdi;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusinessService
{
    @Inject
    CdiDao cdiDao;

    public CdiDao getCdiDao() { return cdiDao; }
    public void setCdiDao(CdiDao cdiDao) { this.cdiDao = cdiDao; }
}
