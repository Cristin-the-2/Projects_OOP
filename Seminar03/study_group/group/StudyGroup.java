package Projects_OOP.Seminar03.study_group.group;

import Projects_OOP.Seminar03.study_group.student.Student;
import Projects_OOP.Seminar03.study_group.student.comparators.StudentComparatorByAge;
import Projects_OOP.Seminar03.study_group.student.comparators.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName());
    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge());
    }
}