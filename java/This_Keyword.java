// class This_Keyword{
// 	public static void main(String [] args){
		// Demo myobj = new Demo(60,70,80,90);
		// // System.out.println();
		// Demo d1 = new Demo(12,13,14);
		
		// myobj.print();	
// 	}

// }


// class Demo{
//   int i ;
//   int j ;
//   int k ; 
//   int l ;
//   Demo(int i , int j, int k, int l){
// 	this.i = i ;
// 	this.j = j ;
// 	this.k = k;
// 	this.l = l;
//   }
//   Demo ( int j , int k, int l){
// 	// this.i = 100;
// 	// this.j = j ;
// 	// this.k = k;
// 	// this.l = l;
// 	// instead of writing this you can call a this constructor
// 	this(100,j,k,l);

//   }
//   void print(){
// 	System.out.println(this.i);
//   }
// }

/**
 * This_Keyword
 */
public class This_Keyword {
	public static void main(String [] args){
		Demo d = new Demo(20);
		Demo d1 = new Demo(30);
		System.out.println("DEMO RESULT "+d.Greater(d1));
		d1.print();
	}
	
}

class Demo {
	int i ;
	Demo(int i){
		this.i = i;
	}

	Demo Greater(Demo d){
		if(d.i > this.i){
			return d;
		}
		else {
			return this;
		}
	}

	void print(){
		System.out.println(this.i);
	}
}