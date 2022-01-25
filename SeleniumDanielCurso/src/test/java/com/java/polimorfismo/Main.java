package com.java.polimorfismo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.java.accessmodifiers.AccessModifier;

public class Main extends AccessModifier{

	public static void main(String[] args) {
		
		Animal ricardo =  new Humano();
		
		System.out.println("¿Como se comunica Ricardo?");
		ricardo.speak();
		ricardo = new Perro();
		System.out.println("¿Como se comunica ahora Ricardo?");
		ricardo.speak();
		
//		// Polymorphism WebDriver
//		WebDriver driver = new ChromeDriver();
//		
//		driver = new FirefoxDriver();
//		
//		driver.findElement(By.xpath("")).click();
		
		// ACCESS MODIFIER PUBLIC from com.java.accessmodifier
		AccessModifier publicModifier = new AccessModifier();
		publicModifier.helloPublic();
		
		
//		AccessModifier protectedModifier = new AccessModifier();
//		protectedModifier.helloProtected();
//		
//		AccessModifier protectedDefault = new AccessModifier();
//		protectedDefault.helloDefault();

	}

}
