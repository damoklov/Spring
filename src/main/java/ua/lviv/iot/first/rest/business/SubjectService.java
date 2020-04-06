package ua.lviv.iot.first.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.first.rest.dataaccess.SubjectRepository;
import ua.lviv.iot.first.rest.model.Subject;

import java.util.List;
@Service
public class SubjectService {
    @Autowired
    public SubjectRepository subjectRepository;
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

}
