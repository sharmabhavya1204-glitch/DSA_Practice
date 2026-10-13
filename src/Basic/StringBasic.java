package Basic;
import java.util.Scanner;
public class StringBasic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        str1 = str1.replace('l','x');
        System.out.println(str1);
        System.out.println(str1.trim());
        char[] arr= str1.toCharArray();
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
       }

        /*System.out.println(str1.toLowerCase());
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.contains("ram"));
        System.out.println(str1.substring(1,3));*/
       /* int count =0;
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);*/
       /*String str2 = sc.nextLine();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("same");

        }*/





        /*for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='h'){
                System.out.println("yes");

            }
        }*/

        //System.out.println(str);
        /*String name = "Hello";
        System.out.println(name);
        System.out.println(name.charAt(1));
        System.out.println(name.length());

        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }*/


    }
}
