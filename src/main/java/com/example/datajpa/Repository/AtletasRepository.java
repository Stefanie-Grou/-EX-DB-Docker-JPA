package com.example.datajpa.Repository;

import com.example.datajpa.entities.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtletasRepository extends JpaRepository<Atleta,Long> {
}
