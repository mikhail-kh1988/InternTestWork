package com.intern.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "rate")
public class Rate {

    @Id
    private int id;
    private BigDecimal price_s;
    private float size;
    private int tariff_id;
    private String country;
    private LocalDate date_s;
    private boolean is_percentage;

}
