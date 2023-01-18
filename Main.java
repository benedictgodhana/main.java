
import java.util.Scanner;


public class Main {
    //main method in java
    public static void main(String[] args){
            
            String name = "Ben";
            int age=20;
            int yob;
             
            Scanner sc= new Scanner(System.in);
            age=sc.nextInt();
            yob=2023-age;
                    
        //Print Output
            
System.out.println(name);
System.out.println("I am "+ age + "years old");
System.out.println("I was born in "+yob+ " years old");

    }}

