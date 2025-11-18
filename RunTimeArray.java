import java.util.*;

public class RunTimeArray{
public static void main(String[] args){

int[] arr = new int[50];
Scanner sc = new Scanner(System.in);

System.out.println("Enter no:of elements");
int n = sc.nextInt();

for(int i=0;i<n;i++){
System.out.println("Enter element "+i+ " : ");
arr[i]=sc.nextInt();
}

int max = arr[0];

for(int i=1;i<n;i++){
if(arr[i]>max) max = arr[i];
}

System.out.println("Max Element is : "+max);

}
}
