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
    String check = "lOve You ALLLL";
    System.out.println(capVowelsLowRest(check));
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
    
    // takes a (valid) string as input and return the same string without spaces and all lower case
    // except for the first letter of each word from the second word (incusive) and on
    public static String camelCase (String string) {
        String Str = "";
        int counter = 0;
        string = lowCase(string);
        while(string.charAt(counter) == ' ' && counter < string.length() ){
        counter++;
        }
        //going through the string char by char and mutating it according to the requirments
        for(int i = i ;i<string.length() ; i++) {
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



    //take a (valid) string as input and return the same string with only lower cases letters
    public static String lowCase(String string) {
        String Str = "";
        for(int i = 0 ; i < string.length() ; i++)
            if(string.charAt(i) <= 90 && string.charAt(i) != ' ')
                Str = Str + (char)(string.charAt(i)+32);
            else
                Str += string.charAt(i);
        return Str;
    }

    //takes a (valid) string and a char as input and return the indexes of the string in which the char appears
    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        //checking how many times chr appears in string
        for(int i=0 ; i<string.length() ; i++) {
            if(string.charAt(i)==chr)
                counter++;
        }
        int j=0;
        //declaaring an array to hold the wanted indexes
        int[] chrIndex = new int[counter];
        for(int i=0 ; i<string.length() ; i++) {
            if(string.charAt(i)==chr) {
                chrIndex[j] = i;
                j++;
            }
        }
        return chrIndex;
    }
}