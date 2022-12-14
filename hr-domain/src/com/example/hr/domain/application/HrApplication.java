package com.example.hr.domain.application;

import java.util.Optional;

import com.example.hr.domain.Employee;
import com.example.hr.domain.TcKimlikNo;

public interface HrApplication {
	Employee hireEmployee(Employee employee);
	Optional<Employee> fireEmployee(TcKimlikNo kimlik);
	Optional<Employee> findEmployeeByKimlikNo(TcKimlikNo kimlik);
	
}
