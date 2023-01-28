public class FlourPacker {
    public static boolean canPack(int a,int b,int goal){
        //5kg = 2         1kg =5            total weight = 21kgs
        // 20/5 =4         step 1;
        // (4-2)*5=10      step 2;
        // 10==5kg         step 3;
        //true or false
        //b s c i l f d
        //goal =21kgs -small kgs 21-5=16 16%5==0 true lekapothe false
        if((a>=0)&&(b>=0)&&(goal>=0)) {
            int f=a;
            int c=goal-b;
            int d=c%5;
            if((d==0)||(a%5==0)){
                 int e=c/5;
                if(c<=e){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
        //2 2 11
        //11-2=9 //false
        //5-1= 4
        //5%goal=0
    }
}
