// public class SecondLargest {
//     public static void main (String [] args){
//         int [] arr = {12,35,1,10,34,1};

//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for(int num : arr){
//             if (num>largest){
//             secondLargest = largest;
//             largest = num ;
//             }else if (num > secondLargest && num < largest){
//                 secondLargest = num ;
//             }
//         }
//         System.out.println("Second largest element:" + secondLargest);
//     }
// }

public class SecondLargest{
    public static void main (String [] args){
        int [] arr = {23,3,4,5,67,32,45};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for ( int num : arr){
            if (num > largest){
                secondLargest = largest;
                largest = num ;
            }
            else if(num > secondLargest && num < largest) {
                secondLargest = num ;

            }
        }
        System.out.println("Second Largest elemengt: "+secondLargest);
    }
}