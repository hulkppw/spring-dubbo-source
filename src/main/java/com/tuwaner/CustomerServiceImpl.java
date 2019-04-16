package com.tuwaner;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * @author
 * @date 2019/4/16
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    public CustomerServiceImpl(){
        System.out.println("初始化");
    }

    private String name;
    private String url;
    public void setName(String name) {
        this.name = name;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Lookup
    public ProviderService getNotification() {
        return null;
    }

    @Override
    public void printName() {
        System.out.println("Customer name : " + this.name);
    }
    @Override
    public void printURL() {
        System.out.println("Customer website : " + this.url);
    }
}
