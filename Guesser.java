package lab3;
import java.util.*;
public class Guesser {


	public static void main(String[] args)
	{
              // =================================
              // Set up random number generator
              // to produce same sequence of numbers
              // =================================

              Scanner scan = new Scanner( System.in );
              int     seed;
              int     secret;

              System.out.print("Enter a positive integer: ");
              seed = scan.nextInt();
              System.out.format( "Seed value is: %d\n", seed );
              Random  generator = new Random( seed );

              secret = generator.nextInt( 100 ) + 1;	// 1..100 instead of 0..99

	}
}
