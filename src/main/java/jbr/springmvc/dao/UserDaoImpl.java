package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;

  public void register(User user) {

    String sql = "insert into Employees values(0,?,?,?,?,?,?,?,?,?)";

    jdbcTemplate.update(sql, new Object[]{
            user.getName(), user.getLastname(), user.getMobile_phone(),
            user.getHome_phone(), user.getAddress(), user.getPostal(),
            user.getCity(), user.getEmail(), user.getWork_phone()
    });
  }

  public User validateUser(Login login) {

    String sql = "SELECT* FROM Employees WHERE id='" + login.getUsername() + "'AND PWD='" + login.getPassword()
            + "'";

    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0): null;
  }

}

class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();

    user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setLastname(rs.getString("LASTNAME"));
    user.setName(rs.getString("NAME"));
    user.setAddress(rs.getString("ADDRESS"));
    user.setCity(rs.getString("CITY"));
    user.setEmail(rs.getString("EMAIL"));
    user.setHome_phone(rs.getString("HOME_PHONE"));
    user.setWork_phone(rs.getString("WORK_PHONE"));
    user.setMobile_phone("MOBILE_PHONE");
    user.setPostal(rs.getString("POSTAL"));

    return user;
  }
}