package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DemoApplicationTests {

	private Calculator calculator=new Calculator();
	@Test
	void contextLoads() {
	}

	@Test
	@Disabled
	public void doSum()
	{
		int expectedRes=35;
		int actualRes=calculator.doSum(30, 5);

		assertThat(actualRes).isEqualTo(expectedRes);
	}

	@Test
	public void doMultiply()
	{
		int expectedRes=49;
		int actualRes=calculator.doMultiply(7, 7);
		assertThat(actualRes).isEqualTo(expectedRes);
	}

	 //comparing
	@Test
	public void compareNum()
	{
		boolean actualRes=calculator.compare(44,44);
		boolean expectedRes=true;

		assertThat(actualRes).isTrue();
	}
}
