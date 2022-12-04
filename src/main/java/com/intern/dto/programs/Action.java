package com.intern.dto.programs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Action{
    private int id;
    private String name;
    private String type;
    private String payment_size;
    private int hold_time;
}
