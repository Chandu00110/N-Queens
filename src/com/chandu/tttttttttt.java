package com.chandu;

public class tttttttttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int v1=5;
		int v2=6;
		int var3;
		var3 = ++v2 * v1 / v2 + v2;
		System.out.println(var3);*/
		
		/*boolean flag= false;
		int c=0;
		while(!flag) {
			++c;
			if(c>0 && c<3)
				System.out.println("hurray");
			else
				flag = true;*/
		
		/*char c='c';
		switch(c) {
		case 'C': System.out.println("1");
		case 'b':  System.out.println("2");
		case 'c': System.out.println("3");
		default: System.out.println("4");
		}*/
		
		/*int j,i;
		for(i=0;i<=3;i++) {
			int c=i;
			for(j=c;j<8;j++) {
				if(j>(c+2)) {
					break;
				}
				else if(j>c) {
					System.out.println("j value="+j);
					
				}
				else
					continue;
			}
			System.out.println("I value="+i);
		}*/
		
		/*int i=0,j=0;
		for(;i<=5 &&j<6;i++,j++)
			;
		System.out.println(i);*/
		
		/*int x,y;
		for(x=1;x<=5;x++)
			;
		for(y=1;y<=x;y++)
			System.out.println(x+"");*/
		
		/*int a=11;
		int b=2;
		a+=b;
		a%=b;
		System.out.println("a="+a);
		System.out.println("b="+b);*/
		/*
		System.out.print("1");
		System.out.println("2");*/
		
		
		/*for(int i=0;i<4;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.println("hi");
			}
			
		}*/
		
		
		/*int a[]=new int[10];
		int i=9;
		for(;i>0;i--) {
			a[i]=i;
		}
		for(int j=0;j<10;j++)
			System.out.println(a[i]);
*/
		
		/*int a=6;
		int b=2;
		if(a==b||a>b&&!(a<b))
			System.out.println("s");
		else if(a!=b)
			System.out.println("f");*/
		
		/*int a=10;
		int b=a++;
		System.out.println("a="+a);
		System.out.println("b="+b);*/
		
		/**/
		/*int j,i;
		for(i=0;i<2;i++ )
			for(j=i;j<1;i++,j++)
				System.out.println("j="+j);
		System.out.println("i="+i);*/
		//System.out.println(((2*3)+(3+4))/(5*2)+3);
		
	/*	boolean flag=true;
		int x=5;
		int result = (8*2)%x;
		System.out.println(!(result >0) ^ true ^ ( flag = false));
		System.out.println(flag);
		
		int a=5,b=6;
		System.out.println("v="+a+b);
		System.out.println(a+b);*/
		
		/*int i=4 , x;
		x=++i + ++i;
		System.out.println(x);
		
		int a=-1 , b=-1;
		
		int m;
		for(m=1;m<=5;++m);
		System.out.println(m);
		
		int n=2;
		n=n+2<<1;
		System.out.println(n);
		
		int z=0;
		while(true) {
			if(z>4)
				break;
			if(z==0) {
				z++;
				continue;
			}
			System.out.println(z+",");
			z++;
		}
		
		for(int l=0;l<10;l++) {
			if(l%2==0) {
				continue;
			}
			System.out.println(l);
		}*/
		
		/*int i=0;
		for(i=0;i<5;) 
			System.out.println(i);
		i++;*/	
		/*int t=50;
		do {
			System.out.print(t+",");
			t++;
		}while(t<53);*/
		//System.out.println(2+2+"jie");
		//System.out.println("jie"+2+2);
		
		int[] num = {1,2,3,4,5};
		int t= 0;
		
		for(int n:num) {
			t-=n;
		}
		System.out.println("o"+t);
}
}















