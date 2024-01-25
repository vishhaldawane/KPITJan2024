package com.kpit.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.kpit.pojo.Car;

@Repository
public class CarRepositoryImpl implements CarRepository {

	EntityManager manager;
		
	public CarRepositoryImpl() {
		super();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("CarRepositoryImpl: Factory : "+factory);
		
		manager = factory.createEntityManager();
		System.out.println("CarRepositoryImpl: manager : "+manager);
		
	}

	@Override
	public void createCar(Car car) {
		System.out.println("CarRepositoryImpl: createCar(Car);");

		EntityTransaction trans = manager.getTransaction();
		trans.begin();
			manager.persist(car);
		trans.commit();

	}

	@Override
	public void updateCar(Car car) {
		System.out.println("CarRepositoryImpl: updateCar(Car);");

		EntityTransaction trans = manager.getTransaction();
		trans.begin();
			manager.merge(car);
		trans.commit();

	}

	@Override
	public void deleteCar(int carid) {
		System.out.println("CarRepositoryImpl: deleteCar(int);");

		EntityTransaction trans = manager.getTransaction();
		trans.begin();
			Car foundCar = manager.find(Car.class, carid);
			manager.remove(foundCar);
		trans.commit();

	}

	@Override
	public Car readCar(int carid) {
		System.out.println("CarRepositoryImpl: readCar(int);");

			Car foundCar = manager.find(Car.class, carid);
		return foundCar;
	}

	@Override
	public List<Car> readCars() {
		System.out.println("CarRepositoryImpl: readCars();");
		List carList = new ArrayList<Car>();
		Query query =  manager.createQuery("from Car"); //<-JPA vs SQL -> select * from car_tbl
		carList = query.getResultList();
		return carList;
	}

}
