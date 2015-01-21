
class Queue
   {
   private int maxSize;
   private int[] arr;
   private int front;
   private int rear;
   private int nItems;

   public Queue(int s)         
      {
      maxSize = s;
      arr = new int[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
      }

   public void insert(int j)   
      {
      if(rear == maxSize-1)         
         rear = -1;
      arr[++rear] = j;       
      nItems++;                    
      }

   public int remove()         
      {
      int temp = arr[front++]; 
      if(front == maxSize)           
         front = 0;
      nItems--;                     
      return temp;
      }

   public int peekFront()      
      {
      return arr[front];
      }

   public boolean isEmpty()   
      {
      return (nItems==0);
      }

   public boolean isFull()     
      {
      return (nItems==maxSize);
      }

   public int size()           
      {
      return nItems;
      }

   }  

class test
   {
   public static void main(String[] args)
      {
      Queue theQueue = new Queue(5);  

      theQueue.insert(2);           
      theQueue.insert(4);
      theQueue.insert(6);
      theQueue.insert(20);

      theQueue.remove();              
      theQueue.remove();              
      theQueue.remove();

      theQueue.insert(10);           
      theQueue.insert(40);            

      while( !theQueue.isEmpty() )    
         {                            
         int n = theQueue.remove();  
         System.out.print(n);
         System.out.print(" ");
         }
      System.out.println("");
      }  
   }  

