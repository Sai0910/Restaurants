package com.restaurant.vo;

import java.time.LocalDateTime;

public class usersVO {

  private Long id;
  private LocalDateTime createdDate;
  private String name;
  private String icNo;
  private String alamat1;
  private String alamat2;
  private String alamat3;
  private String alamat4;
  private String password;
  private String userName;
  private String noTel;
  private Boolean admin;
  private String userRoles;

  // Constructors
  public usersVO() {}

  public usersVO(
    Long id,
    LocalDateTime createdDate,
    String name,
    String icNo,
    String alamat1,
    String alamat2,
    String alamat3,
    String alamat4,
    String password,
    String userName,
    String noTel,
    Boolean admin,
    String userRoles
  ) {
    this.id = id;
    this.createdDate = createdDate;
    this.name = name;
    this.icNo = icNo;
    this.alamat1 = alamat1;
    this.alamat2 = alamat2;
    this.alamat3 = alamat3;
    this.alamat4 = alamat4;
    this.password = password;
    this.userName = userName;
    this.noTel = noTel;
    this.admin = admin;
    this.userRoles = userRoles;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIcNo() {
    return icNo;
  }

  public void setIcNo(String icNo) {
    this.icNo = icNo;
  }

  public String getAlamat1() {
    return alamat1;
  }

  public void setAlamat1(String alamat1) {
    this.alamat1 = alamat1;
  }

  public String getAlamat2() {
    return alamat2;
  }

  public void setAlamat2(String alamat2) {
    this.alamat2 = alamat2;
  }

  public String getAlamat3() {
    return alamat3;
  }

  public void setAlamat3(String alamat3) {
    this.alamat3 = alamat3;
  }

  public String getAlamat4() {
    return alamat4;
  }

  public void setAlamat4(String alamat4) {
    this.alamat4 = alamat4;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getNoTel() {
    return noTel;
  }

  public void setNoTel(String noTel) {
    this.noTel = noTel;
  }

  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public String getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(String userRoles) {
    this.userRoles = userRoles;
  }

  @Override
  public String toString() {
    return (
      "UserVO{" +
      "id=" +
      id +
      ", createdDate=" +
      createdDate +
      ", name='" +
      name +
      '\'' +
      ", icNo='" +
      icNo +
      '\'' +
      ", alamat1='" +
      alamat1 +
      '\'' +
      ", alamat2='" +
      alamat2 +
      '\'' +
      ", alamat3='" +
      alamat3 +
      '\'' +
      ", alamat4='" +
      alamat4 +
      '\'' +
      ", password='" +
      password +
      '\'' +
      ", userName='" +
      userName +
      '\'' +
      ", noTel='" +
      noTel +
      '\'' +
      ", admin=" +
      admin +
      ", userRoles='" +
      userRoles +
      '\'' +
      '}'
    );
  }
}
