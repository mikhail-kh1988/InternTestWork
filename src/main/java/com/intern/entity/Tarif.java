package com.intern.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tarif")
public class Tarif {

    @Id
    private int id;
    private int action_id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Rate rate;
}
