package th1;

/**
 *Hotel class files contains all methods to to create an instance of a hotel, setting up the rooms within and checking their status.
 * @author emanuela
 */
public class Hotel {

    public String hotelName;
    public Room[][] rooms = {
        {new Room(RoomType.DOUBLE), new Room(RoomType.SINGLE), new Room(RoomType.SUITE)},
        {new Room(RoomType.SINGLE), new Room(RoomType.SUITE)},
        {new Room(RoomType.SINGLE), new Room(RoomType.SINGLE)}
    };

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    public void printRoomStatus() {

        String name = this.hotelName + "\n";

        for (int hotelFloor = 0; hotelFloor < rooms.length; hotelFloor++) {
            name += "Floor # " + hotelFloor + ": ";

            for (Room room : rooms[hotelFloor]) {
                if (room.isOccupied()) {
                    name += "FULL ";
                } else {
                    name += "EMPTY ";
                }
            }
            name += "\n";
        }
        System.out.println(name);
    }

    public void setRoomToOccupied(int floor, int roomNumber) {

        if (rooms[floor][roomNumber].isOccupied()) {
            System.out.println("Room is Occupied");
        }
        rooms[floor][roomNumber].setOccupied(true);
    }

    public Room getOpenRoomType(RoomType type) {

        for (int hotelFloor = 0; hotelFloor <= rooms.length; hotelFloor++) {
            for (int roomNumber = 0; roomNumber <= rooms[hotelFloor].length; roomNumber++) {
                if (!rooms[hotelFloor][roomNumber].isOccupied() && rooms[hotelFloor][roomNumber].getRoomType().equals(type)) {
                    Room firstAvailableRoom = rooms[hotelFloor][roomNumber];
                    return firstAvailableRoom;
                }
            }
        }
        return null;
    }
}
