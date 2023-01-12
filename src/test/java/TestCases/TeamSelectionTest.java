package TestCases;
import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.Test;
import TestMethods.TestMethod;


public class TeamSelectionTest {

	@Test
	public void validateForeignPlayerLimit() throws IOException {
		
	
	int foreignPlayers	= TestMethod.numberofForeignPlayers();
	Assert.assertTrue(foreignPlayers<=4);
	System.out.println("Pass : validateForeignPlayerLimit");


	}

	
	@Test
	public void validateWicketKeeperAvailability() throws IOException {
		
	
		int wicketKeepers	= TestMethod.numberofWicketKeepers();
		Assert.assertTrue(wicketKeepers>=1);
		System.out.println("Pass : validateWicketKeeperAvailability");
	
	}
}
