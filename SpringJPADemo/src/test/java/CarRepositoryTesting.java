import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;
import com.kpit.repo.CarRepositoryImpl;

public class CarRepositoryTesting {

	@Test
	public void createCarTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("carsConfig.xml");
		CarRepository carRepo = ctx.getBean(CarRepository.class);
		Car carObj = new Car();
		carObj.setCarNumber(102);
		carObj.setCarModelName("Audi");
		carObj.setCarPrice(600000);
		carRepo.createCar(carObj);
	}
}
