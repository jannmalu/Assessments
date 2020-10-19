import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ReverseString

{
    public static void main(String[] args) 
    {
        System.out.println("Enter your string : ");
        Scanner strScanner = new Scanner(System.in);
        
        String str = strScanner.nextLine();
        
        List<String> strings = new ArrayList<>();
        
        List<String> reverseStrings = new ArrayList<>();
        
        int index = 0;
        while (index < str.length()) 
        {
        strings.add(str.substring(index, Math.min(index + 4,str.length())));
        index += 4;
        }
        
        StringBuilder strBuilder = new StringBuilder();      
        
        int loops = (int) Math.ceil( str.length() / 4);
        
        for(int i=0; i<loops; i++)
        {
            strBuilder.append(strings.get(i));
            strBuilder = strBuilder.reverse();
            
            reverseStrings.add(strBuilder.toString());
            strBuilder.setLength(0);
                       
        }
            System.out.println("Original string : ");
            String s = strings.stream().collect(Collectors.joining(" ")).replaceAll("\\s", "");
            System.out.println(s);
            String rS = reverseStrings.stream().collect(Collectors.joining(" ")).replaceAll("\\s", "");
            System.out.println("Reverse string : ");
            System.out.println(rS);    

            strScanner.close();
    }
}


