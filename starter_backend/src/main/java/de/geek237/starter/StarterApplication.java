package de.geek237.starter;

import de.geek237.starter.entity.Employee;
import de.geek237.starter.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
				.firstName("Donald")
				.lastName("Donchi")
				.email("donchidonald2000@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Doni")
				.lastName("Leprince")
				.email("leprincedoni2000@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("Geek")
				.lastName("237")
				.email("donchidonald@geek237.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}

}
