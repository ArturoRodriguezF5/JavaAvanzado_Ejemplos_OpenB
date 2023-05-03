package com.platzi.jobsearch.API;

import com.platzi.jobsearch.CLI.JobPosition;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: aplication/json")
public interface APIJobs {

    @RequestLine("GET /positions.json")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryMap);
}
