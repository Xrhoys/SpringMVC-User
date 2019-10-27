package jbr.springmvc.model;

public class User {
  private String id;
  private String username;
  private String password;
  private String name;
  private String lastname;
  private String email;
  private String address;
  private String mobile_phone;
  private String work_phone;
  private String home_phone;
  private String postal;
  private String city;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    System.out.println("username: " + username);
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println("firstname: " + name);
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    System.out.println("lastname: " + lastname);
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMobile_phone() {
    return mobile_phone;
  }

  public void setMobile_phone(String mobile_phone) {
    this.mobile_phone = mobile_phone;
  }

  public String getWork_phone() {
    return work_phone;
  }

  public void setWork_phone(String work_phone) {
    this.work_phone = work_phone;
  }

  public String getHome_phone() {
    return home_phone;
  }

  public void setHome_phone(String home_phone) {
    this.home_phone = home_phone;
  }

  public String getPostal() {
    return postal;
  }

  public void setPostal(String postal) {
    this.postal = postal;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
