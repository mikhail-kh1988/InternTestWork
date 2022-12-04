package com.intern.dto.programs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rate{
    private String price_s;
    private String size;
    private int tariff_id;
    private Object country;
    private String date_s;
    private boolean is_percentage;
    private int id;
}
