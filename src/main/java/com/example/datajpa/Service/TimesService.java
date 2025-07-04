package com.example.datajpa.Service;

import com.example.datajpa.Repository.TimesRepository;
import com.example.datajpa.entities.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimesService {

    @Autowired
    private TimesRepository timesRepository;

    public Times createTimes(Times times){
        return timesRepository.save(times);
    }
}
