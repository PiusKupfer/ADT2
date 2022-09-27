package binarytree;

public class Element
{
   public int value;
   public Element left, right;
  public static int  depth = 0;
  public static int maxdepth = 1;
   public Element(int n)
   {
      value = n;
      left = null;
      right = null;
    
   }
   
   public void insert(int value) {
	   

	   if(this.value > value) {
		   if(left ==null) {
			  left= new Element(value);
		   }else {
			   
			   left.insert(value);
		   }
		   
	   }else {
		   if(right ==null) {
			   right= new Element(value);
		   }else {
		
			   right.insert(value);
		   }
	   }
   }
   
   
	   public int depth(int depth) {
	        
	        if(left != null) {
	            depth++;
	            if(depth>maxdepth) {maxdepth++;}
	            System.out.println("Lefttiefe: "+ depth+" Maxtiefe: "+maxdepth);
	            left.depth(depth);
	            depth--;
	        }
	        if(right != null) {
	            depth++;
	            if(depth>maxdepth) {maxdepth++;}
	            System.out.println("Righttiefe: "+ depth+" Maxtiefe: "+maxdepth);
	            right.depth(depth);
	            depth--;}
	            
	        return maxdepth;
	        }
   
   
   
   public void preOrder() {
	  System.out.println(value + " ");
	   if(left != null) {
		   left.preOrder();
	   }
	   if(right != null) {
		   right.preOrder();
	   }
   }
   
   

			   
   
	   
   
	   
   
   

   public void show()
   {
      System.out.println(""+value);
   }
}