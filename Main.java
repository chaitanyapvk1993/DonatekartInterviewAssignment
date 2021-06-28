import java.util.*;
public class Main {
  
     static void longestSubstr(String str)
    {
        int maxLength = 1;
 
        int start = 0;
        
 
        int max=0, min=0;
 
        
        for (int i = 1; i < str.length(); i++) 
        {
            
            min = i - 1;
            max = i;
            while (min >= 0 && max < str.length() && str.charAt(min)== str.charAt(max)) 
            {
                if (max - min + 1 > maxLength) 
                {
                    start = min;
                    maxLength = max - min + 1;
                }
                min--;
                max++;
            }
 
            
            min = i - 1;
            max = i + 1;
            while (min >= 0 && max < str.length()&& str.charAt(min)== str.charAt(max)) {
                if (max - min + 1 > maxLength) {
                    start = min;
                    maxLength = max - min + 1;
                }
                min--;
                max++;
            }
        }
 
       System.out.println(str.substring(start, start + maxLength)); 
 
 
       
    }
 
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        longestSubstr(str);
    }
}