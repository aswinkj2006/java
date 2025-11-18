package mainapp; 
import shapes.Circle; 
public class GraphicsApp { 
public static void main(String[] args) { 
Circle c = new Circle(12.0); 
System.out.println("Area: " + c.calculateArea()); 
System.out.println("Perimeter: " + c.calculatePerimeter()); 
} 
} 