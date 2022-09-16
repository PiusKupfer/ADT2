
public class Stack {

	public ListenElement kopf;
	public ListenElement tmp;
	
	public void stack(int wert) {
		kopf = new ListenElement(wert);
		
	}

	
	
	public void push(int wert) {
	
		tmp = kopf	;	
		kopf = new ListenElement(wert);
		kopf.add(tmp);
}
	public void pop() throws Exception {
		
		System.out.println(kopf.getInhalt());
		kopf= kopf.next;
		
	}
	
	public void top() throws Exception {
	
		System.out.println(kopf.getInhalt());
	}
	 
	public int getGroesse() {
		return kopf.getGroesse(0);
	}
	
}
