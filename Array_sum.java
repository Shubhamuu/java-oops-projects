//wap to declare 2 array of size 3x2 and take element of both array from user and then display the sum of aray.

import java.util.Scanner;
class Array_sum{
    public static void main(String[] args) {
        int car[][] = new int [3][2];
        int arr[][] = new int [3][2];
        int brr[][] = new int [3][2];

      Scanner scan = new Scanner(System.in);
      System.out.println("enter matrix 1: ");
        for(int i = 0; i < 3; i++)
        {
            for( int j = 0; j < 2; j++)
            {
              arr[i][j] = scan.nextInt();


            }
        }
         System.out.println("enter matrix 2: ");

          for(int i = 0; i < 3; i++)
          {
               for( int j = 0; j < 2; j++)
                {
                  brr[i][j] = scan.nextInt();
              

                 } 
            }
             System.out.println("matrix sum is ");
            for(int i = 0; i < 3; i++)
              {
                 for( int j = 0; j < 2; j++)
                   {
                    car[i][j] = arr[i][j] + brr[i][j];
                      System.out.print(car[i][j] + "     ");
              

                     }
                     System.out.println("");
                }

      scan.close();
    }
}