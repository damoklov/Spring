package ua.lviv.iot.first.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.first.rest.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
