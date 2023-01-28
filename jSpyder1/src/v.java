import java.util.*;

class v
{
    static int countUnique(int arr[], int n)
    {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++)
        {
            s.add(arr[i]);
        }
        int count = (int) Math.pow(s.size(), 2);

        return count;
    }
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int[] arr=new int[a];
       for(int i=0;i<a;i++){
           int b=s.nextInt();
           arr[i]=b;
       }
       System.out.println(countUnique(arr, a));
    }
}
