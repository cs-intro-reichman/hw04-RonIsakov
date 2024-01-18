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
        
    }

    public static String capVowelsLowRest (String string) {
        for(int i = 0; i < string.length(); i++){
            Character letter =  string.charAt(i);
            if ((((int) letter) > 64) && (((int) letter) < 91)) {
                if (i == 0) {
                    string = (char)(((int) letter) + 32) + string.substring(i+1,string.length());
                }else if ( i == string.length()) {
                    string = string.substring(0, i) + (char)(((int) letter) + 32);
                }else{
                    string = string.substring(0, i) + (char)(((int) letter) + 32) + string.substring(i+1,string.length());
                }
            }
        }
        for(int i = 0; i < string.length(); i++){
            Character letter =  string.charAt(i);
            if ((((int) letter) == 97) || (((int) letter) == 101) || (((int) letter) == 105) || (((int) letter) == 111) || (((int) letter) == 117)) {
                if (i == 0) {
                    string = (char)(((int) letter) - 32) + string.substring(i+1,string.length());
                }else if ( i == string.length()) {
                    string = string.substring(0, i) + (char)(((int) letter) - 32);
                }else{
                    string = string.substring(0, i) + (char)(((int) letter) - 32) + string.substring(i+1,string.length());
                }
            } 
        }
        return string;
    }

    public static String camelCase (String string) {
        int wordCounter = 0;
        int letterInWord = 0;
        for(int i = 0; i < string.length(); i++){
            Character letter =  string.charAt(i);
            
            if ((int)(string.charAt(i)) == 32) {
                if(i != 0){
                    if(string.charAt(i-1) != 32){
                        wordCounter++;
                    }
                }
                letterInWord = 0;
                if(i == 0){
                    string = string.substring(i+1,string.length());
                }else{
                    string = string.substring(0, i) + string.substring(i+1,string.length());
                }
                i = i-1;
            }else{
                if (wordCounter == 0) {
                    if ((((int) letter) > 64) && (((int) letter) < 91)) {
                        if (i == 0) {
                            string = (char)(((int) letter) + 32) + string.substring(i+1,string.length());
                        }else if ( i == string.length()) {
                            string = string.substring(0, i) + (char)(((int) letter) + 32);
                        }else{
                            string = string.substring(0, i) + (char)(((int) letter) + 32) + string.substring(i+1,string.length());
                        }
                    }
                }else{
                    if (letterInWord == 0) {
                        if ((((int) letter) > 97) && (((int) letter) < 122)) { 
                            if (i == 0) {
                                string = (char)(((int) letter) - 32) + string.substring(i+1,string.length());
                            }else if ( i == string.length()) {
                                string = string.substring(0, i) + (char)(((int) letter) - 32);
                            }else{
                                string = string.substring(0, i) + (char)(((int) letter) - 32) + string.substring(i+1,string.length());
                            }
                        }
                    }else{
                        if ((((int) letter) > 64) && (((int) letter) < 91)) {
                            if (i == 0) {
                                string = (char)(((int) letter) + 32) + string.substring(i+1,string.length());
                            }else if ( i == string.length()) {
                                string = string.substring(0, i) + (char)(((int) letter) + 32);
                            }else{
                                string = string.substring(0, i) + (char)(((int) letter) + 32) + string.substring(i+1,string.length());
                            }
                        }
                    }
                    letterInWord++;
                }

                
            }

        }
        return string;
    }

    public static int[] allIndexOf (String string, char chr) {
        int arrayLength = 0;
        for(int i = 0; i < string.length(); i++){
            Character letter =  string.charAt(i);
            if (letter == chr) {
                arrayLength++;
            }
        }
        int[] indexArray = new int[arrayLength];
        for(int j = 0; j < arrayLength; j++){
            for(int z = 0; z < string.length(); z++){
                Character letter =  string.charAt(z);
                if (letter == chr) {
                    indexArray[j] = z;
                    if (z == 0) {
                        string = (char)(((int) letter) + 32) + string.substring(z+1,string.length());
                    }else if ( z == string.length()) {
                        string = string.substring(0, z) + (char)(((int) letter) + 32);
                    }else{
                        string = string.substring(0, z) + (char)(((int) letter) + 32) + string.substring(z+1,string.length());
                    }
                    break;
                }
            }
        }
        return indexArray;
    }
}
