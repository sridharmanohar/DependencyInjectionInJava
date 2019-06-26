package com.di.nodi;

public class EmailMessageServiceImpl implements MessageService {

  @Override
  public void sendMessage(String message, String to) {
    System.out.println("Hello "+to+" you have an email:  "+ message);
  }
}
