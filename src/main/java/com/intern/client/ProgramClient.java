package com.intern.client;

import com.intern.dto.Programs;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "program", url = "https://api.admitad.com/advcampaigns/website/2090016")
public interface ProgramClient {
    @GetMapping(value = "/?limit={limit}")
    Programs getProgram(@RequestHeader(value = "Authorization") String authHeader, @PathVariable int limit);
}
