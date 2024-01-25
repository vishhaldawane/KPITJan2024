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
	Car myCar;
	
	@Test
	public void createCarTest() {
		System.out.println("Test case ");
		myCar.setCarNumber(123);
		myCar.setCarName("BMW");
		myCar.setCarPrice(500000);
		carRepo.createCar(myCar);
	}
}








