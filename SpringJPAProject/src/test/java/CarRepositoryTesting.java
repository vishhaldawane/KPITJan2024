import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:carsConfig.xml"})
public class CarRepositoryTesting {

	@Autowired
	CarRepository carRepo;
	
	@Autowired
	Car myCar1;

	@Autowired
	Car myCar2;

	@Autowired
	Car myCar3;

	@Test
	public void createCarTest() {
		System.out.println("createCarTest case ");
		
		myCar1.setCarNumber(124);
		myCar1.setCarName("BMW");
		myCar1.setCarPrice(500000);
		
		myCar2.setCarNumber(125);
		myCar2.setCarName("MERC");
		myCar2.setCarPrice(500000);
		
		myCar3.setCarNumber(126);
		myCar3.setCarName("Bugati");
		myCar3.setCarPrice(1500000);
		
		carRepo.createCar(myCar1);
		carRepo.createCar(myCar2);
		carRepo.createCar(myCar3);
		
		
	}
	
	@Test
	public void updateCarTest() {
		System.out.println("updateCarTest case ");
		myCar1.setCarNumber(123);
		myCar1.setCarName("Audi");
		myCar1.setCarPrice(600000);
		carRepo.updateCar(myCar1);
	}
	
	@Test
	public void readCarTest() {
		System.out.println("readCarTest case ");
		myCar1 = carRepo.readCar(123);
		System.out.println("Car : "+myCar1);
	}
	
	@Test
	public void readCarsTest() {
		System.out.println("readCarsTest case ");
		List<Car> cars  = carRepo.readCars();
		for(Car x : cars) {
			System.out.println("Car : "+x);
		}
	}
	
	@Test
	public void deleteCarTest() {
		System.out.println("deleteCarTest case ");
		carRepo.deleteCar(126);
	}
	
}








