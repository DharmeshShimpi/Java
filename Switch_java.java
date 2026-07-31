public class Switch_java {
    
    public static void main(String[] args) {
        
        String day = "Monday";

        switch (day) {
            case "Monday": System.out.println("Monday");
                break;
            case "Tuesday": System.out.println("Tuesday");
            case "Wednesday": System.out.println("Wednesday");
                break;
            case "Thursday": System.out.println("Thursday");
            case "Friday": System.out.println("Friday");
                break;
            case "Saturday": System.out.println("Saturday");
            case "Sunday": System.out.println("Sunday");
                break;
            default: System.out.println("Invalid day!");
                break;
        }
    }
}
