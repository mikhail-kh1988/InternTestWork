package com.intern.dto.programs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Tariff{
    private int action_id;
    private int id;
    private String name;
    private ArrayList<Rate> rates;
}
