import java.util.*;
public class game {
    public static void main(String[] args) {
        Random rnd = new Random() ; 
        System.out.println("rock - paper- scissors ");
       System.out.println("lets play game .. your turn first");
        System.out.println("for rock type ->'r' ");
        System.out.println("for paper type -> 'p" );
        System.out.println("for scissor type 's' " );
         System.out.println("give your input "); 

         

         Scanner s = new Scanner(System.in) ; 
        String  user =  userInput(s) ; 
        
        if (user == null ) {
            
            return  ; 
        }
         
        String computer = compInput(rnd) ; 

        if (computer.equals(user)) {
      
    System.out.println("its a draw "); 
    System.out.println(" computer choosed  " + computer + " and you choosed " + user);
            }

   
   else if (computer.equals("rock")) {
    if (user.equals("paper")) {
        System.out.println("You won! Computer chose " + computer + " and you chose " + user);
    } else {
        System.out.println("Computer won! Computer chose " + computer + " and you chose " + user);
    }
} else if (computer.equals("paper")) {
    if (user.equals("scissors")) {
        System.out.println("You won! Computer chose " + computer + " and you chose " + user);
    } else {
        System.out.println("Computer won! Computer chose " + computer + " and you chose " + user);
    }
} else { // computer = scissors
    if (user.equals("rock")) {
        System.out.println("You won! Computer chose " + computer + " and you chose " + user);
    } else {
        System.out.println("Computer won! Computer chose " + computer + " and you chose " + user);
    }
}

    }
    static String userInput(Scanner sc ) {

        String  you = sc.nextLine() ; 
        HashMap<String , String > usr = new HashMap<>() ; 
        usr.put("r" , "rock") ; 
        usr.put("p" , "paper") ;
        usr.put("s","scissors") ; 
           if (!usr.containsKey(you)) {
            System.out.println("plzz give valid input ");
            return null ; 
           }
        return  usr.get(you);
    }

    static String compInput ( Random r ) {
        HashMap<Integer , String > cmp = new HashMap<>() ; 
        cmp.put(0, "rock") ; 
        cmp.put(1, "paper") ; 
        cmp.put(2, "scissors") ;
        int comp = r.nextInt(3) ; 
        return cmp.get(comp) ; 
    }
}




