package Git_Practice;

/*public class test {
    public static void main(String[] args) {
        long result = convert("-91283472332");
        System.out.println(result);
    }

    public static int convert(String s) {

        s = s.trim();
        int n=s.length(),i,top=0;
        if(n==0)
        {
            return 0;
        }
        String str="";
        char[] chr=s.toCharArray();
        String stack = "";
        int index=0;
        int dflag =0;
        for(i=0;i<chr.length;i++){
            if(chr[index]=='-')
            {
                stack+=chr[0];
                index++;
            }
            else if((chr[i]>='0' && chr[i]<='9')){
                if(chr[i]!=0)
                {
                    dflag=1;
                    stack+=chr[i];
                    index++;
                }
                else 
                {
                    continue;
                }
            }
            else if(i>0)
            {
                break;
            }
        }
         String res = new String(stack);
        System.out.println("Res: "+res);
        long result = 0;
        if(res.isEmpty())
            return (int)result;
        
        for(i=0;i<res.length();i++)
        {
            if(res.charAt(0)!='-' || i>0)
            {
                int x = res.charAt(i);
                //System.out.println(x-48);
                result=result*10+(x-48);

                if(result>Integer.MAX_VALUE)
                {
                    break;
                }
            }
        }
        return res.charAt(0)=='-' ? (int)result*-1: (int)result;
    }
    
}*/
/*public class test {

    public static void main(String[] args) {
        int rem=0,num=100;
        String s="";
        while(num>0){
            
            s=s+String.valueOf(num%7);
            num=num/7;
        }
        System.out.println(s);
    }
}*/



/*public class test {

    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        System.out.println(numMatchingSubseq(s, words)); 
    }
    public static int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isSubsequence(word, s)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSubsequence(String word, String s) {
        int i = 0, j = 0;
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == word.length();
    }
}*/


/*import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.lang.model.util.Elements;

public class test {

    public static void main(String[] args) {
        try {
            // Connect to a website
            Document doc = Jsoup.connect("https://example.com").get();

            // Extract the page title
            String title = doc.title();
            System.out.println("Title: " + title);

            // Extract all links
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                System.out.println(link.attr("href") + " - " + link.text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/



//deloitteQ1
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        int n,i,k=1,prime=0,r;
        System.out.println("enter the range:");
        r=sc.nextInt();
        int j=2;
        while(true){
            n=j;
            k=1;
            for(i=2;i<n;i++){
                if(n%i==0){
                    k=0;
                    break;
                }
            }
            if(k==1 && n%10==1){
                prime++;
                list.add(n);
            }
            j++;
            if(prime==r){
                break;
            }
        }
        System.out.println(list);
    }
}



//deloitteQ2
/*import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter the number:");
        n=sc.nextInt();
        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;  // prepend remainder
            n = n/ 2;
        }
        System.out.println(binary);
        String str="";
        int len=binary.length();
        for(i=0;i<len;i++){
            char ch=binary.charAt(i);
            if(ch=='1'){
                ch='0';
                str+=ch;
            }
            else if(ch=='0'){
                ch='1';
                str+=ch;
            }
        }
        System.out.println(str);
        //int num = Integer.valueOf(str, 2);
        int num=Integer.parseInt(str);
        int index=0,dec=0;
        while(num>0){
            int rem=num%10;
            dec=dec + rem*(int)Math.pow(2, index);
            index++;
            num=num/10;
        }
        System.out.println(dec);
    }
}*/