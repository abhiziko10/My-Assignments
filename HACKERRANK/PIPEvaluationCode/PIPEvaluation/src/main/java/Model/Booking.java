package Model;

public class Booking {
    private String date;
    private String time;
    ConferenceRoom conferenceRoom;
    User user;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", conferenceRoom=" + conferenceRoom +
                ", user=" + user +
                '}';
    }
}
