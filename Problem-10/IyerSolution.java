/*
Author : Sriram Iyer
College : University of Pittsburgh
Year/Department : Senior/Computer Science
E-Mail Id : gavinfreud@gmail.com
*/
class IyerSolution {

    public static void main(String[] args) {
        String input = "I like programming.";
        System.out.println("Input: " + input);
        String output = reverseWords(input);
        System.out.println("Output: " + output);
        System.out.println("");
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder newS = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            newS.append(words[i]);
            newS.append(" ");
        }
        return newS.toString().trim().replaceAll(" +", " ");
    }
}
