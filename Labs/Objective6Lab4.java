public class Objective6Lab4 {
  public static void main( String[] args ) {
    int count, sum;
    sum = 0;
    count=1;

    while( count <= 20 ) {
      sum += count;

      if (sum == 210) {
        System.out.println( sum );
      }
    }
  }
}
