package com.package1;

public class insurence {
    public static void main(String[] args) {
        int age=25;
        String gender="male";
        String loc="Village";
        String health="poor";
        if(((age>=25)&&(age<=35))&&(gender=="male")&&(loc=="city")&&(health=="excellent")){
            System.out.println("Insured");
            System.out.println("Rs.4 per thousand");
            System.out.println("Maximum amount = 2 lakhs");
        }else if(((age>=25)&&(age<=35))&&(gender=="female")&&(loc=="city")&&(health=="excellent")){
            System.out.println("Insured");
            System.out.println("Rs.3 per thousand");
            System.out.println("Maximum amount = 1 lakhs");
        }else if(((age>=25)&&(age<=35))&&(gender=="male"||gender=="female")&&(loc=="Village")&&((health=="excellent")||(health=="poor"))){
            System.out.println("Insured");
            System.out.println("Rs.6 per thousand");
            System.out.println("Maximum amount = 10,000");
        }else{
            System.out.println("Not Insured");
        }
    }
}
