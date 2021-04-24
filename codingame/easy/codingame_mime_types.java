import java.util.*;
import java.io.*;
import java.math.*;

/*
https://www.codingame.com/ide/puzzle/mime-type

MIME types are used in numerous internet protocols to associate a media type (html, image, video ...) 
with the content sent. The MIME type is generally inferred from the extension of the file to be sent.

You have to write a program that makes it possible to detect the MIME type of a file based on its name.
*/

class Solution 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        
        HashMap<String,String> filenamesAndExtensions = new HashMap<String,String>();
        
        for (int i = 0; i < n; i++) {
            String extension = in.next(); 
            String mimeType = in.next(); 
            in.nextLine();
            filenamesAndExtensions.put(extension.toLowerCase(), mimeType);
        }        
		
        for (int i = 0; i < q; i++) {
            String fName = in.nextLine().toLowerCase();
            
            if (fName.indexOf(".") == -1) {
                System.out.println("UNKNOWN");
            } else {
                if (filenamesAndExtensions.get(fName.substring(fName.lastIndexOf(".") + 1)) != null)
                    System.out.println(filenamesAndExtensions.get(fName.substring(fName.lastIndexOf(".") + 1)));
                else 
                    System.out.println("UNKNOWN");
            }
        }
    }
}