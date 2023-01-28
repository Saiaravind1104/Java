public class SecondsMin {
    //hours to mins to seconds converion
    public static String getHours(long minutes,long seconds ){
        if((minutes<0)||(seconds<0)||(seconds>59)){
            return "Invalid value";
        }
            long hours=minutes/60;
            long remainingMinutes=minutes%60;
            String ZeroHours=hours+"h ";
            if(hours<10){
                ZeroHours="0"+hours+"h ";
            }
        String Zerominutes=remainingMinutes+"m ";
        if(minutes<10){
            Zerominutes="0"+remainingMinutes+"m ";
        }
        String ZeroSeconds=seconds+"s ";
        if(seconds<10){
            ZeroSeconds="0"+seconds+"s ";
        }
            return ZeroHours+Zerominutes+ZeroSeconds;

    }
    public static String getHours(long seconds){
        long minutes=seconds/60;
        long remainingSeconds=seconds%60;

        return getHours(minutes,remainingSeconds);
    }
    public static void main(String[] args){
        System.out.println(getHours(156,59));
        System.out.println(getHours(9420));
    }
}
