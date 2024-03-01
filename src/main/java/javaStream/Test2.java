package javaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to count the number of names starting with alphabate A in list
		System.out.println("1st program result: ");
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		
		System.out.println("2nd program result: ");
		// there is no life of intermediate operation if there is no terminal operation
		names.stream().filter(s -> s.startsWith("A"));
		// terminal operation is execute only if intermediate operation return true
		long c2 = Stream.of("Arihit", "Abhay", "Aeroplane", "Anadaman", "don").filter(s -> s.startsWith("A")).count();
		System.out.println(c2);
		
		System.out.println("3rd program result: ");
        //terminal operation is not execute  if intermediate operation not return true
		long c1 = Stream.of("elephant", "don", "himesh", "lakshman", "Ram").filter(s -> s.startsWith("A")).count();
		System.out.println(c1);
		
		System.out.println("4th program result: ");
		//print the names from list having more than 4 character
		Stream.of("amazon","flipkart","cts","csg","comcast").filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		System.out.println("5th program result: ");
		//print only one name from list having more than 4 character
		Stream.of("amazon","flipkart","cts","csg","comcast").filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		System.out.println("6th program result: ");
		//print in uppercase which string end with a and charchter length greater than 4 form the list
		Stream.of("india","cat","agoda","alpha").filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("7th program result: ");
		//print in uppercase with sorted whcih string start with a from the list("Remember it is a case sensitive always")
		Stream.of("Agora","Alora","Alpha","Aroma","Apple").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		
		System.out.println("8th program result:" );
		//print the result in sorted order by merging two stream
		List<String> domesticflight=new ArrayList<String>();
		List<String> Internationalflight=new ArrayList<String>();
		domesticflight.add("indigoAirline");
		domesticflight.add("airasiaAirline");
		domesticflight.add("akashairAirline");
		Internationalflight.add("kuwaitAirline");
		Internationalflight.add("gulfAirline");
		Internationalflight.add("saudiArabianAirline");
		Stream flight=Stream.concat(domesticflight.stream(), Internationalflight.stream());
		flight.sorted().forEach(s->System.out.println(s));
		
		
		System.out.println("9th program result:" );
		//print true if required word is present in the list 
		boolean flag1=Stream.of("Adam","AMD","FHD","ACCER").anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag1);
		//print false if required word is not present in the list 
		boolean flag2=Stream.of("Adam","AMD","FHD","ACCER").anyMatch(s->s.equalsIgnoreCase("man"));
		System.out.println(flag2);
		
		
		
		System.out.println("10th program result: ");
		// convert a stream into list 
		List<String>ls =Stream.of("india","cat","agoda","alpha").filter(s->s.length()>4).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		System.out.println("11th program resulty: ");
		//print unique number from the list
		List<Integer>value=Arrays.asList(1,1,4,4,5,6,2,8);
		value.stream().distinct().forEach(s->System.out.println(s));
		
		
		System.out.println("12th program resulty: ");
		//sort the array-3rd index-
		List<Integer>value1=Arrays.asList(1,1,4,4,5,6,2,8);
		List<Integer>li=value1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		

		
		
		

	}

}
