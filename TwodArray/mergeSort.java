class merging{
    void sorting(int arr[],int start,int end,int mergeArray[]){
        int mid=start+(end-start)/2;
        int i=start,j=mid+1,k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                mergeArray[k++]=arr[i++];
            }
            else{
                mergeArray[k++]=arr[j++];
            }
        }
        while(i<=mid){
            mergeArray[k++]=arr[i++];
        }
        while(j<=end){
            mergeArray[k++]=arr[j++];
        }
        for(i=0,j=start;i<k;i++,j++){
            arr[j]=mergeArray[i];
        }
    }
    void SortMergeArrray(int arr[],int start,int end,int mergeArray[]){
        if(start<end){
            int mid=start+(end-start)/2;
            SortMergeArrray(arr, start, mid, mergeArray);
            SortMergeArrray(arr, start, mid+1, mergeArray);
            sorting(arr, start, end, mergeArray);
        }
    }
}
public class mergeSort {
    public static void main(String[] args) {
        
    }    
}
