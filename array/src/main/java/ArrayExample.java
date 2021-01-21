public class ArrayExample {

    public static String[] createStudentsArray(int size) {
        String[] students = new String[size];

        for (int i = 0; i < students.length; i++) {
            students[i] = "Student " + (i + 1);
        }
        return students;
    }
}
