package com.restaurant.vo;

public class restaurantsVO {

  private Long id;
  private String resName;
  private Long ownerId;
  private String alamat1;
  private String alamat2;
  private String alamat3;
  private String alamat4;
  private String phoneNumber;
  private String openingHours;

  // Constructors
  public restaurantsVO() {}

  public restaurantsVO(
    Long id,
    String resName,
    Long ownerId,
    String alamat1,
    String alamat2,
    String alamat3,
    String alamat4,
    String phoneNumber,
    String openingHours
  ) {
    this.id = id;
    this.resName = resName;
    this.ownerId = ownerId;
    this.alamat1 = alamat1;
    this.alamat2 = alamat2;
    this.alamat3 = alamat3;
    this.alamat4 = alamat4;
    this.phoneNumber = phoneNumber;
    this.openingHours = openingHours;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getResName() {
    return resName;
  }

  public void setResName(String resName) {
    this.resName = resName;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(String openingHours) {
    this.openingHours = openingHours;
  }

  @Override
  public String toString() {
    return (
      "RestaurantDetailsVO{" +
      "id=" +
      id +
      ", resName='" +
      resName +
      '\'' +
      ", ownerId=" +
      ownerId +
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
      ", phoneNumber='" +
      phoneNumber +
      '\'' +
      ", openingHours='" +
      openingHours +
      '\'' +
      '}'
    );
  }
}
