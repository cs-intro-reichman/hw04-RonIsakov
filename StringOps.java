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
    String check = "One two tHRee world";
    System.out.println(capVowelsLowRest(check));
    String check2 = "   One two tHRee world";
    System.out.println(camelCase(check2));
    String check3 = "MMMM";
    char M ='M';
    int []  test = new int[4];
    test = allIndexOf(check3,M);
    for (int i=0;i<4; i++){
        System.out.print(test [i] + " ");
    }

    }

    //makes all the vowels caps the rest lowCaps
    public static String capVowelsLowRest (String string) {
        String Str = "";
        String allVowels = "aeiouAEIOU";
        for(int i=0 ; i<string.length() ; i++) {
            int n = string.charAt(i);
            //chekinf if the char is a vowel
            if(allVowels.indexOf(n) != -1) {
                if(string.charAt(i)>90)
                    Str = Str + (char)(n - 32);
                else
            Str = Str + string.charAt(i);
            }
            //making all the rest upper case lower case skipping ' '
            else if(string.charAt(i) == ' ' || n > 90){
                    Str = Str + string.charAt(i);
                    }
                    else{
                        Str = Str + (char)(n + 32);
                    }
        }
        return (Str);
        }
    
    // make the input a single word instead of spaces making the first later after caps
    public static String camelCase (String string) {
        String Str = "";
        int counter = 0;
        //making the string lower case
        string = lowCase(string);
        while(string.charAt(counter) == ' ' && counter < string.length() ){
        counter++;
        }
        //going through the string making it without spaces making the first latter after a space caps
        for(int i = counter ;i<string.length() ; i++) {
            if(string.charAt(i) == ' '){
                while(string.charAt(i) == ' ' && i < string.length() ){
                    i++;
                    }
                    Str = Str + ((char)(string.charAt(i) - 32));
                }
                else{
                    Str = Str + string.charAt(i);
                }
    }
    return(Str);
    }



    //taking a string making it all low caps
    public static String lowCase(String string) {
        String Str = "";
        for(int i = 0 ; i < string.length() ; i++)
            if(string.charAt(i) <= 90 && string.charAt(i) != ' ')
                Str = Str + (char)(string.charAt(i)+32);
            else
                Str += string.charAt(i);
        return Str;
    }

    // taking a string and a char  and returning the indexes of the string in which the char appears in an array
    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        int indexcounter=0;
        //checking how many times chr is in the string
        for(int i=0 ; i<string.length() ; i++) {
            if(string.charAt(i)==chr)
                counter++;
        }
        int[] Index = new int[counter];
        //making an array that holds all the indexes
        for(int i=0 ; i<string.length() ; i++) {
            if(string.charAt(i)==chr) {
                Index[indexcounter] = i;
                indexcounter++;
            }
        }
        return Index;
    }
}