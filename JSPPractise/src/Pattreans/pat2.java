package Pattreans;

public class pat2 {
    public static void main(String[] args) {
        int count=0;
        for(int k=0;k<=count;k++){
            int sum=0;
            for(int l=1;l<k;l++){
                if(k%l==0){
                    sum++;
                }
            }
            if(sum==1){
                for(int i=1;i<5;i++){
                    for(int j=1;j<5;j++){
                        if(i<=j){
                            System.out.print(k);
                            count++;
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
