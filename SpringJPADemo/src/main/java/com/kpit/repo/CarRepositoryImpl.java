package com.kpit.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.kpit.pojo.Car;

@Repository
public class CarRepositoryImpl implements CarRepository {

	
	EntityManager em;
	
	public CarRepositoryImpl() {
		//META-INF/persistence.xml
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EMF :"+factory);
		em = factory.createEntityManager();
		System.out.println("EM :"+em);
		System.out.println("CarRepositoryImpl() ctor....");
	}
	
	@Override
	public void createCar(Car car) {
		// TODO Auto-generated method stub
		System.out.println("createCar(Car)...trying to persist...");
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(car);
		trans.commit();
	}

	@Override
	public void updateCar(Car car) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCar(int carid) {
		// TODO Auto-generated method stub

	}

	@Override
	public Car readCar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> readCars() {
		// TODO Auto-generated method stub
		return null;
	}

}
