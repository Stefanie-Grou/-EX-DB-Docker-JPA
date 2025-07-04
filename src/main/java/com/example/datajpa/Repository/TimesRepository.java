package com.example.datajpa.Repository;

import com.example.datajpa.entities.Times;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesRepository extends JpaRepository<Times,Long> {

}
