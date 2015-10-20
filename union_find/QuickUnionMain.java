import java.util.Scanner;
/**
 * Write a description of class QuickUnionMain here.
 * 
 * @author (Damion E. Lowers) 
 * @version (a version number or a date)
 */
public class QuickUnionMain
{
    // instance variables - replace the example below with your own
   public static void main(String [] args){
       Scanner reader = new Scanner(System.in);
       System.out.println("Enter the number of elements");
       int elementNumber = reader.nextInt();
       QuickUnion qu = new QuickUnion(elementNumber);
       boolean checker = true;
       int p=0;
       int q=0;
       String task = "";
       System.out.println("-----------------Menu-----------------");
       System.out.println("u-----To join nodes");
       System.out.println("s-----show list");
       System.out.println("c-----conneted");
       System.out.println("q-----quit");
       do{
           System.out.println("Please enter choice");
           task = reader.nextLine();
           if(task.toLowerCase().equals("u")){
                System.out.println("please enter value to be connect");
                System.out.println("you may choose from this list");
                System.out.println(qu.toString());
                p = reader.nextInt();
                System.out.println("Choose next value");
                q = reader.nextInt();
                qu.union(p,q);;
               
           }else if(task.toLowerCase().equals("c")){
               System.out.println("please enter value to be check for connection");
               System.out.println("you may choose from the list below");
               System.out.println(qu.toString());
               p = reader.nextInt();
               System.out.println("Choose next value");
               q = reader.nextInt();
               System.out.println(qu.connected(p,q));
               
           }else if(task.toLowerCase().equals("s")){
               System.out.println(qu.toString());
           }else if(task.toLowerCase().equals("q")){
               checker = false;
           }
           
       }while(checker);
       
   }
}
