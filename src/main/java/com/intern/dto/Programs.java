package com.intern.dto;

import com.intern.dto.programs.Meta;
import com.intern.dto.programs.Result;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Programs {
    private ArrayList<Result> results;
    private Meta _meta;
}
