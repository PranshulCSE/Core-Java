public class Switchh {
    public static void main(String[] args) {
        int marks = 67;
        char grade;

        switch (marks / 10) {
            case 10:
                grade='A';
                break;
            case 9:
                grade = 'B';
                break;
            case 8:
                grade = 'C';
                break;
            case 7:
                grade = 'D';
                break;
            case 6:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println(grade);