package com.kodilla.hibernate.task;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name="TASKS_FINANCIALS")
public class TaskFinancialDetails {
    private int id;
    private BigDecimal prince;
    private boolean paid;

    public TaskFinancialDetails(){
    }

    public TaskFinancialDetails(BigDecimal prince, boolean paid) {
        this.prince = prince;
        this.paid = paid;
    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID",unique = true)
    public int getId() {
        return id;
    }

    @Column(name="PRICE")
    public BigDecimal getPrince() {
        return prince;
    }

    @Column(name="PAID")
    public boolean isPaid() {
        return paid;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrince(BigDecimal prince) {
        this.prince = prince;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }
}
