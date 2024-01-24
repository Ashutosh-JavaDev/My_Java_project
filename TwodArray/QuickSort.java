class quick{
    int quickSorting(int arr[],int low,int high){
        int pivot=high;
        int i=low-1;
        for(int j=0;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return i;
    }
    void recursiveQuick(int arr[],int low,int high){

        if(low<high){
            int recInd=quickSorting(arr,low,high);
            recursiveQuick(arr, recInd+1, high);
            recursiveQuick(arr, low, recInd);
        }
    }
}public class QuickSort {
    
}
