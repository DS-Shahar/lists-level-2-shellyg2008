package reshimot;

public class exe2 {
	public static Node<Integer> seder_ole(Node<Integer> l1, Node<Integer> l2) {
	    Node<Integer> dummy = new Node<>(-1);
	    Node<Integer> current = dummy;

	    while (l1 != null && l2 != null) {
	        if (l1.getValue() < l2.getValue()) {
	            current.setNext(l1);
	            l1 = l1.getNext();
	        } else {
	            current.setNext(l2);
	            l2 = l2.getNext();
	        }
	        current = current.getNext();
	    }

	    if (l1 != null) {
	        current.setNext(l1);
	    } else {
	        current.setNext(l2);
	    }

	    return dummy.getNext();
	}
	
	public static int find_min(Node l1) {
		 int min = l1.getValue();

		    while (l1 != null) {
		        if (l1.getValue() < min) {
		            min = l1.getValue();
		        }
		        l1 = l1.getNext();
		    }

		    return min;
		}
	
	public static Node exe2(Node head) {
	    Node<Integer> min_p = head;
	    Node<Integer> current = head.getNext();
	    Node<Integer> prev_min = new Node<>(-1);
	    Node<Integer> prev_cur = head;
	    Node<Integer> newlist = new Node<>(-1);
	    Node<Integer> newlist_tail = newlist;

	    prev_min.setNext(min_p);
	    prev_cur.setNext(current);

	    while (head != null) {
	        while (current != null) {
	            if (min_p.getValue() <= current.getValue()) {
	                current = current.getNext();
	                prev_cur = prev_cur.getNext();
	            } else {
	                min_p = current;
	                prev_min = prev_cur;
	                current = current.getNext();
	                prev_cur = prev_cur.getNext();
	            }
	        }

	        newlist_tail.setNext(min_p);
	        newlist_tail = newlist_tail.getNext();

	        if (min_p == head) {
	            head = head.getNext();
	        } else {
	            prev_min.setNext(prev_min.getNext().getNext());
	        }

	        if (head != null) {
	            min_p = head;
	            current = head.getNext();
	            prev_min = new Node<>(-1);
	            prev_cur = head;
	            prev_min.setNext(min_p);
	            prev_cur.setNext(current);
	        }
	    }

	    return newlist.getNext();
	}
	
	


	public static void main(String[] args) {
		  Node<Integer> L1 = new Node<>(1); 
		    Node<Integer> second = new Node<>(2);
		    Node<Integer> third = new Node<>(3);
		    Node<Integer> fourth = new Node<>(1);
		    Node<Integer> fifth = new Node<>(7);
		    L1.setNext(second);
		    second.setNext(third);
		    third.setNext(fourth);
		    fourth.setNext(fifth);
		    Node<Integer> L2 = new Node<>(2); 
		    Node<Integer> second2= new Node<>(1);
		    Node<Integer> third2 = new Node<>(8);
		    Node<Integer> fourth2 = new Node<>(5);
		    Node<Integer> fifth2 = new Node<>(4);
		    L2.setNext(second2);
		    second2.setNext(third2);
		    third2.setNext(fourth2);
		    fourth2.setNext(fifth2);
		    
		    Node<Integer> L3 = new Node<>(1); 
		    Node<Integer> second3= new Node<>(2);
		    Node<Integer> third3 = new Node<>(3);
		    Node<Integer> fourth3 = new Node<>(4);
		    Node<Integer> fifth3 = new Node<>(6);
		    L3.setNext(second2);
		    second3.setNext(third3);
		    third3.setNext(fourth3);
		    fourth3.setNext(fifth3);
		    
		    Node<Integer> L4 = new Node<>(5); 
		    Node<Integer> second4= new Node<>(6);
		    Node<Integer> third4 = new Node<>(9);
		    Node<Integer> fourth4 = new Node<>(10);
		    Node<Integer> fifth4 = new Node<>(11);
		    L4.setNext(second4);
		    second4.setNext(third4);
		    third4.setNext(fourth4);
		    fourth4.setNext(fifth4);
		    System.out.println(exe2(L2));
		    System.out.println(seder_ole(L3,L4));


	
	}}


