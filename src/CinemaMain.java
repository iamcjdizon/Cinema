/**
 * Created by CJ on 6/26/2018.
 */
import java.util.Scanner;

public class CinemaMain {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int cinemaSize;

        do{
            System.out.print("Enter cinema size, n [nxn]:");
            cinemaSize = scanner.nextInt();

            if(cinemaSize > 26 || cinemaSize < 1)
                System.out.println("Maximum size is 26");
        } while (cinemaSize > 26 || cinemaSize < 1);

        CinemaSeats cinema = new CinemaSeats(cinemaSize);
        do{
            System.out.print("\nMenu:\n" +
                    "[1] Reserve seat\n" +
                    "[2] Clear seat\n" +
                    "[3] Clear all seats\n" +
                    "[4] Exit\n" +
                    "Enter choice: ");
            userInput = scanner.nextInt();

            switch (userInput){
                case 1: cinema.print(); break;
                case 2: break;
                case 3: break;
                case 4: System.exit(1); break;
                default: System.out.println("\nInvalid! 1, 2, 3, 4 only!");
            }

        } while(userInput!=(1|2|3|4));

    }
}
