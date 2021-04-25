import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

//import jdk.internal.joptsimple.internal.Messages;
// java.util.Collection;
public class Old {
   public static void main (String [] args ){
    List <String> mess = new ArrayList <String>();
    mess.add("circumference");
   
        System.out.println(mess);
        int b = mess.size();
        System.out.println(b);
        mess.remove("circumference");
        System.out.println(mess);
        
        mess.toArray();
        for(String element : mess){
           System.out.println(mess.toArray() + element);
        }
    
   }
}