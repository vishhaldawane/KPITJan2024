package com.kpit.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kpit.pojo.Car;

@Repository
public interface CarRepository // extends JpaRepository<Car>
{
	
	void createCar(Car car);
	void updateCar(Car car);
	void deleteCar(int carid);
	Car readCar(int carid);
	List<Car> readCars();
	
}












//1. interface Intsrument { use(); }
 
//2. interface MusicalInstrument extends Instrument { }

//3. spring will generate the 
//implementation class for your MusicalInstrument

//class Guitar implements MusicalInstrument
//{
//    void use() { }
//}


//Instrument i = new Guitar();
// i.use();

//MusicalInstrument mi = new Guitar();
//mi.use();



