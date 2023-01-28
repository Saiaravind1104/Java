public class Switch1 {
    public static void aravind(int day){
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuseday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter the correct day");

        }
    }

    public static void main(String[] args){
        aravind(1);
        aravind(2);
        aravind(3);
        aravind(4);
        aravind(5);
        aravind(6);
        aravind(7);
        aravind(8);


    }
}
