package hello.oop_practice.grade;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 평균학점 계산 = (학점수 x 교과목 평점)의 합계 / 수강신청 총학점 수
 * 일급 컬렉션 사용 (컬렉션 형태로 된 하나의 정보를 갖는 인스턴스 변수)
 */
public class GradeCalculatorTest {
    // 학점 계산기 도메인 : 이수과목, 학점 계산기

    /**
     * 핵심 포인트
     */
    // 이수한 과목 : 객체지향 프로그래밍, 자료구조, 중국어 회화  --> 과목 (코스) 클래스
    // 이수한 과목을 전달하여, 평균학점 계산을 요청 --> 학점 계산기  --> (학점수 x 교과목 평점)의 합계 --> 과목 코스
    //                                                      --> 수강신청 총학점 수 --> 과목

    @Test
    void calculateGradeTest() {
        List<Course> listCourse = new ArrayList<>(List.of(new Course("OOP", 3, "A"),
                new Course("자료구조", 3, "A")));

        GradeCalculator gradeCalculator = new GradeCalculator(listCourse);
        Double rst = gradeCalculator.calculateGrade();

        Assertions.assertThat(rst).isEqualTo(4.0);

    }
}
