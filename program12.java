public class program12 {
    public static void main(String[] args) {
        /* 
         int[] number = {44, 55, 66, 77, 88};
        int num = 67;
        boolean isinarray= false;
        for(int element: number){
        if (num==element)
            isinarray = true;
        break;
        }
            
            if(isinarray){
                System.out.println("the value present in array");
            }
            else{
                System.out.println("the value is not  present in array");

            }
                


            //-----------question 3------------
            int [] physics = {55,45,65,67,87};
            int sum = 0;
            for(int element: physics){
                sum = sum + element / 5;
            }
            System.out.print("average marks in physics is:");
            System.out.println(sum);




     //  ------------question 4-------------

     int[][] mat1 = {{1,2,3},
                      {2,4,6}};
    int[][] mat2 = {{1,1,3},
                      {4,4,6}};
                
                      int [][] result = {{0,0,0},
                                     {0,0,0,}};
 for (int i = 0; i < mat1.length; i++) {
    for (int j = 0; j < mat1[i].length; j++) {
        result[i][j] = mat1[i][j] + mat2[i][j];
        System.out.print(result[i][j] + " ");
    }
    System.out.println();
}



//------------question 5----------- reverse the array

int[] arr = {1,2,3,4,5,6,7,8};

int l = arr.length;
int n = Math.floorDiv(l,2);
int temp;
      for(int i = 0; i<n; i++){
        temp = arr[i];
        arr[i] = arr[l - i - 1];
         arr[l - i - 1] = temp;

      }
      for(int element: arr) {
        System.out.println(element + " ");
      }
      


      // ----------question 7--------- find maximum element in array


      int[] arr = {1,2,3,4,2,2,15,2,4};
      int max = arr[0];
      for(int i = 1; i<arr.length; i++){
          if(arr[i] > max) {
            max = arr[i];
          }
      }
System.out.println("maximum element in this array:" + max);
*/

// --------------question 8----------- sorted or not
boolean issorted = true;
int[] arr  = {12,34,43,51,734};
for(int i = 0; i <arr.length - 1; i++){
    if (arr[i] > arr[i+1]) {
        issorted = false;
        break;
    }
}
if(issorted) {
    System.out.println("the array is sorted");
}
else{
    System.out.println("the array is not sorted");
}
        }
}