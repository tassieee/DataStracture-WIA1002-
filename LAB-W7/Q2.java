import java.util.Scanner;

public class Q2 {
    int ib;
   

    public Q2(String data) {
        this.ib = 1000;
        String a;
        MyQueue<String> m = new MyQueue<>(500000000);
       String [] store=data.split(" ");


        for (int i = 0; i < store.length; i++) {
            if (store[i] == "D") {
                 a = String.valueOf(store[i]);
                    ib+= Integer.parseInt(a);
                    m.enqueue(a);
                    i++;
                
            } else if (store[i] == "W") {
                while (store[i] != "|") {
                    a = String.valueOf(store[i]);
                    ib -= Integer.parseInt(a);
                    m.dequeue();
                    i++;
                }
            } else {
                System.out.println("Invalid Output");
            }
        }
        System.out.println("Initial Balance: " + ib);
    }
    

    public static void main(String[] args) {
        System.out.println("Enter Transactions : ");
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        Q2 Q = new Q2(v);
    }
}
