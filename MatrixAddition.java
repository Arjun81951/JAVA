import java.util.Scanner;
public class MatrixAddition{
public static void main(String[]args)
{
System.out.println(" Arjun M\n 23MCA020\n 13-Feb-2023");
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number of rows:");
int rows=scanner.nextInt();
System.out.print("Enter the number of columns:");
int cols=scanner.nextInt();
int[][] matrix1=new int[rows][cols];
System.out.println("Enter the values for matrix1:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
matrix1[i][j]=scanner.nextInt();
}
}
int[][] matrix2=new int[rows][cols];
System.out.println("Enter the values for matrix2:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
matrix2[i][j]=scanner.nextInt();
}
}
int[][] result=new int[rows][cols];
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
result[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
System.out.println("Result:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
System.out.print(result[i][j]+" ");
}
System.out.println();

}
scanner.close();
}
}
