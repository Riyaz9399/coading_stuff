import java.lang.Math;

class function_Overloading{
      public static void main(String [] args){
	
	int radius = 5;
	int length = 6, width = 7;
	int a = 8, b = 9, c = 3;
	f(radius);
	System.out.println("The area of the circle is : "+ Area(radius));
	System.out.println("The area of the Rectangle is : " + Area(length, width));


	System.out.println("The area of the Triangle is : " + Area(a,b,c));
	}
	 
	static void f(int val){
	System.out.println(val);
	}
	 
	/*static int f(int val){
	 val = val + 1;
	return val;
	}*/

	static float Area (int r){
	 return 22/7 * r * r;	 
	}


	 static float Area (int l, int w){
		return l * w;
	}

         static float Area (int a, int b, int c)	{
	 float s = (float)(a + b + c)/2.0f;
	 return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
	}


   }
  
