package com.intern.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "action_details")
public class ActionDetails {

    @Id
    private int id;
    private String type;
    private String name;
    private int hold_size;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Tarif> tariffs;
}
