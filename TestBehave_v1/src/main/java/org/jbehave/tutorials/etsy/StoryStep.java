package org.jbehave.tutorials.etsy;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class StoryStep {
	@Given("I am on $host")
	public void getHostPage(String host){
		System.out.println(host);
	}
	@Then("print $hello")
	public void hello(String hello){
		System.out.println(hello);
	}
}
