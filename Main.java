import java.time.Month;

public class Main {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            String monthName = month.toString();
            if (monthName.endsWith("Y") || monthName.endsWith("y")) {
                System.out.println(monthName + " ends with y");
            } else {
                System.out.println(monthName + " doesn't end with y");
            }
        }
    }
}
