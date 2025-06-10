package DropDownHandling;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
	    WebElement dropdown= driver.findElement(By.id("products-orderby"));
	    
	    //To handle dropdown 
	    Select select= new Select(dropdown);
	    
	    //To check the dropdown is single select or multiselect
	    System.out.println(select.isMultiple());
	    
	    //To select the option by using value it means attribute value
	    select.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
	    
	  //To select the option by using visible text
	    select.selectByValue("Price: High to Low");
	    Thread.sleep(2000);
	    
	    //to get all options
	   List<WebElement>   alloptions= select.getOptions();
	   
	   for(WebElement element: alloptions) {
		   System.out.println(element.getText());
	   }
	   
	   driver.quit();
	    
	}

}
