package com.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class TestLogin {
		@Given("yahoo login address $url")
		public void getHostPage(String url){
			System.out.println("++++++++++++++++++++++++++++++"+url);
		}

		@Then("print $successful")
		public void hello(String successful){
			System.out.println("++++++++++++++++++++++++++++++"+successful);
		}
}
