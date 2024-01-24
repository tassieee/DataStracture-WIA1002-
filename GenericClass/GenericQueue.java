/**
 *
 * @author HUMYRA
 */
public class GenericQueue<T> {

    int head;
    int tail;
    int maxsize;
    T[] arr;
    

    public GenericQueue(int maxsize) {
        this.maxsize = maxsize;
        this.tail = 0;
        this.head=0;
        arr = (T[]) new Object[maxsize];
    }

    public boolean isEmpty() {
        return tail == 0;
    }

    public boolean isFull() {
        return tail == maxsize;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        return arr[head];
    }

    public T enqueue(T data) {
        if (!isFull()) {
            System.out.print("Enqueue : ");

            arr[tail] = data;
            System.out.println(arr[tail]);
            tail++;
            
        }
        return (T) "Queue is full";
    }

    public T enqueueMany(String data) {
        if(!isFull()) {
            String values[] = data.split(",");
            for (String v : values) {
                enqueue((T) v.trim());
            }
        if(isFull()){
              System.out.println("Queue is full");
        }
        }
        
        System.out.println("");
        return (T) "Queue is full";
    
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException();
        }else{
            System.out.println("Dequeue :" + arr[head]);
            for(int i = 0; i < tail - 1; i++)
        {   
            arr[i] = arr[i+1];
            }
            tail--;
        }
        
        
        return null;
    }

    public void changeOrder(int k){
              if(isEmpty() && k<head && k>=tail){
              throw new RuntimeException();
              }
              else{
                  System.out.println("Change Queue  Order :");
        T temp=arr[k];
        for(int i=k;i>head;i--){
            arr[i]=arr[i-1];
        }
        arr[head]=temp;
        display();
                  System.out.println("");
        }}
   
        
    
    public T dequeueAll() {
        if (isEmpty()) {
           throw new RuntimeException();
        }
        else{
        System.out.println("There is " + (tail) + " iteams in the queue. Dequeuing All....");
            while (!isEmpty()) {
               dequeue();
            }
        }
            return null;
    }


    public void display() {
        if (isEmpty()) {
     System.out.println("Nothing to display.");
        }else{
        System.out.println("There is " + (tail) + " iteams in the queue. Displaying....");
        for (int i = head; i < tail; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
    }
}
