package com.lpastine.aopdemo.dao;

import org.springframework.stereotype.Repository;

/*
    The @Repository annotation makes this class available for component scanning.
    So that we can inject this implementation later on.
 */
@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public void addSillyMember() {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
    }
}
