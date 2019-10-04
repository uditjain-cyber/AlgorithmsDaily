/*
This is a sample file explaining the format of your code. Do not make any changes to the file.
Author : <Priyanka>
College : <Guru Nanak Dev Enggering College>
Year/Department : <3rd Year>/<Computer Science Department>
E-Mail Id : <p7889122486@gmail.com>

Insert Your Code Here
*/
class SVCE
 {
     public static void main(String[] args)
     {
        String sampleSentence = "The quick     brown\tfox\njumps\n\nover the\tlazys\ndog";
        String[] words = sampleSentence.split("\\s+"); 
        int itemCount = words.length;
        System.out.println("The number of words is: " + itemCount);  //Tell the number of words in String.
         /*for (int i = 0; i < itemCount; i++) 
         {
             String word = words[i];
             System.out.println(word);
         }*/     // this comment code is used if we want to display each and every word in String.  :)
      }
}
