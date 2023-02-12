package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testFindCompanyByTheBeginningOfTheCompanyName(){

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
        List<Company> resultLIst=companyDao.findCompanyByTheBeginningOfTheCompanyName("SSo");

        //Then
        assertEquals(2,resultLIst.size());

        //CleanUp
        companyDao.deleteById(company1Id);
        companyDao.deleteById(company2Id);
        companyDao.deleteById(company3Id);
    }

    @Test
    void testFindEmployeeByLastname(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieLarckson = new Employee("Stephanie", "Larckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int johnSmithId= johnSmith.getId();
        employeeDao.save(stephanieLarckson);
        int stephanieLarcksonId=stephanieLarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId= lindaKovalsky.getId();

        //When
        List<Employee> resultList=employeeDao.findEmployeeByLastname("Larckson");

        //Then
        assertEquals(1,resultList.size());

        //CleanUp
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(stephanieLarcksonId);
        employeeDao.deleteById(lindaKovalskyId);


    }


    @Test
    void testSaveManytoMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId= softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId= dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId= greyMatter.getId();

        //Then
        assertNotEquals(0,softwareMachineId);
        assertNotEquals(0,dataMaestersId);
        assertNotEquals(0,greyMatterId);

        //CleanUp
          try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        }catch (Exception e){
            //do nothing
        }

    }

}
