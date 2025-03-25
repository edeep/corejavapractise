package pradeeptest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personList = new ArrayList<Person>();
		personList.add( new Person("ccc","bbb"));
		personList.add( new Person("aaa","ddd"));
		Collections.sort(personList,new PersonAscSorter());
		System.out.println("Collections data in Ascending Order by First Name");
		for(Person p : personList) {
			System.out.println(p.getFirstName());
		}
		
		Collections.sort(personList,new PersonLastNameSorter());
		System.out.println("Collections data in Ascending Order by Last Name");
		for(Person p : personList) {
			System.out.println(p.getFirstName());
		}


	}

}

class Person implements Comparable<Person>{
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class PersonAscSorter implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}

class PersonLastNameSorter implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getLastName().compareTo(o2.getLastName());
	}
	
}
