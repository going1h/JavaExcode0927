package com.dgoing.www;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	//���� �߱� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc1 = new Scanner(System.in);
	      Random rand = new Random();
	      
	      int com[] = new int[3];
	      
	      com[0] = rand.nextInt(9)+1; // 0~9 1~9
	      com[1] = rand.nextInt(9)+1; // 0~9 1~9
	      
	      while(com[0] == com[1])
	      {
	    	  com[1] = rand.nextInt(9)+1;
	      }
	      // com[0] != com[1]-
	      com[2] = rand.nextInt(9)+1;
	      while(com[0] == com[2] || com[1] == com[2])
	      {
	    	  com[2] = rand.nextInt(9)+1;
	      }
	      
	      System.out.println("��� : "+com[0]+" "+com[1]+" "+com[2]); 
	      
	      int user[] = new int[3];
	      
	      int strike = 0;
	      int ball = 0;
	      
	      while(true)
	      {
	    	  
	    	  strike = 0;
	    	  ball = 0;
	    	  System.out.println("���� 3���Է�(0~9���� ������ ��) :");
		        
		        user[0] = sc1.nextInt();
		        user[1] = sc1.nextInt();
		        user[2] = sc1.nextInt();
		      
		      if(user[0] == user[1] || user[0] == user[2] || user[1] == user[2])
		      {
		    	  continue;
		      }
		      
		      //strike ball �˷��ֱ�
		      
		      // 0 -> 0 1 2 0 -> 1 2
		      // 1 -> 0 1 2 1 -> 0 2
		      // 2 -> 0 1 2 2 -> 0 1
		      
		      //   3 5 4  com
		      //   2 3 6  user
		      //   4 7 3  user
		      for(int i =0;i<3;i++) // com  0 1 2    
		      {
		    	  for(int j =0;j<3;j++) // user 0 1 2
		    	  {
		    		  // com[0] user[2]
		    		  if(com[i] == user[j]) //strike or ball
		    		  {
		    			  if(i==j)
		    			  {
		    				  strike++;
		    			  }
		    			  else
		    			  {
		    				  ball++;
		    			  }
		    		  }
		    	  }
		      }
		      
		      //�˷��ָ� �˴ϴ�.
		      
		      if(strike == 3)
		      {
		    	  System.out.println("Ȩ���Դϴ�.");
		    	  break;
		      }
		      else if(strike == 0 && ball == 0)
		      {
		    	  System.out.println("�ƿ��Դϴ�.");
		      }
		      else
		      {
		    	  System.out.println("��Ʈ����ũ : "+strike+", �� : "+ball);
		      }
		      
		      
	      }
	      
	      
	      //com[0] != com[1] != com[2]
	      
	      
	      
	      /*
	      
	      
	      //1. �Ȱ��� ���� �Է��� �� �ִ�.
	        System.out.println("���� 3���Է�(0~9���� ������ ��) :");
	        
	        int n1 = sc1.nextInt();
	        int n2 = sc1.nextInt();
	        int n3 = sc1.nextInt();
	        System.out.println("��� : "+n1+" "+n2+" "+n3);
	        ////////////////////////////////////////////////////
	        Random rand = new Random();

	        int n4 = rand.nextInt(10);
	        int n5 = rand.nextInt(10);
	        int n6 = rand.nextInt(10);

	        // && ||
	        // a&&b -> t t ���� a||b ->t f f t ����  
	        // a||b -> a: t b�� ���� �ʽ��ϴ�.
	        // a&&b -> a : f b�� ���� �ʽ��ϴ�. F
	        //      F n4 != 5 -> n5 == n6 n4 == n6
	        while(n4==n5 && n5==n6 && n4==n6){
	            n5 = rand.nextInt(10);
	            n6 = rand.nextInt(10);
	            //if���� ���ʿ� �մϴ�.
	        if(n4!=n5 && n5!=n6 && n4!=n6);
	        break;
	        }  
	        System.out.println("��� : "+n4+" "+n5+" "+n6); 
	        //2. ������ ���⶧���� ��� ���� �� �� ����.
	            if(n1==n4) { //n1 ����Ʈ����ũ, Ȩ���� ���
	                if(n2==n5){
	                    if(n3==n6)
	                        System.out.println("Ȩ��");
	                    else if(n3!=n6)
	                        System.out.println("����Ʈ����ũ");
	                            else if(n2!=n5&&n3!=n6)
	                                System.out.println("����Ʈ����ũ"); 
	                            }
	                else if(n2==n6){
	                    if(n3==n5)
	                        System.out.println("����Ʈ����ũ & 2��");
	                    else if(n3!=n5)
	                        System.out.println("����Ʈ����ũ & 1��");
	                            else if(n2!=n5&&n3!=n6)
	                                System.out.println("����Ʈ����ũ");
	                            }
	        
	            }
	            else if(n1==n5){
	                if(n2==n6&&n3==n4)
	                    System.out.println("3��");
	                else if(n2==n4&&n3==n6)
	                    System.out.println("2�� & ����Ʈ����ũ");
	                else if(n2!=n4||n3==n6)
	                    System.out.println("1�� & ����Ʈ����ũ");
	                else if((n3!=n6||n2==n4)||(n2!=n6||n3==n4)||(n3==n6||n2!=n4))
	                    System.out.println("2��");
	                else if(n2!=n4&&n3!=n6)
	                    System.out.println("1��");
	            }

	            else if(n1==n6){
	                if(n2==n5&&n3==n4)
	                    System.out.println("3��");
	                else if(n2==n4&&n3==n5)
	                    System.out.println("2�� & ����Ʈ����ũ");
	                else if(n2!=n4||n3==n5)
	                    System.out.println("1�� & ����Ʈ����ũ");
	                else if((n3!=n5||n2==n4)||(n2!=n6||n3==n5)||(n3==n5||n2!=n4))
	                    System.out.println("2��");
	                else if(n2!=n4&&n3!=n5)
	                    System.out.println("1��");
	            }
	                
	            else if(n2==n5) { //n2����Ʈ����ũ�� ���
	                    if(n1==n6&&n3==n4){
	                        System.out.println("����Ʈ����ũ & 2��");
	                            if((n1==n6&&n3!=n4)||(n1!=n6&&n3==n4))
	                                System.out.println("����Ʈ����ũ & 1��");}                   
	                    else if(n1!=n4&&n3==n6){
	                        System.out.println("����Ʈ����ũ");
	                    }
	                    else if(n1!=n6&&n3!=n4){
	                        System.out.println("����Ʈ����ũ"); 
	                    }                  
	                    
	                }
	            
	            else if(n3==n6) { //n3����Ʈ����ũ�� ���
	                    if(n1==n5&&n2==n4) {
	                        System.out.println("����Ʈ����ũ & 2��");
	                            if((n1==n5&&n2!=n4)||(n1!=n5&&n2==n4))
	                                System.out.println("����Ʈ����ũ & 1��");}
	                    else if(n1!=n5&&n2==n4){
	                        System.out.println("����Ʈ����ũ");
	                    }
	                    else if(n1!=n5&&n2!=n4){
	                        System.out.println("����Ʈ����ũ"); 
	                    }                  
	                }
	            
	            else if(n1!=n4&&n1!=n5&&n1!=n6) { //�ƿ��ΰ��
	                    if(n2!=n4&&n2!=n5&&n2!=n6){
	                        if(n3!=n4&&n3!=n5&&n3!=n6)
	                            System.out.println("�ƿ�");
	                }}
	    } 
	    */
	}

}
