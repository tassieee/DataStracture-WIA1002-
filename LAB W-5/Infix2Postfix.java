
import java.util.Scanner;
import java.util.Stack;

public class Infix2Postfix {
     public static boolean isoperator(char c){
        return c == '(' || c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
    public static int pcdnc(char data){            //SET A PRECEDENCE ,SO THAT WE CAN COMPARE LATER
        switch(data){
            case '+':
            case '-':
                return 1;
            case '*':
                case'/':
                    return 2;
                case '^':
                    return 3;
                default:
                    return -1;
            }
         }

    public static String toPostfix(String str) {
        Stack s = new Stack();
        StringBuilder cd=new StringBuilder();                                   
        char [] store=str.toCharArray();                                        // IT WILL CONVERT THE STRING INTO CHAR. 
                                                                                // ALSO CAN USE "char keep=str.charAt(i); it also count as a char
        for(int i=0;i<str.length();i++){                                        // GOING THOUGH EACH CHARACTER
            char keep=store[i];
            
          if(Character.isLetterOrDigit(store[i])){                              // CHECK IF THE CHAR IS LETTER OR DIGIT OR SOMETHING ELSE.
              cd.append(keep);                                                  // IF CHAR , APPEND .
              
          }
              else if(keep=='('){
                      s.push(keep);
                      }
              
               else if (keep == ')') {
                while (/*!s.isEmpty() && */ ((char)s.peek())!= '(' ) {          // IF WE GET CLOSING BRACTER, THEN WE NEED TO POP ALL THE ELEMENT BETWEEN P.t.
                    cd.append(s.pop());
                }
                s.pop();
               
             }
               
              else  {
                 while(!s.isEmpty() &&  pcdnc(keep)<=pcdnc((char) s.peek()) ){  // IF GET OPERATOR, CHECK THE RULES AND POP BASED ON IT.
                   
                     cd.append(s.pop());
                   }
                 s.push(keep);
              }
        }
        while(!s.isEmpty()){
            cd.append(s.pop());
        }
          
              System.out.println("POSTFIX : "+cd);
        
        return cd.toString();
    }
    
    
    public static void main(String[] args) {
        Infix2Postfix p = new Infix2Postfix();
        String n="((((A-B)+((M^N)*(O+P)))-((Q/(R^S))*T))+Z)";
        System.out.println("INFIX : "+n);
        Scanner sc=new Scanner(System.in);
       // String n=sc.nextLine();               //IF U WANT U CAN TAKE THE USER INPUT HERE
        
        p.toPostfix(n);
        
    }
    
    }


  