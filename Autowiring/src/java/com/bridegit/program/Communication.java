package com.bridegit.program;

public class Communication {
	private Messaging messaging;
    
    /*
    * DI via Setter
    */
	
   /**
    * @param messaging
    * dependency injection using setter
    */
/*		public void setMessaging(Messaging messaging){
	       this.messaging = messaging;
	   }
	
	   public void communicate(){
	       messaging.sendMessage();
	   }*/
   
   /**
 * @param messaging
 * dependency injection using constructor
 */
public Communication(Messaging messaging){
       this.messaging = messaging;
   }


   public void communicate(){
	   messaging.sendMessage();
   }
}
