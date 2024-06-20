package testclasses;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;


public class SearchTest extends BaseTest
{
	@Test(priority = 1)
	public void verifyTitle()
	{
		String title = search.getTitleOfPage();
		
		boolean ispresent = title.contains("Mumbai");
		
		Assert.assertEquals(ispresent, true);
	}
	
	@Test(priority = 2)
	public void searchProduct() throws IOException
	{
	}
	
	
	@Test(priority = 3)
	public void validateSearchResults()
	{
		search.getSearchResults();
}
}