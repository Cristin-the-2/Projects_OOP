package Projects_OOP.Seminar03.study_group.student.comparators;

import Projects_OOP.Seminar03.study_group.student.Student;
import java.util.Comparator;

public class StudentComparatorByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}