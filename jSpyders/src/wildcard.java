import java.util.Scanner;
public class wildcard {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the iterartions ");
        int T=s.nextInt();
        s.nextLine();
        for(int i=1;i<=T;i++){
            System.out.println("Enter string 1 = ");
            String a=s.nextLine();
            System.out.println("Enter string 2 = ");
            String b=s.nextLine();
            int c=a.length();
            int d= b.length();
            char u = ' ';
            char v=' ';
            if(c==d){
                for(int j=0;j<c;j++){
                    char x=a.charAt(j);
                    if(x=='?'){
                        if(j==0){
                            x='s';
                        }else if(j==1){
                            x='t';
                        }else if(j==2){
                            x='r';
                        }else if(j==3){
                            x='i';
                        }else if(j==4){
                            x='n';
                        }else if(j==5){
                            x='g';
                        }else{
                            x=' ';
                        }

                    }u=x;

                }
                for(int l=0;l<d;l++){
                    char z=a.charAt(l);
                    if(z=='?'){
                        if(l==0){
                            z='s';
                        }else if(l==1){
                            z='t';
                        }else if(l==2){
                            z='r';
                        }else if(l==3){
                            z='i';
                        }else if(l==4){
                            z='n';
                        }else if(l==5){
                            z='g';
                        }else{
                            z=' ';
                        }

                    }v=z;



                }
            }else{
                System.out.println("No");
            }if(u==v){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
