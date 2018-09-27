public class EmailTest {


    public static void main(String[] args) {

        email emailTest = new email();

        System.out.println(emailTest.toString());

        email email2 = new email("\tJames O' Donoghue", "\tColm Cooper", "\tHey There GOOCH");
        System.out.println(email2.toString());


        email email3 = new email();

        email3.setRecipient("\tLionel Messi");
        email3.setSender("\tChristiano Ronaldo");
        email3.setMessage("\tYou are the Goat");

        email3.getSender();
        email3.getRecipient();
        email3.getMessage();

        System.out.println(email3.toString());
    }

    }

