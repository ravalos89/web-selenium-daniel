package com.java.polimorfismo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		
		Animal ricardo =  new Humano();
		
		System.out.println("¿Como se comunica Ricardo?");
		ricardo.speak();
		ricardo = new Perro();
		System.out.println("¿Como se comunica ahora Ricardo?");
		ricardo.speak();
		
		// Polymorphism WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver = new FirefoxDriver();
		
		driver.findElement(By.xpath("")).click();

	}

}
