package com.di.setterinjection;

public class MockEmailMessageServiceImpl implements MessageService {

  @Override
  public void sendMessage(String message, String to) {
    System.out.println("Hello "+to+" you have an mock email:  "+ message);
  }
}
