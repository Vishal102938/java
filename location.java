import java.text.*;
import java.util.Date;
import java.util.Locale;
public class location {
    static void printTotal(Locale locale){
        //NumberFormat nf = new NumberFormat();
        NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(12500));
    }    
    static void printDate(Locale locale){
        Date date=new Date();
        DateFormat dtf=DateFormat.getDateInstance(DateFormat.LONG,locale);
        System.out.println(dtf.format(date));
    }
    public static void main(String[] args) {
        Locale locale=Locale.of("en","UK");
        printTotal(locale);
        printDate(locale);
    }
}
