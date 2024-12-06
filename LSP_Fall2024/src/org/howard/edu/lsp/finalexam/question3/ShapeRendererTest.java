package org.howard.edu.lsp.finalexam.question3;

import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShapeRendererTest {
	
	// Test Render Circle
	@Test
	public void testRenderCircle() {
		ShapeFactory factory = ShapeFactory.getInstance();
		Shape circle = factory.getShape("circle");
		assertNotNull(circle);
		circle.draw();
	}
	// Test Render Rectangle
	@Test
	public void testRenderRectangle() {
		ShapeFactory factory = ShapeFactory.getInstance();
		Shape rectangle = factory.getShape("rectangle");
		assertNotNull(rectangle);
		rectangle.draw();

	}
	// Test Render Triangle 
	@Test
	public void testRenderTriangle() {
		ShapeFactory factory = ShapeFactory.getInstance();
		Shape triangle = factory.getShape("triangle");
		assertNotNull(triangle);
		triangle.draw();
		
	}
}
	
	