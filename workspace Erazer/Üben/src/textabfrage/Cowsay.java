package textabfrage;

public class Cowsay {
     public static void main(String[] args){
         String message = "Java rocks!";
         if(args.length > 0){
             message = args[0];
         }
   
         System.out.println(" _____________");
         System.out.println("< " + message + " >");
         System.out.println(" -------------");
         System.out.println("        \\   ^__^");
         System.out.println("         \\  (oo)\\________");
         System.out.println("            (__)\\        )\\/\\");
         System.out.println("                ||-----w |");
         System.out.println("                ||      ||");
     }
 }