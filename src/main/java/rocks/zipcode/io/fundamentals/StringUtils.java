package rocks.zipcode.io.fundamentals;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string
       int length = string.length();
        // get range of length

        // get power-set of range

        // for every set in power-set
            // uppercase indices of string using set


        Collection<String> answer = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){

            answer.add(upperCaseIndices(string,i));
            System.out.println(answer);
        }

        System.out.println("answer to be returned" + answer);
        return answer;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {

        List<Integer> list = new ArrayList<>();

        for(Integer i : indices){
           list.add(i);
        }

            for(Integer i :list){
              string = replaceAtIndex(string, Character.toUpperCase(string.charAt(i)), i);
             }

        return string;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {

        String answer = "";
        String[] stringArr = stringToBeManipulated.split("");

        answer += stringToBeManipulated.substring(0,index);
        answer += valueToBeInserted;
        answer += stringToBeManipulated.substring(index);

        return answer;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {

        //needthis
        Character thing = stringToBeManipulated.charAt(index);

//        int indexOf = stringToBeManipulated.indexOf(thing);
//        String answer = stringToBeManipulated.substring(0,indexOf);
//        stringToBeManipulated = answer.replace(thing,replacementValue)+ stringToBeManipulated.substring(indexOf);
//        return stringToBeManipulated;

        stringToBeManipulated = stringToBeManipulated.replaceFirst(thing.toString(),replacementValue.toString());

        return stringToBeManipulated;


    }
}