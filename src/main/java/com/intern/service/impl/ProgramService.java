package com.intern.service.impl;

import com.intern.client.ProgramClient;
import com.intern.dto.Programs;
import com.intern.dto.programs.Result;
import com.intern.service.IProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramService implements IProgramService {


    @Autowired
    private ProgramClient programClient;

    private final String AUTH = "Bearer EOi22Mj0NrlTuHDpv5NPYwNM9iYBr9";

    @Override
    public List<String> getNamesResults() {

        Programs programs = programClient.getProgram(AUTH, 5);

        ArrayList<String> arrayList = new ArrayList<>();

        for (Result res: programs.getResults()) {
            arrayList.add(res.getName());
        }

        return arrayList;
    }
}
