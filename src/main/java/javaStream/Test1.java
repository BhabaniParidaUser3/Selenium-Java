package javaStream;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Test1 {

	public static void main(String[] args) {
		//WAP to count the number of names starting  with alphabate A in list
	ArrayList<String> names=new ArrayList<String>();
	names.add("Abhijeet");
	names.add("don");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
	int count=0;
	for(int i=0;i<names.size();i++)
	{
		String actual=names.get(i);
		if(actual.startsWith("A")) {
			count++;
			
		}
	}
	System.out.println(count);
		
		

	}

}
