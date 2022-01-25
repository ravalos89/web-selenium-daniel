package com.java.accessmodifiers;

public class AccessModifier {
	
	// Propiedades objeto
	public String variable1 = "Public";
	protected String variable3 = "Protected";
	String variable4 = "Default";
	private String variable2 = "private";
	
	
	// Methods
	public void helloPublic() {
		System.out.println("HELLO PUBLIC");
		helloPrivate();
	}
	
	protected void helloProtected() {
		System.out.println("HELLO PROTECTED");
	}
	
	void helloDefault() {
		System.out.println("HELLO DEFAULT");
	}
	
	private void helloPrivate() {
		System.out.println("HELLO PRIVATE");
	}

}
