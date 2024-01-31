package com.kpit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.pojo.Car;


//persistence.xml no need
//no need to implement CarRepositoryImpl
// no need of EMF
//no need of EM
// no carConfig.xml
//no pom.xml managmenent in a manual way
// no need of EntityTransaction  -- use @Transactional annotation


@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

}
//SimpleJpaRepository