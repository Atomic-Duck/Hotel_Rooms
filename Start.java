package th1;
/**
 * This class contains the main method that incorporates all classes included in this package
 * @Rich Smith at ZenOfProgramming.com
 */
public class Start
{
   public static void main (String[] args)
   {
      Hotel hotel = new Hotel("Hotel Transyvania");
      hotel.printRoomStatus();

      System.out.println("Setting room at floor 1, room 0 to occupied");
      hotel.setRoomToOccupied(1, 0);
      System.out.println("Setting room at floor 2, room 1 to occupied");
      hotel.setRoomToOccupied(2, 1);
      hotel.printRoomStatus();

      System.out.println("Finding the first open Suite and setting it to occupied");
      Room room = hotel.getOpenRoomType(RoomType.SUITE);
      room.setOccupied(true);
      hotel.printRoomStatus();
   }
}
