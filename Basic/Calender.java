package Basic;

import java.io.*;
import java.util.*;
import java.text.*;

public class Calender {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String dateString = in.nextLine();
        DateFormat df = new SimpleDateFormat("MM dd yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(df.parse(dateString));    
       
        
        int day = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(day){
          case 1: System.out.print("SUNDAY");
          break;
          case 2: System.out.print("MONDAY");
          break;
          case 3: System.out.print("TUESDAY");
          break;
          case 4: System.out.print("WEDNESDAY");
          break;
          case 5: System.out.print("THURSDAY");
          break;
          case 6: System.out.print("FRIDAY");
          break;
          case 7: System.out.print("SATURDAY");
          break;
        }
    }
}