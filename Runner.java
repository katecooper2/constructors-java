package com.qa.qacommunity;

public class Runner {
	
	public static void main(String[] args) {
		
		Person Kate = new Person("Kate", 19, 180, 6, "Software Engineer");
		Person Joe = new Person("Joe", 20, 210, 10, "footballer");
		Person Ellen = new Person("Ellen", 19, 176, 5, "assistant");
		Person Harry = new Person("Harry", 21 , 215, 11, "solicitor");
		
		Kate.greet();
		
	}

}
