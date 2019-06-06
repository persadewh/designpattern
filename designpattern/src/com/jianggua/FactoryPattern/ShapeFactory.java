/**
 * @Description 
 * @author Ray Wei
 * @Date 2019年6月6日
 */
package com.jianggua.FactoryPattern;

/**
 * @ClassName ShapeFactory
 * @Description 
 * @author Ray Wei
 * @Date 2019年6月6日
 */
public class ShapeFactory {

	public IShape getShape(String strShapeType) {
		
		IShape iShape = null;
		
		if(null == strShapeType) {
			return iShape;
		}
		
		switch (strShapeType.toUpperCase()) {
			case "CIRCLE":
				iShape = new Circle();
				break;
			case "RECTANGLE":
				iShape = new Rectangle();
				break;
			case "SQUARE":
				iShape = new Square();
				break;
			default:
				break;
		}
		
		return iShape;
	}
	
}
