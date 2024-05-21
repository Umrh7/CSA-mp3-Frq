
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Feeder f = new Feeder(2400);
    f.simulateOneDay(4);
    System.out.println(f.getFood());
    f.simulateOneDay(4);
    System.out.println(f.getFood());
    System.out.println(f.simulateManyDays(3, 3));
    
  }
  
   }
