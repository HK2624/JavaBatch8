package com.syntax.class03;

public class PrimitiveCasting {
public static void main(String[] args) {
	
	 double d=12/7;
	System.out.println(d);
	
	double e=9;// widening
	System.out.println(e);
	
	//int i=9.99;you will get error
	//casting;coverting one type to another type.
	//coverting one type to another type
// 2 tpe of casting;
	// 1 widening; implicitly (automatic) casting(bigger)
	      //byte->short->int->long->float->double
	//2 narrowing; expilicitly (manual) casting
	      //double->float->long->int->short->byte
	
	int i=(int)9.99;//narrowing(9.0)
	System.out.println(i); 
	
	byte b=(byte)130;//narrowing
	System.out.println(b);
	 
	double f=15/7;//widening(2.0)
	System.out.println(f);//because working with integer number so to keep it will delete decimal side
	
	
}
}
