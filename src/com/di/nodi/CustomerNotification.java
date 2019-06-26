package com.di.nodi;

public class CustomerNotification {

  private EmailMessageServiceImpl emailMessageService; 
  private SMSMessageServiceImpl smsMessageService;
  
  public CustomerNotification() {
    emailMessageService = new EmailMessageServiceImpl();
    smsMessageService = new SMSMessageServiceImpl();
  }
  
  public void sendNotification(String message, String to) {
    if(to.contains("@"))
      emailMessageService.sendMessage(message, to);
    else
      smsMessageService.sendMessage(message, to);
  }
  
}
