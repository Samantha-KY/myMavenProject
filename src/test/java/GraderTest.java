import org.junit.Test;

import static org.junit.Assert.*;

public class GraderTest {
    Grader grade = new Grader();
    @Test
    public void determineGradeF() {
        //assertEquals('F',grade.determineGrade(59));
        //assertEquals('F',grade.determineGrade(40));
        //assertTrue(grade.determineGrade(59) == 'F');
        //assertNull(null,grade.determineGrade(0));
        assertFalse(grade.determineGrade(59) != 'F');
    }
    @Test
    public void determineGradeD() {
        //Grader grade = new Grader();
        assertEquals('D',grade.determineGrade(69));
    }
    @Test
    public void determineGradeC() {
        //Grader grade = new Grader();
        assertEquals('C',grade.determineGrade(79));
    }
    @Test
    public void determineGradeB() {
        //Grader grade = new Grader();
        assertEquals('B',grade.determineGrade(89));
    }
    @Test
    public void determineGradeA() {
        //Grader grade = new Grader();
        assertEquals('A',grade.determineGrade(90));
    }
    @Test
    public void determineGradeZero() {
        //Grader grade = new Grader();
        assertEquals('F',grade.determineGrade(0));
    }
    @Test
    public void determineGradeNegativeOne() {
        //Grader grade = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grade.determineGrade(-1);
                });

    }
}