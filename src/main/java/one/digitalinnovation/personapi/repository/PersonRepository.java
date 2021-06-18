package one.digitalinnovation.personapi.repository;

import lombok.extern.java.Log;
import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Log> {

}
