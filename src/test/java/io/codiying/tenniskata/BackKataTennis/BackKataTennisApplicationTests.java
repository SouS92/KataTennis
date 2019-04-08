package io.codiying.tenniskata.BackKataTennis;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class BackKataTennisApplicationTests {

	@Test
	public void contextLoads() {
	}



	public void testThatCountIsGood(){

	}
}

