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
	public static int exe3(Node<Integer> a1, int n){
		Node<Integer> a = a1;
		int i=0;
		int length=0;

		 while (a!= null) {
	            length++;
	            a =a.getNext();
	        }
		 a=a1;
		 
		 int minl=length;
		 int minr=length;
		 
		 while(a!=null) {
			if(a.getValue()==n) {
				if(i<minl) {
					minl=i;
					
				}
				if(length-i-1<minr) {
					minr=length-i-1;
				}
			}
			i++;
			a=a.getNext();
		}
		 return minr+minl;
	}
	
	
	
	
	 public static boolean exe4(Node<Integer>head) {
		 Node<Integer> list = head;
		 Node<Integer> current = head.getNext();
		 while(list!=null) {
			 
			 while(current!=null) {
				 if(list.getValue()==current.getValue()) {
					 return false;
				 }
				 else {
					 current=current.getNext();
				 }
			 }
			 list=list.getNext();
		 }
	return true;	 
	 }
	 
	public static Node exe5(Node<Integer>L1) {
		    Node<Integer> head = L1;
		    Node<Integer> current1 = L1;
		    Node<Integer> current2 = L1;


		    while (current1.hasNext()) {
		    	current2=current1;
			    while (current2.hasNext()) {
			    	if(current1.getValue()==current2.getNext().getValue()) {
			    		current2.setNext(current2.getNext().getNext());
			    	}
			    	else {
			    		current2=current2.getNext();
			    	}
			    	
			    }
	    		current1=current1.getNext();

		    	
		    }
	    	return head;

		}
		
	 public static int exe6(Node<Integer> L1) {
	        Node<Integer> head = L1;
	        int counter = 1;
	        int max = 0;

	        while (head.getNext() != null) {
	            if (head.getNext().getValue() >= head.getValue()) {
	                counter++;
	                head = head.getNext();
	            } else {
	            	if(counter>max) {
	            		max=counter;
	            	}
	                counter = 1;
	                head = head.getNext();
	            }
	        }
	        if(counter>max) {
	        	max=counter;
	        }
	        return max;
	    }

	 
	 public static void exe7(Node<Integer> L1) {
		    Node<Integer> head = L1;
		    Node<Integer> maxPointer = head;
		    Node<Integer> startMax = head;
		    Node<Integer> startCur= head;
		    int counter = 1;
		    int max = 0;

		    while (head.getNext() != null) {
		        if (head.getNext().getValue() >= head.getValue()) {
		            counter++;
		            head = head.getNext();
		        } 
		        else {
		            if (counter > max) {
		                max = counter;
		                startMax = startCur;
		            }
		            counter = 1;
		            head = head.getNext();
		            startCur = head;
		        }
		    }
		    if (counter > max) {
		        max = counter;
		        startMax = startCur;
		    }

		    Node<Integer> temp = startMax;
		    for (int i = 0; i < max; i++) {
		        System.out.print(temp.getValue() + " ");
		        System.out.println();
		        temp = temp.getNext();
		    }
		}
	 

		public static boolean exe8(Node<Integer> a1,Node<Integer> b1){
			Node<Integer> a = a1;
	        Node<Integer> b = b1;
			while(a!=null) {
				if(b==null) {
					b=b1;
				}
				if(a.getValue()==b.getValue()) {
					b=b.getNext();
				}
				else {
					return false;
				}
				a=a.getNext();
			}
			if(b==null) {
				return true;
			}
			return false;
			
		}
		
		
		public static boolean exe9(Node<Integer> a1,Node<Integer> b1){
			Node<Integer> a = a1;
	        Node<Integer> b = b1;
			while(a!=null) {
				if(b==null) {
					return true;
				}
				if(a.getValue()==b.getValue()) {
					b=b.getNext();
				}
				else {
					b=b1;
				}
				a=a.getNext();
			}
			if(b==null) {
				return true;
			}
			return false;
		}
		
		
		
		public static boolean exe10(Node<Integer> a1){
			int [] arr= {0,0,0,0,0,0,0,0,0,0,0};
			while(a1!=null) {
				if(a1.getValue()>10 && a1.getValue()<1) {
					arr[a1.getValue()-1]++;
				}
				a1=a1.getNext();
			}
			for(int i=0;i<10;i++) {
				if(arr[i]==0) {
					return false;
				}
			}
			return true;
		}
		
		
		public static boolean f10(Node<Integer> a1){
			Node<Integer> a = a1;
			boolean b=false;
			for(int i=1;i<11;i++) {
				b=false;
				while(a1!=null) {
					if(i==a1.getValue()) {
						b=true;
					}
					a1=a1.getNext();
			}
				a1=a;
				if(b==false) {
					return false;
				}
			}
			return true;
		
		}


	 
	 
	 


	public static void main(String[] args) {
		  Node<Integer> L1 = new Node<>(1); 
		    Node<Integer> second = new Node<>(2);
		    Node<Integer> third = new Node<>(3);
		    Node<Integer> fourth = new Node<>(1);
		    Node<Integer> fifth = new Node<>(6);
		    L1.setNext(second);
		    second.setNext(third);
		    third.setNext(fourth);
		    fourth.setNext(fifth);
		    exe7(L1);
		   System.out.println("the count is "+exe6(L1));
		   System.out.println(exe4(L1));
		   System.out.println(exe5(L1));

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


