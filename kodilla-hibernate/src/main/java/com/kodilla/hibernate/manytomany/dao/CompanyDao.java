package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company,Integer> {

    @Query(nativeQuery = true)
    List<Company> findCompanyByTheBeginningOfTheCompanyName(@Param("BEGINNING_OF_COMPANY_NAME") String beginningOfCompanyName);

    @Query(nativeQuery = true)
    List<Company> findCompanyByThePartOfTheCompanyName(@Param("PART_OF_COMPANY_NAME") String partOfCompanyName);

}
