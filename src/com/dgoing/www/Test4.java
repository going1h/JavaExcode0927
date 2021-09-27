package com.dgoing.www;

import java.util.Random;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 낚시게임
		// 1. 호수 만들기
		// 2. 호수 안에 물고기 위치 시키기 3마리
		// 3. 낚시꾼 캐스팅 하기(캐스팅 했을 경우 물고기가 있으면 바로 한마리를 잡는다.)
		// 4. 상하좌우 이동 시켜서 물고기 잡기
		// (위로 이동시 0보다 작으면 0 아래로 이동시 4보다 크면 4 왼쪽 이동시 0보다 작으면 0
		//  오른쪽 이동시 4보다 크면 4) 
		// 5. 낚시대 이동을 통한 물고기 체크
		// 6. 물고기 3마리를 잡으면 프로그램 종료
		
	    int [][] arr = new int[5][5];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //필요성 떨어지죠.
        /*
        int fishplace1 = rand.nextInt(5);
        int fishplace2 = rand.nextInt(5);
        */
        int f1=0, f2=0, count=3;
        //물고기 위치 랜덤으로 정하기
        for(int i =0; i<3; i++)
        {
        	 int fishplace1 = rand.nextInt(5);
             int fishplace2 = rand.nextInt(5);
             if(arr[fishplace1][fishplace2] == 1)
             {
            	 i--;
             }
             else
             {
            	 arr[fishplace1][fishplace2] = 1; // 물고기 있는 자리 세팅
             }
        }
        /*
        for(int i=0; i<3; i++){ 
            // 물고기 위치가 중복이면 다시 정하기
            while(true){
                int fishplace1 = rand.nextInt(5);
                int fishplace2 = rand.nextInt(5);
                if(arr[fishplace1][fishplace2] == 1)
                    continue;
                if(!(fishplace1 == f1 && fishplace2 == f2))
                    break;
            }
            //값 다른 위치에 저장
            f1 = fishplace1;
            f2 = fishplace2;
            arr[f1][f2] = 1;
        }
        */
        //비효율적
        /*
        System.out.print("던질위치 입력 : ");
        int location1 = sc.nextInt();
        int location2 = sc.nextInt();
        //던지는 위치 범위 벗어나면 다시 입력
        while(true){
            if(location1 < 0 || location1 > 4 || location2 < 0 || location2 > 4){
                System.out.println("범위를 넘어갔습니다 다시 입력하세요");
                System.out.print("던질위치 입력 : ");
                location1 = sc.nextInt();
                location2 = sc.nextInt();
            }break;
        }
        */
        int location1 = 0;
        int location2 = 0;
        while(true)
        {
        	 System.out.print("던질위치 입력 : ");
             location1 = sc.nextInt();
             location2 = sc.nextInt();
             if(location1 < 0 || location1 > 4 || location2 < 0 || location2 > 4)
             {
            	 System.out.println("범위를 넘어갔습니다 다시 입력하세요");
             }
             else
             {
            	 if(arr[location1][location2] == 1)
            	 {
            		 arr[location1][location2] = 0;
            		 System.out.printf("남은 물고기 : %d\n", --count);
            	 }
            	 break;
             }
        }
        
        
        
        //낚시 위치 표시 값 지정
        
        // 낚시게임이 끝날때까지 나와야 하는 출력
        
        
        while(true)
        {
        	arr[location1][location2] = 2;
        	for(f1=0; f1<5; f1++){
                for(f2=0; f2<5; f2++){
                    if(arr[f1][f2] == 0)
                        System.out.print(" □ ");//물고기가 없는위치
                    else if(arr[f1][f2] == 1)
                        System.out.print(" ■ ");//물고기가 있는위치
                    else{
                        System.out.print(" ↓ ");//낚시를 하는위치
                        arr[location1][location2] = 0;
                    }
                }
                System.out.println();
            }
        	 System.out.print("방향 입력 : ");
             int dr = sc.nextInt();
             //1,2,3,4 다른값 이면 다시 입력(잘못입력 방지)
             if(dr > 4 || dr < 0){
                 continue;
             }
             switch (dr) {
             case 1: // 위
            	 location1 -- ;
            	 if(location1 <0)
            	 {
            		 System.out.println("더이상 위로 움직일 수 없습니다.");
            		 location1 = 0;
            	 }
            	 break;
             case 2: // 아래
            	 location1 ++ ;
            	 if(location1 > 4)
            	 {
            		 System.out.println("더이상 아래로 움직일 수 없습니다.");
            		 location1 = 4;
            	 }
            	 break;
             case 3: // 왼쪽
            	 location2 -- ;
            	 if(location2 <0)
            	 {
            		 System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
            		 location2 = 0;
            	 }
            	 break;
             case 4: // 오른쪽
            	 location2 ++ ;
            	 if(location2 >4)
            	 {
            		 System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
            		 location2 = 4;
            	 }
            	 break;
             default :
            	 System.out.println("잘못된 입력입니다.");
            	 break;
             }
             
             //물고기 체크
             if(arr[location1][location2] == 1)
        	 {
            	 arr[location1][location2] = 0;
        		 System.out.printf("남은 물고기 : %d\n", --count);
        	 }
             if(count <= 0)
             {
            	 System.out.println("모든 물고기를 잡았습니다.");
            	 break;
             }
        }
        
        
        //System.out.println("방향 입력(1.위 2.아래 3.왼쪽 4. 오른쪽) : ");
        /*
        while(true){
            // 위치 표시
            
            System.out.print("방향 입력 : ");
            int dr = sc.nextInt();
            //1,2,3,4 다른값 이면 다시 입력(잘못입력 방지)
            while(dr > 4 || dr < 0){
                System.out.print("다시입력 : ");
                dr = sc.nextInt();
            }
            switch (dr) {
                case 1: location1 -=1;
                if(location1 < 0){
                    location1 = 0;
                        //막다른 길이면 방향 다시정하기 
                        System.out.println("길이 막혔습니다 다시입력하세요");
                        System.out.print("다시입력 : ");
                        dr = sc.nextInt();
                    }break;
                case 2: location1 +=1;
                    if(location1 > 4){
                        location1 = 4;
                        //막다른 길이면 방향 다시정하기 
                        System.out.println("길이 막혔습니다 다시입력하세요");
                        System.out.print("다시입력 : ");
                        dr = sc.nextInt();
                    }break;
                case 3: location2 -=1;
                    if(location2 < 0){
                        location2 = 0;
                        //막다른 길이면 방향 다시정하기 
                        System.out.println("길이 막혔습니다 다시입력하세요");
                        System.out.print("다시입력 : ");
                        dr = sc.nextInt();
                    }break;
                case 4: location2 +=1;
                    if(location2 > 4){
                        location2 = 4;
                        //막다른 길이면 방향 다시정하기 
                        System.out.println("길이 막혔습니다 다시입력하세요");
                        System.out.print("다시입력 : ");
                        dr = sc.nextInt();
                    }break;
            }
            arr[location1][location2] = 2;
            // 물고기 몇마리 남은지 계산
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(arr[i][j] == 1)
                        count ++;
                }
            }
            System.out.printf("남은 물고기 : %d\n", count);
            //물고기를 다 잡으면 프로그램 종료
            if(count == 0){
                System.out.println("물고기를 다 잡았습니다.");
                System.out.println("프로그램 종료");
                break;
            }
            //남은 물고기가 더이상 중첩되지 않도록 0으로 초기화
            count = 0;
            
        }
        */
		
	}

}
