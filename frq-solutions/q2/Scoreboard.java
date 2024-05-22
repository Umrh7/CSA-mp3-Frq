public class Scoreboard {
  private String team1;
  private String team2;
  private int t1 = 0;
  private int t2 = 0;
  private int play = 1;
  public Scoreboard(String t1, String t2){
    team1 = t1;
    team2 = t2;
  }
  
  public void recordPlay(int score){
    if(score == 0){
      play++;
    }
    else{
        if(play % 2==1){
           t1+= score;
        }
        else{
          t2+= score;
        }
    }
  }

  public String getScore(){
    String t = "";
    if(play % 2==1){
      t = team1;
    }
    else{
      t = team2;
    }
    return t1+ "-"+t2 +"-"+t;
  }
}
