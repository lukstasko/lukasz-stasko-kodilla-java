package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceFacade {

     private final CompanyDao companyDao;
     private final EmployeeDao employeeDao;

     @Autowired
     public SearchServiceFacade(final CompanyDao companyDao, final EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompany(String partOfCompanyName) {
         return companyDao.findCompanyByThePartOfTheCompanyName("%"+partOfCompanyName+"%");
    }

    public List<Employee> findEmployee(String partOFEmployeeLastname){
         return employeeDao.findEmployeeByPartOfLastname("%"+partOFEmployeeLastname+"%");
    }

}
