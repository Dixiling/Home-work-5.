package HM.service;

import HM.model.Student;
import HM.model.GroupLearn;
import HM.model.Teacher;
import java.util.List;

public class GroupLearnService {
    public GroupLearn createGroupLearn (Teacher teacher, List<Student> studentsList) {
        return new GroupLearn(teacher, studentsList);
    }
}