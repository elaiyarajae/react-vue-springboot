package com.app.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.server.entity.Employee;
import com.app.server.repository.EmployeeRepository;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception
	{
		Employee employee1 = new Employee();
		employee1.setFirstName("Chinna");
		employee1.setLastName("Mani");
		employee1.setEmail("mani@gmail.com");

		Employee employee2 = new Employee();
		employee2.setFirstName("Elaiya");
		employee2.setLastName("Raja");
		employee2.setEmail("elaiya@gmail.com");

		Employee employee3 = new Employee();
		employee3.setFirstName("MS");
		employee3.setLastName("Dhoni");
		employee3.setEmail("msd@gmail.com");

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);

	}
}
