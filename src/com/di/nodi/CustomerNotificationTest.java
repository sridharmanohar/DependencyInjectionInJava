package com.di.nodi;

public class CustomerNotificationTest {

  private CustomerNotification customerNotification;

  public static void main(String[] args) {
    CustomerNotificationTest ctest = new CustomerNotificationTest();
    ctest.testSendNotification();
  }
  
  public void testSendNotification() {
    customerNotification = new CustomerNotification();
    customerNotification.sendNotification("kya kar rahan hain be..", "sridharm84@gmail.com");
    customerNotification.sendNotification("kya kar rahan hain be..", "9951249007");
  }
  
}
