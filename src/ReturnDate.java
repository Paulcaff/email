import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ReturnDate {

    public static void main(String[] args) {


        GregorianCalendar borrowDate, returnDate;
        Calendar c = Calendar.getInstance();

        borrowDate = new GregorianCalendar(2018,5,1);
        returnDate = new GregorianCalendar(2018, 5, 16);

        SimpleDateFormat rt =  new SimpleDateFormat("EEEE MMMM dd'th', yyyy");

        JOptionPane.showMessageDialog(null, "The Borrow Date is " + rt.format(borrowDate.getTime()) );
        JOptionPane.showMessageDialog(null, "The return Date is " + rt.format(returnDate.getTime()) );





    }
}
