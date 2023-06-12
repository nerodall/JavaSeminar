
public class Task4 {

    public static int calculator(int num1, int num2, String action) {
        int result = 0;
        switch (action) {
            case ("+"):
                result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;
            case ("*"):
                result = num1 * num2;
                break;
            case ("/"):
                result = num1 / num2;
                break;
            default:
                result = 0;
        }
        return result;
    }

}
