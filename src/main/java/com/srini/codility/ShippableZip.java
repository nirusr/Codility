package com.srini.codility;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShippableZip {
	
	public static void main(String[] args) {
		String filename = "/Users/srinivasangovindaraji/Documents/zipcode.txt";
		Stream<String> zipcodeCollections = Stream.empty();
		Stream<Integer> s1 = Stream.empty();
		try {
			s1 = (Stream<Integer>) Stream.concat(zipcodeCollections, Files.lines(Paths.get(filename))).distinct().sorted().collect(Collectors.toList());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		s1.forEach(range -> System.out.print(range));
		
		
		//Assuming reading from file
		Integer[] z1 = {94600, 94699 };
		Integer[] z2 = {94800, 94899 };
		Integer[] z3 = {94500, 94599 };
		Integer[] z4 = {94500, 94599 };
		
		Stream<Integer> s = Stream.concat(Stream.of(z2), Stream.of(z1)).distinct().sorted();
		s.forEach(e -> System.out.print(e +","));
		
				
		IntStream intStream = IntStream.range(94600, 94699);
		System.out.println(intStream.findFirst());
		

		
	}

}
