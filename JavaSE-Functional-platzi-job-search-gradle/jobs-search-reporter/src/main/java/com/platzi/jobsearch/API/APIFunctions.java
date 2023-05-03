package com.platzi.jobsearch.API;

import feign.Feign;
import feign.gson.GsonDecoder;
import sun.tools.jstat.Jstat;

public interface APIFunctions {

    static <T> T buildAPI(Class<T> clazz, String url) {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(clazz, url);
    }
}