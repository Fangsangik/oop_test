package hello.oop_practice.grade;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {

    @Test
    void createCourseTest() {
        assertThatCode(() -> new Course("oop", 3, "A"))
                .doesNotThrowAnyException();
    }
}
