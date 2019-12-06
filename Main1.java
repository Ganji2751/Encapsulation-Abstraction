import java.util.*;
import java.lang.*;
class Author
{
	private static String name,email;
	char gender;
	Author()
	{
	}
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	String getName()
	{
		return name;
	}
}
class Book
{
	private String name;
	private double price = 123.54;
	private int quanInStock = 5;
	Book(String name)
	{
		this.name=name;
	}
	Author aobj = new Author();
	String getName()
	{
		return name;
	}
	String getAuthor()
	{
		return aobj.getName();
	}
	double getPrice()
	{
		return price;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	double getQtyInStock()
	{
		return quanInStock;
	}
	void setQtyInStock(int quanInStock)
	{
		this.quanInStock=quanInStock;
	}
}
class Main1
{
	public static void main(String args[])
	{
		Book obj = new Book("Python Trainer");
		Author aobj1 = new Author("Van Rosuum","vanRossum123",'M');
		System.out.println("Book Name : "+obj.getName()+"\n"+"Author Name : "+obj.getAuthor()+"\n"+"Book Price : "+obj.getPrice()+"\n"+"Book Quantity"+obj.getQtyInStock());
		
	}
}