public class Email {

    private String recipient;
    private String sender;
    private String message;


    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public void setSender(String sender){
        this.sender = sender;
    }


    public String getRecipient(){
        return recipient;
    }

    public String getSender(){
        return sender;
    }


    public String toString(){
        return ("FROM: "+sender+ "\nTO: "+recipient+ "\nMessage"+ message);
    }

    public Email (){

        this.recipient = "None";
        this.sender = "None";
        this.message = "Empty";
    }

    public Email (String recipient,String sender){
        setRecipient(recipient);
        setSender(sender);
    }

   public String append(String text) {

       if(this.message.equals("Empty")){
           this.message = "";
       }

      this.message += text;

       return message;
   }




}
