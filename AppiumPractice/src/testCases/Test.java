package testCases;

import utils.Generic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = Generic.readProperties(System.getProperty("user.dir")+"\\test.properties", "url");
		System.out.println(url);
	}

}
