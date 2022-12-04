package com.intern.dto.programs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ActionsDetail{
    private ArrayList<Tariff> tariffs;
    private String type;
    private String name;
    private int id;
    private int hold_size;
}
