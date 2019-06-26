package com.di.setterinjection;

public class MockSMSMessageServiceImpl implements MessageService {

  @Override
  public void sendMessage(String message, String to) {
    System.out.println("Hello "+to+" you have an mock sms:  "+ message);
  }
}
