package hello.oop_practice.grade;

public class Course {

    private String subject;
    private int credit;
    private String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double grade = 0;

        switch (this.grade) {
            case "A" :
                grade = 4.0;
                break;
            case "B" :
                grade = 3.0;
                break;
            case "C" :
                grade = 2.0;
                break;
        }

        return grade;
    }

}
