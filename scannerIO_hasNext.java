import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i=1;
        Scanner s = new Scanner(System.in);
        while(true){
            if(s.hasNext())
                System.out.println(""+i+++" "+s.nextLine());
            else
                break;
        }
        i=0;
    }

}

