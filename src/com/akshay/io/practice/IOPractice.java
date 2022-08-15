package com.akshay.io.practice;

import java.util.Scanner;

public class IOPractice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanAndPrint();
	}
	
	public static void scanAndPrint() {
		/*Scanner scan = new Scanner(System.in);
        //int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        //System.out.println("Int: " + i);*/
		
		/*Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s", s1);
            if(x < 99) {
            System.out.printf("%03d %n", x);
            }else {
            	System.out.printf("%02d %n", x);
            }
        }
        System.out.println("================================");*/
		
		/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
			int N = Integer.parseInt(bufferedReader.readLine().trim());
			int result = 0;
			for(int i=1 ; i <=10 ;i++) {
				result = N *i;
				System.out.println(N +" x " + i +" = "+ result);
			}
			
			bufferedReader.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        */
		
		
		/*Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0 ; j<n ; j++) {
            	if(j==0) {
            		result = a + (int) Math.pow(2, j)*b ;
            	}else {
            		result = result + (int) Math.pow(2, j)*b;
            	}
            	System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close(); */
		
		/*Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }	*/
        //System.out.println(Math.pow(2, 31) - 1);
        //System.out.println(Byte.MIN_VALUE + " " +Byte.MAX_VALUE);
        
        
		Scanner sc = new Scanner(System.in);
        int i=1;
        while (sc.hasNext()) {
        	String s=sc.nextLine();
        	System.out.println(i + " " + s);
        	i++;
        }
        
	}
}
