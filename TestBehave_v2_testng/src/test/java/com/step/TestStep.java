package com.step;




import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.testng.Assert;


public class TestStep {
	@Given("I am on $host")
	public void getHostPage(String host){
		System.out.println("----------------------"+host);
		Assert.assertEquals(1, "wwwwwwwwwww");
		Assert.assertEquals(1, 2);
	}

	@Then("print $hello")
	public void hello(String hello){
		System.out.println("----------------------"+hello);
	}
}
