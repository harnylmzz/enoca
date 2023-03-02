package enoca.challange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enoca.challange.entity.concretes.Company;

/**
 * Spring Data JPA repository for the {@link Company} entity.
 */

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
