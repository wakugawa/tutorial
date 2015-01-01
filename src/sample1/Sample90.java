package sample1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Sample90 {
 public static void main(String[] args) {
	 new Sample90().execute();
	}
  
 public void execute() {
     List list = new ArrayList();
     list.add("A");
     list.add("B");
     for (int i = 0; i < list.size(); i++) {
         String s = (String) list.get(i);
         System.out.print(s + " ");
     }
     System.out.println("");
     list = new LinkedList();
     list.add("A");
     list.add("B");
     for (int i = 0; i < list.size(); i++) {
         String s = (String) list.get(i);
         System.out.print(s + " ");
     }
   }
 }
