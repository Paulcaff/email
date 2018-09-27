public class email {

    private String recipient;
    private String sender;
    private String message;

    public static void main(String[] args) {

    }

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getRecipient(){
        return recipient;
    }

    public String getSender(){
        return sender;
    }

    public String getMessage(){
        return message;
    }

    public String toString(){
        return ("FROM: "+sender+ "\nTO: "+recipient+ "\nMessage"+ message);
    }

    public email (){

        this.recipient = "None";
        this.sender = "None";
        this.message = "Empty ";
    }

    public email (String recipient,String sender,String message){
        setRecipient(recipient);
        setSender(sender);
        setMessage(message);
    }

   // public append(String message){


}
