package yunsuan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			int m=0;
			 Scanner num =new Scanner(System.in);
			 System.out.print("�����������");  
		     m =num.nextInt();	       
	    ArrayList<String> datasourse=new ArrayList<String>();
	     String question=new String();
			Random r = new Random();
			Scanner in = new Scanner(System.in);
			System.out.println("ѧ��:201571030142");
			for (int i = 1; i <= m; i++) {
				// ���������Ŀquestion���������ݺͷ��ţ��������answer
				//String question = null;
				int answer = 0;
				int a, b, c,d;
				c = r.nextInt(4);
				do {
					a = r.nextInt(100);
					b = r.nextInt(100);
					d =r.nextInt(100);
				} while ((  c == 3 && b == 0) 
						|| (c == 3 && a % b != 0)
						|| (c == 2 && a * b > 100) 
						|| (c == 1 && a < b)
						|| (c == 0 && a + b > 100));
				if (c == 0) {
					question = a + "+" + b+"*"+d;
					answer = b*d+a;	
				} else if (c == 1) {
					question = a + "-" + b+"+"+d;
					answer = a - b+d;
				} else if (c == 2) {
					question = a + "*" + b+"+"+d;
					answer = a * b+d;
				} else {
					question = a + "/" + b+"*"+d;
					answer = a / b*d;
				}
				// �����Ŀquestion
				datasourse.add(question+"="+answer);
				//System.out.println(i + ")"+ question + "="+answer);
				
			}
			//�������list��ֵ  
			for ( int i = 0; i < datasourse.size(); i++){
				  System.out.println(datasourse.get(i));
				}
			WriteToFile write=new WriteToFile(
					"result.txt",datasourse);
			System.out.println("��д��result.txt");
		}
	}
