class Task7{
   public static void bubbleSort(int A[],int N){
 int r,j,t;
 for(r=1;r<=N-1;r++){
    for(j=0;j<=(N-1)-r;j++){
    if (A[j]>A[j+1]){
  t=A[j];
 A[j]=A[j+1];
 A[j+1]=t;
      }
     }
   }
  }
public static void main(String args[]){
 int arr[]={7,6,3,9,7};
int j;
 System.out.print("Array before sorting:");
 for(j=0;j<arr.length;j++){
  System.out.print(arr[j]+" ");
}
bubbleSort(arr,5);
System.out.println();
System.out.print("Array after sorting:");
for( j=0;j<arr.length;j++){
 System.out.print(arr[j]+" ");
    }
  }
}

   