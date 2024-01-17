public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String test1 = "One two tHRee world";
        System.out.println(capVowelsLowRest(test1));
        String test2 = "HELLO borld";
        System.out.println(camelCase(test2));
        System.out.println("test");
    }
    
    
    public static String capVowelsLowRest (String string) {
    String newStr = "";
    char n;
    // cheking if each char of the string is a vowel if it is making it uper case 
    // if a letter witch is not a vowel is in upper case making it lower case returning the new string
    for(int i = 0; i < string.length(); i++ ){
        n = string.charAt(i);
        //cheking if there is a low caps vowel making it caps
        if( n == 'a' || n == 'e' ||  n == 'o' || n == 'u' || n == 'i' ){
            newStr = (newStr + (char) (n - 32));
            //cheking if there is a caps letter expt vowel making it lower case
        }
        else if(65 <= n && n <= 90 && n != 'A' && n != 'O'  && n != 'U'  && n != 'I'  && n != 'E'){
            newStr = (newStr + (char) (n + 32));
        }
        // if its not all the above then puting it in the new string
        else{
            newStr = newStr + n;
        }
    }
        return (newStr);
    }

    public static String camelCase (String string) {
    String newStr = "";
    char n;
    // cheking each letter making it lower case if 
    //there are sapces deliting them and making the next letter upercase

    for (int i = 0; i < string.length(); i++) {
        n = string.charAt(i);

        if (65 <= n && n <= 90) {
            newStr = (newStr + (char) (n + 32));
        } else if (n == ' ') {
            // Skip consecutive spaces
            while (i < string.length() && string.charAt(i) == ' ') {
                i++;
            }

            // Convert the next character to uppercase
            if (i < string.length()) {
                n = string.charAt(i);
                newStr = (newStr + (char) (n - 32));
            }
        } else {
            newStr = newStr + n;
        }
    }
    
        return (newStr);
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        char n;
        for(int i = 0; i < string.length(); i++ ){
            if(chr == string.charAt(i)){
                counter++;
            }
        }

        int counterArr = 0;
        int [] arr =new int [counter];
        for(int i = 0; i < string.length(); i++ ){
            n = string.charAt(i);
            if(n == chr){
                arr [counterArr] = i ;
                counterArr++;
            }
        }
        return(arr);
    }
}
