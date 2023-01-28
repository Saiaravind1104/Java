public class pat19 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        char ch='a';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){

                if(((i==1)&&(j==2))||((i==3)&&(j==4))){
                    System.out.print(b);
                }
                else if((i==1)||(i==3)){
                    if((i+j)%2==0){
                        System.out.print(ch++);
                    }else{
                        System.out.print(a+=2);
                    }
                }else{
                    if((i+j)%2==0){
                        System.out.print(a+=2);
                    }else{
                        System.out.print(ch++);

                    }
                }
                if(a>7){
                    a=1;
                }
            }
            System.out.println();
        }
    }
}
