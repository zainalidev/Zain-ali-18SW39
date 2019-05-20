class Circle
{
	private double radius;
	private String color;
	final double pi=3.14;
	public double area;
	Circle()
	{
		radius=1.0;
		color="red";
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius, String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public Double getArea()
	{
		area=pi*radius*radius;
		return area;
	}
	public String toString()
	{
		return "Circle[radius="+radius+",color="+color+"]";
	}
}
class Cylinder extends Circle
{
	double volum;
	private double height;
	Cylinder()
	{
		height=1.0;
	}
	Cylinder(double radius)
	{	
		this.setRadius(radius);
	}
	Cylinder(double radius, String color)
	{
		super(radius,color);
	}
	Cylinder(double radius, String color,double height)
	{
		super(radius,color);
		this.height=height;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double getVolume()
	{
		volum=pi*this.getRadius()*this.getRadius()*height;
		return volum;
	}
	public String toString()
	{
		return "Cylinder{"+super.toString()+" height="+height+"}";
	}
}
class Task1
{
	public static void main(String[] args) 
	{
		Circle ci=new Circle();
		ci.setRadius(4.5);
		System.out.println(ci);
		System.out.println("Area of Circle: "+ci.getArea());
		Cylinder cy=new Cylinder(5.6);
		cy.setHeight(9);
		System.out.println(cy);
		System.out.println("Volume of Cylinder: "+cy.getVolume());
	}
}