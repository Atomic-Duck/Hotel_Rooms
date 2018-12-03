
package th1;

/**
 *Room class that will be used by the "hotel" class in this package
 * roomType instance will come from enum file with the various room options
 * @author emanuela
 */
public class Room {

    RoomType roomType;
    boolean occupied;

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

}
