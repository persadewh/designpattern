/**
 * @Description 
 * @author Ray Wei
 * @Date 2019��6��6��
 */
package com.jianggua.FactoryPattern;

/**
 * @ClassName FactoryPatternDemo
 * @Description 
 * @author Ray Wei
 * @Date 2019��6��6��
 */
public class FactoryPatternDemo {

	/**
	 * @Description 
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		ShapeFactory shapeFactory = new ShapeFactory();
		
		IShape circle = shapeFactory.getShape("Circle");
		circle.draw();
		
	}

}
