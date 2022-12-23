public class Sort{
    public static void main(String[]arg){
        // defination of variables and given it initial values
        int arr[] = new int[]{10, 20, 5, 6, 30, 1, 2};
        boolean bool = true;
        int t =0;
        //a loop of while will be run if the bool is always equal true
        while (bool) {
            // a loop of for
            for (int i = 0; i < arr.length - 1; i++) {
                // two statments 
                if (arr[i] > arr[i + 1]) {
                  int c = arr[i];

                  arr[i] = arr[i + 1];
                  arr[i + 1] = c;
                  t++;
                }
            }
            if (t == 0) {
            bool = false;
            }
             t = 0;
        }
            //for each
            for (int y : arr) {
              System.out.println(y);
           }
   }
}