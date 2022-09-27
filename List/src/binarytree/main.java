package binarytree;

public class main {

		public static void main(String[]args) {
			
			Buildtree meinBaum = new Buildtree();
			meinBaum.root = new Element(42);
			meinBaum.root.insert(9);
			meinBaum.root.insert(8);
			meinBaum.root.insert(14);
			meinBaum.root.insert(90);
			meinBaum.root.insert(122);
			meinBaum.root.insert(569);
			meinBaum.root.insert(89);
			
		//	meinBaum.root.left.right.show();
			System.out.println(meinBaum.root.depth(1));
			meinBaum.root.preOrder();
		}
}
