package enoca.challange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enoca.challange.entity.concretes.Employee;

/**
 * Spring Data JPA repository for the {@link Employee} entity.
 */

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
