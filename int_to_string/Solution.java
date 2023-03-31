import java. util. Scanner; 

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in); 
        int n = sc.nextInt(); 
        String s = Integer.toString(n);
        int g = Integer.parseInt(s);
        
        if ( n == g ) {
            System.out.println("Good job");
        }
        
        else {
            System.out.println("Wrong answer");
        }
    
    }
}