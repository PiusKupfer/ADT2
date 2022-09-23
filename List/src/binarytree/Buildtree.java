package binarytree;

public class Buildtree
{
   public Element root;
   public 	Element aknoten=root;

   public Buildtree()
   {
      root = new Element(100);
      root.left = new Element(50);
      root.right = new Element(150);   
   }
}
   
