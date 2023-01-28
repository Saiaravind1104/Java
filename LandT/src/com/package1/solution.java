package com.package1;

public class solution {
    public static int nonRepeatdChar(String compString){
        int answer=0;
        int num=compString.length();
      char[] ch =new char[num];
      for(int i=0;i<num;i++){
         char b=compString.charAt(i);
         ch[i]=b;
      }
      for(int i=0;i<num;i++){
            int count=0;
            for(int j=0;j<num;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }if(count>1){
               answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(nonRepeatdChar("alphaadida"));
    }
}
