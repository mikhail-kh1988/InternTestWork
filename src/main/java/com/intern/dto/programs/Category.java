package com.intern.dto.programs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category{
    private String name;
    private int id;
    private String language;
    private Parent parent;
}
