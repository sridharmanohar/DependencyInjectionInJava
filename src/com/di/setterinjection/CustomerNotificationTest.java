package com.di.setterinjection;

public class CustomerNotificationTest {

  private CustomerNotification customerNotification;
  
  public static void main(String[] args) {
    CustomerNotificationTest ctest = new CustomerNotificationTest();
    ctest.testSendNotification();
  }
  
  public void testSendNotification() {
    customerNotification = new CustomerNotification();
    customerNotification.setMessageService(new MockEmailMessageServiceImpl());
    customerNotification.sendNotification("kya kar rahan hain be..", "sridharm84@gmail.com");

    customerNotification.setMessageService(new MockSMSMessageServiceImpl());
    customerNotification.sendNotification("kya kar rahan hain be..", "9951249007");
  }
  
}
