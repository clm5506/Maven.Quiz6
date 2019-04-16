package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {

        String answer = "";

        for(int i = 0; i < chars.length; i++){
            answer += chars[i];
        }
        return answer;

    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        String answer = "";

        for(int i = 0; i < chars.length; i++){
            answer += chars[i];
        }

        return answer;
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
//        String answer = "";
//
       String aeiou = "aeiouAEIOU";
//
//        String[] stringCharArray = string.split("");
//
//        for(int i = 0; i < string.length(); i++){
//            if(aeiou.indexOf(string.charAt(i)) < 0){
//                answer += string.charAt(i);
//            }
//        }


        return removeSpecifiedCharacters(string,aeiou);
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {

        String answer = "";

        String[] stringCharArray = string.split("");

        for(int i = 0; i < string.length(); i++){
            if(charactersToRemove.indexOf(string.charAt(i)) < 0){
                answer += string.charAt(i);
            }
        }
        return answer;


    }
}
