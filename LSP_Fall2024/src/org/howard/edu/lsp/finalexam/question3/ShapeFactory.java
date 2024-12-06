package org.howard.edu.lsp.finalexam.question3;

public class ShapeFactory {
	private static ShapeFactory instance = null;
	
	private ShapeFactory() {}  // same template as question 2
	
	public static ShapeFactory getInstance() { // no empty instances 
		if (instance == null); {
			instance = new ShapeFactory ();
		}
		return instance;
		
	}
	
	public Shape getShape(String shapeType) { // What shapes are available 
		switch (shapeType.toLowerCase()) {
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "triangle":
			return new Triangle();
		default:
			return null;
		}
	}	

}
