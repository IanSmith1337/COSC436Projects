

public class Problem2 {
/*Write a function to find the longest common prefix string amongst an array of strings.
Input: ["flower", "flow", "flight"]	Output: "fl"

Input: ["dog", "racecar", "car"]		Output: ""
Explanation: There is no common prefix among the input strings.
*/
    public static void main(String[] args) {
        String [] words = {"flower", "flow", "flight"};
        System.out.println(commonPrefix(words));
    }

    public static String commonPrefix(String[] arr) {
        if (arr.length == 0){
            return "";
        }
        String temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(temp)!=0) {
                temp = temp.substring(0, temp.length()-1);
                if (temp.isEmpty()) {
                    return "";
                }
            }    
        } 
        return temp;
    }
}


/* 
to compile: 

javac <folder>/<filename>
cd <folder>
java <filename>

*/










