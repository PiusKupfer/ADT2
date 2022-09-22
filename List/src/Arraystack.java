
public class Arraystack {
	 private int[] stapel;
	    private int tos;
	    
	    public Arraystack()
	    {
	        stapel = new int[100];
	        tos = 0;
	    }
	    
	   public void push(int x)
	   {
	      if (tos < 99)
	      {
	    	  
	         tos++;
	         
	         stapel[tos] = x;
	         System.out.print(x + " ");
	         
	      }  
	   }
	   public int[] copy() {
		   int[] tmp = new int[100];
		   int[] copy = new int[100];
		   int tmptos=1;
		   
		   while(tos>0) {
			   tmp[tmptos] = top();
			   pop();
			   tmptos++;
		   }
		   
		   while(tmptos >1) {
			   
			   
			   stapel[tos]= tmp[tmptos];
			   copy[tos]= tmp[tmptos];
			   tmptos--;
			   System.out.print( tmp[tmptos] + " ");
		   }
		   
		   return copy;
	   }
	   
	   public int[] add(int[] x) {
		   
		   int[] sum= new int[100];
		   
		   return sum;
	   }
	   
	   
	   public void pop()
	   {
	      if (!empty()) tos--;
	   }
	   
	   public int top()
	   {
	      if (!empty())
	         return stapel[tos];
	      else
	         return -1;
	   }
	   
	   public boolean empty()
	   {
	      return (tos == -1); 
	   }
	   

		
}
