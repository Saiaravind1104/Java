public class pat18 {
    public static void main(String[] args) {
        int a=1;
        char ch='a';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if((i==1)||(i==3)){

                    if((i+j)%2==0){
                        System.out.print(a++);
                    }else{
                        System.out.print(ch++);
                    }
                }else{
                    if((i+j)%2==0){
                        System.out.print(ch++);
                    }else{
                        System.out.print(a++);

                    }
                }
            }
            System.out.println();
        }
    }
}
