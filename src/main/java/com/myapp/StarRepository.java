package com.myapp;

import org.springframework.data.repository.CrudRepository;
import com.myapp.unit;

// spring이 repository 자동 생성

public interface StarRepository extends CrudRepository<unit, Integer>{

}