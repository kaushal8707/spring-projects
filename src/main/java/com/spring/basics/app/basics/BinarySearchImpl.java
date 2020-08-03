package com.spring.basics.app.basics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
    Logger LOGGER= LoggerFactory.getLogger(BinarySearchImpl.class);
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public int binarySearch(int numbers[], int searchNumber)
    {
        int[] sortedArrays=sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
    @PostConstruct
    public void postConstruct()
    {
        LOGGER.info("postConstruct");
    }
    @PreDestroy
    public void preDestroy()
    {
        LOGGER.info("preDestroy");
    }
}
