package com.mindtree.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class milestone3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/hovers']")).click();
		String GDP = driver.findElement(By.className("figcaption")).getText();
		System.out.println("user1");
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
	   // driver.findElement(By.xpath("//*[@type=\"checkbox\")).click();
		// driver.findElement(By.cssSelector("input:not(:checked)[type='checkbox']"));
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/inputs']")).click();
	    driver.findElement(By.xpath("//*[@type=\"number\"]")).sendKeys("4567");
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        Select s=new Select(driver.findElement(By.id("dropdown")));
        s.selectByVisibleText("Option 2");
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/upload']")).click();
        driver.findElement(By.xpath("//*[@class=\"dz-success-mark dz-clickable\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"button\"]")).click();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/tables']")).click();
        String FirstName = "TIM";
        if (FirstName=="TIM");
        {
        	System.out.println("tconway@earthlink.net");
        	System.out.println("http://www.timcomway.com");
        }
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/key_presses']")).click();
        driver.findElement(By.id("target")).sendKeys("WIN");
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/windows']")).click();
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
       driver.findElement(By.xpath("//*[@class=\"example\"]"));
       System.out.println("New Window");
       
       driver.get("http://the-internet.herokuapp.com/");
       driver.findElement(By.xpath("//a[@href='/context_menu']")).click();
       driver.findElement(By.xpath("//*[@id=\" hot-spot\"]")).click();
  
        
        }
        
		
		
		

	}


