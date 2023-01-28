public class Method1 {
    public static void displayHighScorePosition(String name,int position){
        System.out.println(name+" manged to get into position "+position+" on the high score table.");
    }
    public static int calculateHighScorePosition(int score){
        if (score>1000){
            return 1;
        }else if(score > 500 && score <1000){
            return 2;
        }
        else if(score>100 && score<500){
            return 3;
        }
        else{
            return 4;
        }

    }
    public static void main(String[] args){
        int position=calculateHighScorePosition(1500);
        displayHighScorePosition("Aravind",position);
         position =calculateHighScorePosition(900);
        displayHighScorePosition("Aravind",position);
        position =calculateHighScorePosition(400);
        displayHighScorePosition("Aravind",position);
        position =calculateHighScorePosition(50);
        displayHighScorePosition("Aravind",position);


    }
}
