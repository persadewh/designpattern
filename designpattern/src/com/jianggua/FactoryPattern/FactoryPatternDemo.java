/**
 * @Description 
 * @author Ray Wei
 * @Date 2019年6月6日
 */
package com.jianggua.FactoryPattern;

/**
 * @ClassName FactoryPatternDemo
 * @Description 
 * @author Ray Wei
 * @Date 2019年6月6日
 */
public class FactoryPatternDemo {

	/**
	 * @Description 
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		ShapeFactory shapeFactory = new ShapeFactory();
		
		IShape circle = shapeFactory.getShape("Circle");
		circle.draw();
		
	}

}
