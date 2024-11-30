package com.restaurant.vo;

import java.time.LocalDateTime;

public class bookingDetailsVO {

  private Long id;
  private Long restaurantId;
  private Long userId;
  private LocalDateTime bookingDate;
  private Integer numberOfPeople;
  private String status;
  private String specialRequests;

  // Constructors
  public bookingDetailsVO() {}

  public bookingDetailsVO(
    Long id,
    Long restaurantId,
    Long userId,
    LocalDateTime bookingDate,
    Integer numberOfPeople,
    String status,
    String specialRequests
  ) {
    this.id = id;
    this.restaurantId = restaurantId;
    this.userId = userId;
    this.bookingDate = bookingDate;
    this.numberOfPeople = numberOfPeople;
    this.status = status;
    this.specialRequests = specialRequests;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(Long restaurantId) {
    this.restaurantId = restaurantId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public LocalDateTime getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(LocalDateTime bookingDate) {
    this.bookingDate = bookingDate;
  }

  public Integer getNumberOfPeople() {
    return numberOfPeople;
  }

  public void setNumberOfPeople(Integer numberOfPeople) {
    this.numberOfPeople = numberOfPeople;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSpecialRequests() {
    return specialRequests;
  }

  public void setSpecialRequests(String specialRequests) {
    this.specialRequests = specialRequests;
  }

  @Override
  public String toString() {
    return (
      "BookingDetailsVO{" +
      "id=" +
      id +
      ", restaurantId=" +
      restaurantId +
      ", userId=" +
      userId +
      ", bookingDate=" +
      bookingDate +
      ", numberOfPeople=" +
      numberOfPeople +
      ", status='" +
      status +
      '\'' +
      ", specialRequests='" +
      specialRequests +
      '\'' +
      '}'
    );
  }
}
