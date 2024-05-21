public class Feeder{
  private int currentFood;
  public Feeder(int cf){
    currentFood = cf;
  }
  public void simulateOneDay(int numBirds){
    int day = (int)(Math.random()*(100)+1);
    if(day<=95){
      int ate = (int)(Math.random()*(41)+10);
      if( ate * numBirds > currentFood){
        currentFood=0;
      }
      else{
        currentFood = currentFood - ate * numBirds;
      }
    }
    else if(day >= 95){
      currentFood = 0;
    }
  }
  public int simulateManyDays(int numBirds, int numDays){
     int day = 0; 
    while(currentFood > 0 && day < numDays){
      day++;
      simulateOneDay(numBirds);
    }
    return day;
  }


  
  public int getFood(){
    return currentFood;
  }
}
