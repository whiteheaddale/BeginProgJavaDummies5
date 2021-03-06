import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

public class ShowOneRoomOccupancy {

   public static void main(String args[]) throws FileNotFoundException {
      Scanner keyboard = new Scanner(System.in);
      Scanner diskScanner = new Scanner(new File("occupancy"));
      int whichRoom;

      out.print("Which room? ");
      whichRoom = keyboard.nextInt();

      for (int roomNum = 0; roomNum < whichRoom; roomNum++) {
         diskScanner.nextInt();
      }

      out.print("Room ");
      out.print(whichRoom);
      out.print(" has ");
      out.print(diskScanner.nextInt());
      out.println(" guest(s).");

      keyboard.close();
      diskScanner.close();
   }
}
