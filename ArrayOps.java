public class ArrayOps {
    public static void main(String[] args) {

    int  [] testArray = {0,2,3};
    int testing1 =0 ;
    testing1 = findMissingInt(testArray);
    System.out.println("sissing int is " + testing1);

    int testing2 =0 ;
    testing2 = secondMaxValue(testArray);
    System.out.println("second max value is " + testing2);
        

    int  [] testArray2 = {0,1};
    int  [] testArray3 = {0,3,1};
    System.out.println(containsTheSameElements(testArray2,testArray3));

    
    int  [] testArray4 = {2,5,0};
    boolean tes = isSorted(testArray4);
    System.out.println(tes);
    }

    
    public static int findMissingInt (int [] array) {
        // defining integers so the program is more readable
    int sum = 0 ;
    int n = array.length;
    
    //calculating the sum of the array and finding the biggest int
    for (int i = 0; i < n; i++ ){
        sum = sum + array[i];
    }
    // calculating the sum of theArithmetic progression
    int sumTotal = (( (n + 1) * (0 + n) ) / 2 );

    // returning the missing int as the sum of theArithmetic progression - the actual sum of the arry
    return(sumTotal - sum );   
    }

    public static int secondMaxValue(int [] array) {
        //defining an array and for readebility n as length of the array array
        int n = array.length;
        int[] sorted = new int[n];
        // defining sorted as array
        for(int i=0; i < n; i++){
            sorted[i] = array[i];
        }
        // sorting the array sorted by size
        for(int i=0; i<n-1 ;i++){
            for(int j = 0 ;j < (n-i-1) ;j++) {
                if(sorted[j] > sorted[j+1]){
                    int temp = sorted[j+1];
                    sorted[j+1] =  sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return(sorted[n-2]);   
        }
        
    

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        //cheking if the array1 and array2 contain the same elements
        boolean returning = true;
        int counter =0;
        for (int i =0; i < array1.length; i++){
            for(int j=0 ; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    counter++;
                }
            }
            if(counter < 1){
                returning = false;
                break;
            }
            counter = 0;
        }
        return(returning);
}

    

    public static boolean isSorted (int [] array) {
    boolean sorted1 = false;
    boolean sorted2 = false;
    int counter1 = 0;
    int counter2 = 0;
    int n = array.length;
    //checking if the set is orginized from min to max
    for(int i=0; i<n-1; i++){
        if(array[i] < array[i+1] ){
            counter1++;
        }
    }
        if (counter1 == n-1){
            sorted1 =true;
        }
        //checking if the set is orginized from max to min
        for(int j=0; j<n-1; j++){
            if(array[j] > array[j+1] ){
                counter2++;
            }
    }
    if (counter2 == n-1){
        sorted2 =true;
    }
    //if it os organized returns true 
    return (sorted1 || sorted2);
}
}
