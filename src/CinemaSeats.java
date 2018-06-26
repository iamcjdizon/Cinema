import java.util.LinkedHashMap;

/**
 * Created by CJ on 6/26/2018.
 */
public class CinemaSeats {
    private int numberOfSeats;
    private LinkedHashMap<String, Boolean> seatStatus = new LinkedHashMap();
    private char seatLetter [] = {'A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
            'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public CinemaSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
        seatConstruction();
        print();
    }

    private void seatConstruction(){
        for(int row = 0; row<numberOfSeats; row++)
            for (int column = 0; column < numberOfSeats; column++)
                seatStatus.put("" + seatLetter[column] + row, false);
    }

    public void print(){
        for(int row = 0; row<=numberOfSeats; row++) {
            for (int column = 0; column <= numberOfSeats; column++) {
                if(column==0)
                    System.out.print(row<10 ? ("0"+row) : row);
                else {
                    if(row == 0)
                        System.out.print(seatLetter[column-1]);
                    else
                        System.out.print(seatStatus.get("" + seatLetter[column-1] + (row-1)) ? "x" : "-");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public void reserveSeat(){

    }
}
