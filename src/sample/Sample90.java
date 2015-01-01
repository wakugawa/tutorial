package sample;

public class Sample90 {
	  public static void main(String[] args) {
	        new Sample90().execute();
	    }
	 
	    public void execute() {
	        java.util.List list = new java.util.ArrayList();
	        list.add("A");
	        list.add("B");
	 
	        for (int i = 0 ; i < list.size() ; i++) {
	            String s = (String)list.get(i);
	            System.out.print(s + " ");
	        }
	 
	        System.out.println("");
	        java.util.LinkedList llist = new java.util.LinkedList();
	        llist.add("A");
	        llist.add("B");
	        for (int i = 0 ; i < llist.size() ; i++) {
	            String s = (String)llist.get(i);
	            System.out.print(s + " ");
	        }
	    }
	}