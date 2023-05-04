package hw6;

import hw6.data.Student;
import hw6.data.Teacher;
import hw6.data.UserComparator;
import hw6.service.TeacherService;
import hw6.view.StudentView;
import hw6.view.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("student1_0", "student1_2", "student1_3", LocalDate.now());
        Student student2 = new Student("student2_0", "student2_2", "student2_3", LocalDate.now());
        UserComparator<Student> comparator = new UserComparator<>();
        System.out.println(comparator.compare(student1, student2));

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(List.of(new Student("student3_0", "student3_2", "student3_3", LocalDate.now())));

        TeacherService teacherService = new TeacherService();
        teacherService.create("teacher1_0", "teacher1_1", "teacher1_3", LocalDate.now());

        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(List.of(new Teacher("teacher2_0", "teacher2_1", "teacher3_1", LocalDate.now())));
    }
}