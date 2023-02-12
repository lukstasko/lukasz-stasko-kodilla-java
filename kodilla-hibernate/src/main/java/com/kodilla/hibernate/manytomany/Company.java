package com.kodilla.hibernate.manytomany;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name="Company.findCompanyByTheBeginningOfTheCompanyName",
        query = "SELECT * FROM COMPANIES "+
                "WHERE LEFT(COMPANY_NAME, LENGTH (:BEGINING_OF_COMPANY_NAME))= :BEGINING_OF_COMPANY_NAME",
        resultClass = Company.class

)
@Entity
@Table(name="COMPANIES")
public class Company {
    private int id;
    private String companyName;
    private List<Employee> employees=new ArrayList<>();

    public Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name="COMPANY_ID",unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name="COMPANY_NAME")
    public String getCompanyName() {
        return companyName;
    }

        @ManyToMany(cascade = CascadeType.ALL,mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
