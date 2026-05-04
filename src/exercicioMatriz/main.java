package exercicioMatriz;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Selecione um número: ");
		int num = sc.nextInt();
		
		
		/*
		 pos: 
		 00 01 02 03
		 10 11 12 13
		 20 21 22 23 
		 
		 00 = 01, 10
		 12 = 02, 11, 13, 22
		 21 = 11, 20, 22, 31	
		 
		 mn = down: [m+1,n], up: [m-1,n], left: [m ,n-1], right: [m,n+1]
		  */
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(num == matriz[i][j]) {
					System.out.printf("Posição: %d, %d: %n", i, j);
					if (j - 1 >= 0) {
				        int left = matriz[i][j - 1];
				        System.out.println("Left: " + left);
				    }
				    
				    if (j + 1 < matriz[i].length) {
				        int right = matriz[i][j + 1];
				        System.out.println("Right: " + right);
				    }
				   
				    if (i - 1 >= 0) {
				        int up = matriz[i - 1][j];
				        System.out.println("Up: " + up);
				    }
				    
				    if (i + 1 < matriz.length) {
				        int down = matriz[i + 1][j];
				        System.out.println("Down: " + down);
				    }
				}
			}
		}
	}

}
