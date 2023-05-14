import java.util.*;
public class getNumbers {

public static void getLargest(int numbers[]){
    for(i =0; i<numbers.length; i++){
        if(largest<numbers[i]){
            largest = numbers[i];
        }
    }
return largest;
}


    public static void main(String[] args) {
        int numbers[] = {1,2,3,6,5};
         int Largest = Integer.MIN_VALUE;
        System.out.println("largest is" + getLargest(numbers));

    }
}
