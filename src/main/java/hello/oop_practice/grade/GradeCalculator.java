package hello.oop_practice.grade;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public Double calculateGrade() {
        double average = courses.multiplyCreditAndCourseGrade();
        int total = courses.calculatedTotalCompletedCredit();
        return average / total;
    }
}
