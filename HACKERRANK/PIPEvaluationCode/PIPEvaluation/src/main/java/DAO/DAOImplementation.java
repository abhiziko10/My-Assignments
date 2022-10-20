package DAO;

import Model.Booking;
import Model.ConferenceRoom;
import Model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DAOImplementation implements DAOInterface {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertUser(User user) {
        return jdbcTemplate.update("insert into User values(?,?,?,?)", user.getUserId(), user.getUserName(),
                user.getUserContact(), user.getUserPosition());

    }

    @Override
    public int conferenceRoom(ConferenceRoom conferenceRoom) {
        return jdbcTemplate.update("insert into ConferenceRoom values(?,?)", conferenceRoom.getRoomNo(),
                conferenceRoom.getRoomName());
    }

    @Override
    public int bookConferenceRoom(User user, Booking booking, ConferenceRoom conferenceRoom) {
        return jdbcTemplate.update("insert into Booking values(?,?,?,?)", user.getUserId(),
                conferenceRoom.getRoomName(), booking.getDate(), booking.getTime());
    }

    @Override
    public int deleteBooking(int userId) {
        return jdbcTemplate.update("delete from Booking where userId=?", userId);
    }

    @Override
    public List<Booking> bookingDetails(String date) {
        String query = "select User.userId,User.userName,Booking.date,Booking.time,ConferenceRoom.roomName from User" +
                "inner join Booking on User.userId=Booking.userId inner join ConferenceRoom on ConferenceRoom" +
                ".roomName=Booking.roomName where date=?" + date + "";
        List<Booking> bookingList = jdbcTemplate.query(query, new RowMapper<Booking>() {
            @Override
            public Booking mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                ConferenceRoom conferenceRoom = new ConferenceRoom();
                Booking booking = new Booking();
                user.setUserId(resultSet.getInt(1));
                user.setUserName(resultSet.getString(2));
                booking.setTime(resultSet.getString(3));
                booking.setTime(resultSet.getString(4));
                conferenceRoom.setRoomName(resultSet.getString(5));
                booking.setUser(user);
                booking.setConferenceRoom(conferenceRoom);
                return booking;
            }
        });
        return bookingList;
    }
}
