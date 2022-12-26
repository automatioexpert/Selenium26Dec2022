package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {
	public static void main(String[] args) {
		TestNG runner =new TestNG();
		List<String> list=new ArrayList<String>();
		list.add("C:\\Users\\valmiki\\git\\repository149\\Selenium26Dec2022\\test-output\\Regression Basic Test Suite\\testng-failed.xml");
		
		runner.setTestSuites(list);
		runner.run();
	}

}
