package com.di.nodi;

public class SMSMessageServiceImpl implements MessageService {

  @Override
  public void sendMessage(String message, String to) {
    System.out.println("Hello "+to+" you have an sms:  "+ message);
  }
}
