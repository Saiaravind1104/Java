public class pat20 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        char ch='a';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(((i==1)&&(j==2))||((i==3)&&(j==4))){
                    System.out.print(b);
                }
                else if((j==1)||(j==3)){
                    System.out.print(ch++);
                }else if((j==2)||(j==4)){
                    System.out.print(a+=2);
                }
                if(a>7){
                    a=1;
                }
            }
            System.out.println();
        }
    }
}
