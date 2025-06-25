package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;

public class Generic {

	
	public final static PointerInput FINGER = new PointerInput(Kind.TOUCH, "finger");
	
	public static Point getCenterOfElement(Point location, Dimension size) {
		return new Point(location.getX()+size.getWidth()/2,location.getY()+size.getHeight()/2);
	}
	
	
}
