package com.srini.codility;

public class LamdaTest {
	
	public interface Sayable {
		public String say(String name);
	}

	public static void main(String[] args) {
		Sayable s1 = name -> {
			return "Hello" + name;
		};
		System.out.println(s1.say("Anish "));
		
		Sayable s2 = new Sayable() {
			
			@Override
			public String say(String name) {
				return "Hello " + name;
			}
		};
		System.out.println(s2.say("Srini"));
	
		
	}
}
