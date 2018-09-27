public class EmailTest {


    public static void main(String[] args) {

        Email emailTest = new Email();

        System.out.println(emailTest.toString());

        Email email2 = new Email("\tJames O' Donoghue", "\tColm Cooper");
        System.out.println(email2.toString());


        Email email3 = new Email();

        email3.setRecipient("\tLionel Messi");
        email3.setSender("\tChristiano Ronaldo");


        email3.getSender();
        email3.getRecipient();
        email3.append("ppp");


        System.out.println(email3.toString());
    }

    }

