import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random zufi = new Random();
    
    int[] zahlen = new int[10];
    for (int i = 0; i< zahlen.length; i++){
      zahlen[i] = zufi.nextInt(100);
      System.out.print(zahlen[i] + " ");
    }
  }
}