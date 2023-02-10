package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 =new Product("Product 1.");
        Product product2 =new Product("Product 2.");
        Product product3 =new Product("Product 3.");

        Item item1=new Item(product1,new BigDecimal(10),5);
        Item item2=new Item(product2,new BigDecimal(20),1);
        Item item3=new Item(product3,new BigDecimal(30),2);

        Invoice invoice=new Invoice("Invoice 1");
        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceID= invoice.getId();
        int product1ID= product1.getId();
        int item1ID= item1.getId();

        //Then
        assertNotEquals(0,invoiceID);
        assertNotEquals(0,product1ID);
        assertNotEquals(0,item1ID);
        assertNotNull(item1.getInvoice().getId());

        //CleanUp
        invoiceDao.deleteById(invoiceID);
    }
}

