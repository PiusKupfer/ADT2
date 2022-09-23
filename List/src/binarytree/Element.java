package binarytree;

public class Element
{
   public int value;
   public Element left, right;

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

   public void show()
   {
      System.out.println(""+value);
   }
}