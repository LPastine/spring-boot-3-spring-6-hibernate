package com.lpastine.aopdemo.dao;

import org.springframework.stereotype.Repository;

/*
    The @Repository annotation makes this class available for component scanning.
    So that we can inject this implementation later on.
 */
@Repository
public class AccountDAOImpl implements AccountDAO {

    @Override
    public void addAccount() {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
