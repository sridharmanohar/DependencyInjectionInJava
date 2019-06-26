package com.di.constructorinjection;

public class CustomerNotification {

  private MessageService messageService;
  
  public CustomerNotification(MessageService messageService) {
    this.messageService = messageService;
  }
  
  public void sendNotification(String message, String to) {
      messageService.sendMessage(message, to);
  }
  
}
