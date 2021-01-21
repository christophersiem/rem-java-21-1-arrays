public class ArrayExample {

    public static String[] getStudents(int size) {
        String[] studentArray = new String[size];

        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = "Student " + (i + 1);
        }
        return studentArray;
    }
}

