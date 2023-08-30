/*package org.file;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Day8Set {
	public static void main(String[] args) {
		Set<Integer> c = new HashSet<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(70);
		c.add(80);
		c.add(90);
		c.add(10);
		c.add(20);
		System.out.println(c);
		Set<Integer> d = new LinkedHashSet<Integer>();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(60);
		d.add(70);
		d.add(80);
		d.add(90);
		d.add(10);
		d.add(20);
		System.out.println(d);
		Set<Integer> e = new TreeSet<Integer>();
		e.add(10);
		e.add(20);
		e.add(30);
		e.add(40);
		e.add(50);
		e.add(60);
		e.add(70);
		e.add(80);
		e.add(90);
		e.add(10);
		e.add(20);
		System.out.println(e);
	}
}
*/

/*package org.file;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {
		List <Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println(l);
		Set<Integer> s= new HashSet<Integer>();
		s.addAll(l);
		System.out.println(s);
		
		List <Integer> a = new LinkedList<Integer>();
		a.add(105);
		a.add(205);
		a.add(305);
		a.add(405);
		a.add(505);
		a.add(605);
		a.add(705);
		a.add(805);
		a.add(505);
		a.add(605);
		System.out.println(a);
		Set<Integer> b= new HashSet<Integer>();
		b.addAll(a);
		System.out.println(b);
		
		List <Integer> c = new LinkedList<Integer>();
		c.add(100);
		c.add(200);
		c.add(300);
		c.add(400);
		c.add(500);
		c.add(600);
		c.add(700);
		c.add(100);
		c.add(300);
		c.add(500);
		System.out.println(c);
		Set<Integer> d= new HashSet<Integer>();
		d.addAll(c);
		System.out.println(d);
		}
}
	
*/

/*package org.file;
import java.util.HashSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new HashSet<Integer>();
		a.add(105);
		a.add(205);
		a.add(305);
		a.add(405);
		a.add(505);
		a.add(605);
		a.add(705);
		a.add(805);
		for(Integer h:a) {
			System.out.println(h);
		}

	}
}

*/

/*package org.file;
import java.util.TreeSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new TreeSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(10);
		a.add(20);
		for(Integer h:a) {
			System.out.println(h);
		}

	}
}

*/

/*package org.file;
import java.util.HashSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(10);
		a.add(20);
		for(Integer h:a) {
			System.out.println(h);
		}

	}
}

*/

/*package org.file;
import java.util.HashSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
		Set <Integer> b = new HashSet<Integer>();
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(80);
		
		a.retainAll(b);
		System.out.println(a);
	}
}

*/

/*package org.file;
import java.util.LinkedHashSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new LinkedHashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
		Set <Integer> b = new LinkedHashSet<Integer>();
		b.add(10);
		b.add(20);
		b.add(60);
		b.add(50);
		b.add(40);
		b.add(70);
		b.add(80);
		b.add(90);
		
		a.retainAll(b);
		System.out.println(a);
	}
}

*/

/*package org.file;
import java.util.TreeSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new TreeSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		
		Set <Integer> b = new TreeSet<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
		b.add(600);
		b.add(700);
		b.add(8000);
		
		a.retainAll(b);
		System.out.println(a);
	}
}

*/

/*package org.file;
import java.util.HashSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
		Set <Integer> b = new HashSet<Integer>();
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(80);
		
		a.removeAll(b);
		System.out.println(a);
	}
}

*/

/*package org.file;
import java.util.LinkedHashSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new LinkedHashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
		Set <Integer> b = new LinkedHashSet<Integer>();
		b.add(10);
		b.add(20);
		b.add(60);
		b.add(50);
		b.add(40);
		b.add(70);
		b.add(80);
		b.add(90);
		
		a.removeAll(b);
		System.out.println(a);
	}
}

*/

/*package org.file;
import java.util.TreeSet;
import java.util.Set;
public class Day8Set {
	public static void main(String[] args) {

		Set <Integer> a = new TreeSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		
		Set <Integer> b = new TreeSet<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
		b.add(600);
		b.add(700);
		b.add(8000);
		
		a.removeAll(b);
		System.out.println(a);
	}
}

*/

/*package org.file;
import java.util.Scanner;
public class Day8Set {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=10;
		System.out.println("Enter Id no:");
		int idno=s.nextInt();
		System.out.println("Name:");
		String Name=s.next();
		System.out.println("Phone no:");
		long phno=s.nextLong();
		System.out.println("Address:");
		String Address=s.next();
		System.out.println("Dob:");
		long dob=s.nextLong();
		System.out.println("Doj:");
		long doj=s.nextLong();
		System.out.println("Email:");
		String email=s.next();
		System.out.println("Gender:");
		char gend=s.next().charAt(0);
		System.out.println("Salary:");
		float sal=s.nextFloat();
		
		System.out.println("\n EMPLOYEE DETAILS\n============");
		for (int i = 0; i < n; i++) {
	        System.out.println("Employee id: " + idno+ "\n"+ "Name:" + Name+ 
	  "\n"+"phone no:" + phno +"\n"+"Address:"+Address+"\n"+"Dob:"+dob +
	"\n"+"Doj:"+doj +"\n"+"Email:"+email+"\n"+"Gender:"+ gend +"\n"+"Salary:"+sal);

	  }
	 }
}
		
*/

package org.file;
import java.util.Scanner;
public class Day8Set  {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=10;
			System.out.println("Enter Id no:");
			int Idno=s.nextInt();
			System.out.println("Name:");
			String Name=s.next();
			System.out.println("Phone no:");
			long Phno=s.nextLong();
			System.out.println("Address:");
			String Address=s.next();
			System.out.println("Dob:");
			long Dob=s.nextLong();
			System.out.println("Email:");
			String Email=s.next();
			System.out.println("Gender:");
			char Gend=s.next().charAt(0);
			
			System.out.println("\nSTUDENT DETAILS\n================");
			for(int i=0; i<=n; i++){
			System.out.println("Student name   :" +Name);
			System.out.println("Student Id     :" +Idno);
			System.out.println("Student Phno   :" +Phno);
			System.out.println("Student Address:" +Address);
			System.out.println("Student Dob    :" +Dob);
			System.out.println("Student Email  :" +Email);
			System.out.println("Student Gender :" +Gend);
			}

	}
}

	
	
		
		
		
		
		
		
		
		
		
		
		
		