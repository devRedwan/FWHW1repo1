package Package1;

public class Class1 {

	

	String[] x = new String[5];
	x[0] = "Extra";
	x[1] = "Park";
	x[2] = "Cars";
	x[3] = "Construction";
	x[4] = "Subway";
	
	for (int y=0;y<x.length;y=y+2){
		System.out.print(x[y]+" ");
	}

	int [] a = new int [5];
	a[0] = 89;
	a[1] = 456;
	a[2] = 198;
	a[3] = 200;
	a[4] = 465;
	
	for (int b=0;b<a.length;b=b+2){
		System.out.print(a[b]+" ");
	}
}
	
}
