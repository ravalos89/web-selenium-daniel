package com.java.accessmodifiers;

public class MainModifier extends AccessModifier{

	public static void main(String[] args) {
		
		AccessModifier protectedModifier = new AccessModifier();
		protectedModifier.helloProtected();
		
		AccessModifier protectedDefault = new AccessModifier();
		protectedDefault.helloDefault();
		
//		AccessModifier privateHello = new AccessModifier();
//		privateHello.helloPrivate();

	}

}
