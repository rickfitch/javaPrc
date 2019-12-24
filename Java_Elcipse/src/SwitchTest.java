public class SwitchTest {
    static char grade = 'B';

    public static void main(String[] args) {
        // Will fall through until it hits a break
        switch(grade){
            case 'A':
            case 'B': System.out.println("Grade is an 'B' ");
            case 'C': System.out.println("Grade is an 'C' "); break;
            case 'D':
            default: System.out.println("Bad , Bad");
        }


    }
}
