import java.util.Scanner;

public class arrayTraversal{
    Scanner s=new Scanner(System.in);
     public void Display(int [] arr,int count){
            for(int i=0;i<count;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
     }

     public int[] input(int count){
        int[] arr=new int[count];
        System.out.println("Enter the elements of array");
        for(int i=0;i<count;i++){
            arr[i]=s.nextInt();
        }
        return arr;
     }

    public static void main(String[] args){
        int count;
        arrayTraversal obj=new arrayTraversal();
        System.out.println("Enter the number of elements in array");
        count=obj.s.nextInt();
        int[] arr=obj.input(count);
        obj.Display(arr,count);
    }
}