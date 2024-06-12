package hello.oop_practice.grade;

import java.util.List;


//일급 컬렉션
public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * 핵심 포인트
     */
    // 이수한 과목 : 객체지향 프로그래밍, 자료구조, 중국어 회화  --> 과목 (코스) 클래스
    // 이수한 과목을 전달하여, 평균학점 계산을 요청 --> 학점 계산기  --> (학점수 x 교과목 평점)의 합계 --> 과목 코스
    //

    public double multiplyCreditAndCourseGrade() {
       return courses.stream()
               .mapToDouble(Course::multiplyCreditAndCourseGrade)
               .sum();
    }

    public int calculatedTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
