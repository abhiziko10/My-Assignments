package Model;

public class ConferenceRoom {
    int roomNo;
    String roomName;

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "ConferenceRoom{" +
                "roomNo=" + roomNo +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}
