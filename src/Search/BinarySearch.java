package Search;

public class BinarySearch {
    public static int BinSearch(int arr[],int si,int ei ,int key){
//        int si=0;
//        int ei=arr.length-1;
        int mid =(si+ei)/2;
        while(si<=ei){
           if(arr[mid]==key){
               return mid;
           }
           if(key>arr[mid]){
               si =mid +1;

           }else{
               ei =mid-1;
           }
           mid =(si+ei)/2;
        }
        return -1;

    }


    public static void main(String[] args) {
        int arr[] ={4,5,6,7,8,9,10};
        System.out.print(BinSearch(arr,0,arr.length-1,9));
    }
}
