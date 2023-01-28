public class DaysYears {

        public static void printYearsAndDays(long minutes){
            if (minutes<0){
                System.out.println("Invalid Value");
            }else{
                long hours=minutes/60; //0
                long days=hours/24; //0
                long years =days/365; //0
                long remaingYears=days%365;
                long remaingDays=remaingYears%hours;
                System.out.println(minutes+" min = "+years+" y and "+remaingDays+" d");
            }
        }
        public static void main(String[] args){
            printYearsAndDays(525600);
            printYearsAndDays(1051200);
            printYearsAndDays(561600);
        }
        // write your code here

}
