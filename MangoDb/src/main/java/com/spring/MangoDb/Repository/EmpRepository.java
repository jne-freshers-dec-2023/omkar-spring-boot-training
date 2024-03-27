package com.spring.MangoDb.Repository;

import com.spring.MangoDb.Model.EmpEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRepository extends MongoRepository<EmpEntity,Integer> {

}
