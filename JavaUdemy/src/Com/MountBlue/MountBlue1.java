package Com.MountBlue;

import java.util.Scanner;

public class MountBlue1 {
//    The company Trader Mart manufactures different types of software products. They deliver their products to their N clients.
//    Whenever the company fulfils the complete order of a client, the order ID generated is the concatenation of the number of products delivered for every committed product type.
//    The head of the sales team wishes to find the client wise data for the total number of products of any type delivered to the respective client. Write an algorithm for the head of sales team to calculate
//    sales team to calculate the total number of products of any type delivered to the respective clients.
//
//
//            Input format
//
//    The first line of the input consists of an integer numOfClients, representing the number of clients
//
//    The second line consists of N space-separated integers–orderID1, orderID2, orderIDN representing the orderIDs of the orders delivered to the clients.
//            Output format
//
//    Print N space-separated integers representing the clientwise data for the total number of products of any type delivered to each of the respective clients.
//
//            Constraints
//
//    O < numOfClients < 106
//
//    O < orderIDi < 106
//
//    O < i < numofClients
//
//    Sample Input:
//
//            4
//
//            43 345 20 987
//
//    Sample Output:
//
//            7 12 2 24
//
//    Explanation:
//
//    The client O ordered 2 types of products thus, the total products delivered to him/her is 7.
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int numOfClients=scan.nextInt();
        int[] arr=new int[numOfClients];
//        for(int i=0;i<numOfClients;i++){
//            arr[i]= scan.nextInt();
//        }
        int a=0;
        while(a<numOfClients){
            arr[a]= scan.nextInt();
            a++;
        }

        for(int i=0;i<numOfClients;i++) {
            int sum = 0;
            for (int j = arr[i]; j != 0; j /= 10) {
                int last = j % 10;
                sum += last;
            }
            System.out.print(sum + " ");
        }

    }
}
