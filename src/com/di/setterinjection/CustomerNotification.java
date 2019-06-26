package com.di.setterinjection;

public class CustomerNotification {

  private MessageService messageService;
  
  public void setMessageService(MessageService messageService) {
    this.messageService = messageService;
  }
  
  public void sendNotification(String message, String to) {
      messageService.sendMessage(message, to);
  }
  
}
