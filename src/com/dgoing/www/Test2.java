package com.dgoing.www;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	//숫자 야구 게임
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
	      
	      System.out.println("기계 : "+com[0]+" "+com[1]+" "+com[2]); 
	      
	      int user[] = new int[3];
	      
	      int strike = 0;
	      int ball = 0;
	      
	      while(true)
	      {
	    	  
	    	  strike = 0;
	    	  ball = 0;
	    	  System.out.println("숫자 3개입력(0~9까지 각각의 수) :");
		        
		        user[0] = sc1.nextInt();
		        user[1] = sc1.nextInt();
		        user[2] = sc1.nextInt();
		      
		      if(user[0] == user[1] || user[0] == user[2] || user[1] == user[2])
		      {
		    	  continue;
		      }
		      
		      //strike ball 알려주기
		      
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
		      
		      //알려주면 됩니다.
		      
		      if(strike == 3)
		      {
		    	  System.out.println("홈런입니다.");
		    	  break;
		      }
		      else if(strike == 0 && ball == 0)
		      {
		    	  System.out.println("아웃입니다.");
		      }
		      else
		      {
		    	  System.out.println("스트라이크 : "+strike+", 볼 : "+ball);
		      }
		      
		      
	      }
	      
	      
	      //com[0] != com[1] != com[2]
	      
	      
	      
	      /*
	      
	      
	      //1. 똑같은 값을 입력할 수 있다.
	        System.out.println("숫자 3개입력(0~9까지 각각의 수) :");
	        
	        int n1 = sc1.nextInt();
	        int n2 = sc1.nextInt();
	        int n3 = sc1.nextInt();
	        System.out.println("사람 : "+n1+" "+n2+" "+n3);
	        ////////////////////////////////////////////////////
	        Random rand = new Random();

	        int n4 = rand.nextInt(10);
	        int n5 = rand.nextInt(10);
	        int n6 = rand.nextInt(10);

	        // && ||
	        // a&&b -> t t 실행 a||b ->t f f t 실행  
	        // a||b -> a: t b는 보지 않습니다.
	        // a&&b -> a : f b는 보지 않습니다. F
	        //      F n4 != 5 -> n5 == n6 n4 == n6
	        while(n4==n5 && n5==n6 && n4==n6){
	            n5 = rand.nextInt(10);
	            n6 = rand.nextInt(10);
	            //if문이 불필요 합니다.
	        if(n4!=n5 && n5!=n6 && n4!=n6);
	        break;
	        }  
	        System.out.println("기계 : "+n4+" "+n5+" "+n6); 
	        //2. 게임을 맞출때까지 계속 진행 할 수 없다.
	            if(n1==n4) { //n1 원스트라이크, 홈런의 경우
	                if(n2==n5){
	                    if(n3==n6)
	                        System.out.println("홈런");
	                    else if(n3!=n6)
	                        System.out.println("투스트라이크");
	                            else if(n2!=n5&&n3!=n6)
	                                System.out.println("원스트라이크"); 
	                            }
	                else if(n2==n6){
	                    if(n3==n5)
	                        System.out.println("원스트라이크 & 2볼");
	                    else if(n3!=n5)
	                        System.out.println("원스트라이크 & 1볼");
	                            else if(n2!=n5&&n3!=n6)
	                                System.out.println("원스트라이크");
	                            }
	        
	            }
	            else if(n1==n5){
	                if(n2==n6&&n3==n4)
	                    System.out.println("3볼");
	                else if(n2==n4&&n3==n6)
	                    System.out.println("2볼 & 원스트라이크");
	                else if(n2!=n4||n3==n6)
	                    System.out.println("1볼 & 원스트라이크");
	                else if((n3!=n6||n2==n4)||(n2!=n6||n3==n4)||(n3==n6||n2!=n4))
	                    System.out.println("2볼");
	                else if(n2!=n4&&n3!=n6)
	                    System.out.println("1볼");
	            }

	            else if(n1==n6){
	                if(n2==n5&&n3==n4)
	                    System.out.println("3볼");
	                else if(n2==n4&&n3==n5)
	                    System.out.println("2볼 & 원스트라이크");
	                else if(n2!=n4||n3==n5)
	                    System.out.println("1볼 & 원스트라이크");
	                else if((n3!=n5||n2==n4)||(n2!=n6||n3==n5)||(n3==n5||n2!=n4))
	                    System.out.println("2볼");
	                else if(n2!=n4&&n3!=n5)
	                    System.out.println("1볼");
	            }
	                
	            else if(n2==n5) { //n2원스트라이크의 경우
	                    if(n1==n6&&n3==n4){
	                        System.out.println("원스트라이크 & 2볼");
	                            if((n1==n6&&n3!=n4)||(n1!=n6&&n3==n4))
	                                System.out.println("원스트라이크 & 1볼");}                   
	                    else if(n1!=n4&&n3==n6){
	                        System.out.println("투스트라이크");
	                    }
	                    else if(n1!=n6&&n3!=n4){
	                        System.out.println("원스트라이크"); 
	                    }                  
	                    
	                }
	            
	            else if(n3==n6) { //n3원스트라이크의 경우
	                    if(n1==n5&&n2==n4) {
	                        System.out.println("원스트라이크 & 2볼");
	                            if((n1==n5&&n2!=n4)||(n1!=n5&&n2==n4))
	                                System.out.println("원스트라이크 & 1볼");}
	                    else if(n1!=n5&&n2==n4){
	                        System.out.println("투스트라이크");
	                    }
	                    else if(n1!=n5&&n2!=n4){
	                        System.out.println("원스트라이크"); 
	                    }                  
	                }
	            
	            else if(n1!=n4&&n1!=n5&&n1!=n6) { //아웃인경우
	                    if(n2!=n4&&n2!=n5&&n2!=n6){
	                        if(n3!=n4&&n3!=n5&&n3!=n6)
	                            System.out.println("아웃");
	                }}
	    } 
	    */
	}

}
