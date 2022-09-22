import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		
	/*	
		Stack stack = new Stack(1);
		      stack.push(3);
		      stack.push(5);
		      stack.push(7);
		      stack.push(9);
		      stack.push(11);
		      stack.push(13);
		     
		      stack.top();
		      System.out.println(stack);
		      System.out.println( stack.getGroeße());
		      
	  Queue queue = new Queue(1);
	  queue.enqeue(2);
	  queue.enqeue(4);
	  queue.enqeue(6);
	  queue.enqeue(8);
	  queue.top();
	  System.out.println(queue);
	  */
		
		/*
	  Arraystack s=new Arraystack();
	  s.push(1);
	  s.push(3);
	  s.push(5);
	  s.push(78);
	  s.push(6);
	  s.push(3);
	  s.push(8);
	  System.out.println(" ");
	  s.copy();
	  
	  int[] add= {5,4,6,9,12,0};
	  System.out.println(" ");
	  s.add(add);*/
		
		Arrayqueue q = new Arrayqueue();
		q.enqueue(2);
		q.enqueue(9);
		q.enqueue(78);
		q.enqueue(34);
		q.enqueue(5);
		q.enqueue(88);
	
		q.ausgabe();



		
		Arrayqueue s = new Arrayqueue();
		s.enqueue(1);
		s.enqueue(2);
		s.enqueue(3);
		s.enqueue(4);
		s.enqueue(5);
		s.ausgabe();
		
		q.concet(s);
		q.ausgabe();
		
		System.out.println( q.equal(5));
		
		
	

	  
	  

		
		
		/*Liste liste = new Liste(3);
		liste.add(5);
		liste.add(43);
		liste.add(9);
		liste.add(12);
		liste.add(13);
		liste.add(7);
		
		System.out.println(liste);
		
		liste.addHead(42);
		
		System.out.println(liste);
		
		
		System.out.println(liste.counter());
		
		liste.firstLast();
		
		System.out.println("\n"+liste.find(4));
		
		liste.remove(7);
		System.out.println(liste);
		
		/*Quicksort q= new Quicksort();
		int[] zuSortieren= {7,2,4,8,6,1,3,5,9,3};
		System.out.println(Arrays.toString(zuSortieren));
		q.quicksort(zuSortieren,0,9);
		System.out.println(Arrays.toString(zuSortieren));*/
	}

}