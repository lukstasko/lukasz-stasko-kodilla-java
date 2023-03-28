package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SearchServiceFacadeTest {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private SearchServiceFacade searchServiceFacade;


    @Test
    void findCompany() {
        //Given
        Company company1 = new Company("SSoftware Machine");
        Company company2 = new Company("SSoftware Maesters");
        Company company3 = new Company("Grey Matter");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        int company1Id= company1.getId();
        int company2Id= company2.getId();
        int company3Id= company3.getId();

        //When
        List<Company> resultLIst=searchServiceFacade.findCompany("Soft");

        //Then
        assertEquals(2,resultLIst.size());

        //CleanUp
        companyDao.deleteById(company1Id);
        companyDao.deleteById(company2Id);
        companyDao.deleteById(company3Id);
    }

    @Test
    void findEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieLarckson = new Employee("Stephanie", "Larckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieLarckson);
        employeeDao.save(lindaKovalsky);

        int johnSmithId= johnSmith.getId();
        int stephanieLarcksonId=stephanieLarckson.getId();
        int lindaKovalskyId= lindaKovalsky.getId();

        //When
        List<Employee> resultList=searchServiceFacade.findEmployee("Larc");

        //Then
        assertEquals(1,resultList.size());

        //CleanUp
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(stephanieLarcksonId);
        employeeDao.deleteById(lindaKovalskyId);


    }
}