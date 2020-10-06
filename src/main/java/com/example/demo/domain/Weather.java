package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;

//https://www.logicbig.com/tutorials/misc/jackson/json-type-info-with-logical-type-name.html

@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT, use= JsonTypeInfo.Id.NAME)
@JsonTypeName("weather")
public class Weather {

    private List<Climate> records; //= new ArrayList<Data>();

    public Weather() {
        records = new ArrayList<Climate>();
    }

    public void add(Climate climate) {
        records.add(climate);
    }

    public List<Climate> getRecords() {
        return records;
    }

    public void setRecords(List<Climate> records) {
        this.records = records;
    }
}

