package ua.lviv.iot.first.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.first.rest.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
