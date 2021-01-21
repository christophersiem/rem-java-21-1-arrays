import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayExampleTest {

    @Test
    void getStudentsShouldReturnFilledArrayList() {
        // Given
        int numberOfStudents = 5;
        String[] expected = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5"};

        // When
        String[] actual = ArrayExample.getStudents(numberOfStudents);

        // Then
        assertArrayEquals(expected, actual);
    }
}
