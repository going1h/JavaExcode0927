package com.dgoing.www;

import java.util.Random;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ð���
		// 1. ȣ�� �����
		// 2. ȣ�� �ȿ� ����� ��ġ ��Ű�� 3����
		// 3. ���ò� ĳ���� �ϱ�(ĳ���� ���� ��� ����Ⱑ ������ �ٷ� �Ѹ����� ��´�.)
		// 4. �����¿� �̵� ���Ѽ� ����� ���
		// (���� �̵��� 0���� ������ 0 �Ʒ��� �̵��� 4���� ũ�� 4 ���� �̵��� 0���� ������ 0
		//  ������ �̵��� 4���� ũ�� 4) 
		// 5. ���ô� �̵��� ���� ����� üũ
		// 6. ����� 3������ ������ ���α׷� ����
		
	    int [][] arr = new int[5][5];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //�ʿ伺 ��������.
        /*
        int fishplace1 = rand.nextInt(5);
        int fishplace2 = rand.nextInt(5);
        */
        int f1=0, f2=0, count=3;
        //����� ��ġ �������� ���ϱ�
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
            	 arr[fishplace1][fishplace2] = 1; // ����� �ִ� �ڸ� ����
             }
        }
        /*
        for(int i=0; i<3; i++){ 
            // ����� ��ġ�� �ߺ��̸� �ٽ� ���ϱ�
            while(true){
                int fishplace1 = rand.nextInt(5);
                int fishplace2 = rand.nextInt(5);
                if(arr[fishplace1][fishplace2] == 1)
                    continue;
                if(!(fishplace1 == f1 && fishplace2 == f2))
                    break;
            }
            //�� �ٸ� ��ġ�� ����
            f1 = fishplace1;
            f2 = fishplace2;
            arr[f1][f2] = 1;
        }
        */
        //��ȿ����
        /*
        System.out.print("������ġ �Է� : ");
        int location1 = sc.nextInt();
        int location2 = sc.nextInt();
        //������ ��ġ ���� ����� �ٽ� �Է�
        while(true){
            if(location1 < 0 || location1 > 4 || location2 < 0 || location2 > 4){
                System.out.println("������ �Ѿ���ϴ� �ٽ� �Է��ϼ���");
                System.out.print("������ġ �Է� : ");
                location1 = sc.nextInt();
                location2 = sc.nextInt();
            }break;
        }
        */
        int location1 = 0;
        int location2 = 0;
        while(true)
        {
        	 System.out.print("������ġ �Է� : ");
             location1 = sc.nextInt();
             location2 = sc.nextInt();
             if(location1 < 0 || location1 > 4 || location2 < 0 || location2 > 4)
             {
            	 System.out.println("������ �Ѿ���ϴ� �ٽ� �Է��ϼ���");
             }
             else
             {
            	 if(arr[location1][location2] == 1)
            	 {
            		 arr[location1][location2] = 0;
            		 System.out.printf("���� ����� : %d\n", --count);
            	 }
            	 break;
             }
        }
        
        
        
        //���� ��ġ ǥ�� �� ����
        
        // ���ð����� ���������� ���;� �ϴ� ���
        
        
        while(true)
        {
        	arr[location1][location2] = 2;
        	for(f1=0; f1<5; f1++){
                for(f2=0; f2<5; f2++){
                    if(arr[f1][f2] == 0)
                        System.out.print(" �� ");//����Ⱑ ������ġ
                    else if(arr[f1][f2] == 1)
                        System.out.print(" �� ");//����Ⱑ �ִ���ġ
                    else{
                        System.out.print(" �� ");//���ø� �ϴ���ġ
                        arr[location1][location2] = 0;
                    }
                }
                System.out.println();
            }
        	 System.out.print("���� �Է� : ");
             int dr = sc.nextInt();
             //1,2,3,4 �ٸ��� �̸� �ٽ� �Է�(�߸��Է� ����)
             if(dr > 4 || dr < 0){
                 continue;
             }
             switch (dr) {
             case 1: // ��
            	 location1 -- ;
            	 if(location1 <0)
            	 {
            		 System.out.println("���̻� ���� ������ �� �����ϴ�.");
            		 location1 = 0;
            	 }
            	 break;
             case 2: // �Ʒ�
            	 location1 ++ ;
            	 if(location1 > 4)
            	 {
            		 System.out.println("���̻� �Ʒ��� ������ �� �����ϴ�.");
            		 location1 = 4;
            	 }
            	 break;
             case 3: // ����
            	 location2 -- ;
            	 if(location2 <0)
            	 {
            		 System.out.println("���̻� �������� ������ �� �����ϴ�.");
            		 location2 = 0;
            	 }
            	 break;
             case 4: // ������
            	 location2 ++ ;
            	 if(location2 >4)
            	 {
            		 System.out.println("���̻� ���������� ������ �� �����ϴ�.");
            		 location2 = 4;
            	 }
            	 break;
             default :
            	 System.out.println("�߸��� �Է��Դϴ�.");
            	 break;
             }
             
             //����� üũ
             if(arr[location1][location2] == 1)
        	 {
            	 arr[location1][location2] = 0;
        		 System.out.printf("���� ����� : %d\n", --count);
        	 }
             if(count <= 0)
             {
            	 System.out.println("��� ����⸦ ��ҽ��ϴ�.");
            	 break;
             }
        }
        
        
        //System.out.println("���� �Է�(1.�� 2.�Ʒ� 3.���� 4. ������) : ");
        /*
        while(true){
            // ��ġ ǥ��
            
            System.out.print("���� �Է� : ");
            int dr = sc.nextInt();
            //1,2,3,4 �ٸ��� �̸� �ٽ� �Է�(�߸��Է� ����)
            while(dr > 4 || dr < 0){
                System.out.print("�ٽ��Է� : ");
                dr = sc.nextInt();
            }
            switch (dr) {
                case 1: location1 -=1;
                if(location1 < 0){
                    location1 = 0;
                        //���ٸ� ���̸� ���� �ٽ����ϱ� 
                        System.out.println("���� �������ϴ� �ٽ��Է��ϼ���");
                        System.out.print("�ٽ��Է� : ");
                        dr = sc.nextInt();
                    }break;
                case 2: location1 +=1;
                    if(location1 > 4){
                        location1 = 4;
                        //���ٸ� ���̸� ���� �ٽ����ϱ� 
                        System.out.println("���� �������ϴ� �ٽ��Է��ϼ���");
                        System.out.print("�ٽ��Է� : ");
                        dr = sc.nextInt();
                    }break;
                case 3: location2 -=1;
                    if(location2 < 0){
                        location2 = 0;
                        //���ٸ� ���̸� ���� �ٽ����ϱ� 
                        System.out.println("���� �������ϴ� �ٽ��Է��ϼ���");
                        System.out.print("�ٽ��Է� : ");
                        dr = sc.nextInt();
                    }break;
                case 4: location2 +=1;
                    if(location2 > 4){
                        location2 = 4;
                        //���ٸ� ���̸� ���� �ٽ����ϱ� 
                        System.out.println("���� �������ϴ� �ٽ��Է��ϼ���");
                        System.out.print("�ٽ��Է� : ");
                        dr = sc.nextInt();
                    }break;
            }
            arr[location1][location2] = 2;
            // ����� ��� ������ ���
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(arr[i][j] == 1)
                        count ++;
                }
            }
            System.out.printf("���� ����� : %d\n", count);
            //����⸦ �� ������ ���α׷� ����
            if(count == 0){
                System.out.println("����⸦ �� ��ҽ��ϴ�.");
                System.out.println("���α׷� ����");
                break;
            }
            //���� ����Ⱑ ���̻� ��ø���� �ʵ��� 0���� �ʱ�ȭ
            count = 0;
            
        }
        */
		
	}

}
