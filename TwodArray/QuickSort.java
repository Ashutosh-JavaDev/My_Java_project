class quick{
    int quickSorting(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    void recursiveQuick(int arr[],int low,int high){

        if(low<high){
            int recInd=quickSorting(arr,low,high);
            recursiveQuick(arr, low, recInd-1);
            recursiveQuick(arr, recInd+1, high);
        }
    }
}
public class QuickSort {
 public static void main(String[] args) {
    quick ob=new quick();
    int arr[]={32,23,53,14,65,24,312,67,87,68};
    int n=arr.length;
    ob.recursiveQuick(arr, 0, n-1);
    System.out.println("Array After Sort");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }   
}
