package com.atguigu.exer3;

public class ComparableCircle extends Circle implements CompareObject{

	public ComparableCircle(double radius) {
		super(radius);
	}
	@Override
	public int compareTo(Object o) {
		if(this == o) {
			return 0;
		}
		if(o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle)o;
			
			//错误的
//			return (int)(this.getRadius() - c.getRadius());			
			//正确的
//			if(this.getRadius() > c.getRadius()) {
//				return 1;
//			}else if(this.getRadius() < c.getRadius()) {
//				return -1;
//			}else {
//				return 0;
//			}
			
			//当属性radius声明为Double类型时，可以调用包装类的方法
			return this.getRadius().compareTo(c.getRadius());			
		}else {
//			return 0;
			throw new RuntimeException("传入的数据类型不匹配");
		}
	}

}
