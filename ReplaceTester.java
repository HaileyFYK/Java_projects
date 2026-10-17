/**
 * Author: Hailey Kuo
 * Date: 10/05/2026
 * Description of Program: This program takes a sentence, converts it to uppercase, and then replaces certain characters with symbols. Finally, it prints the original sentence, the uppercase version, the modified version with replacements, and the length of the modified string.
 */
 
public class ReplaceTester
{
    public static void main(String[] args)
    {
        String sentence = "Mississippi River is not the longest river in the world.";
        
        String upcase = sentence.toUpperCase();
        
        String replace_at = upcase.replace("A", "@");
        String replace_i = replace_at.replace("I", "!");
        String replace_s = replace_i.replace("S", "$");
        
        System.out.println(sentence);
        System.out.println(upcase);
        System.out.println(replace_i);
        System.out.println("length of the string = " + replace_i.length());
    }
}