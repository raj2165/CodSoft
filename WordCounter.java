import java.util.Scanner;

public class WordCounter{
    
    public static void main(String[] args){
        System.out.println("Please enter the words");
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.nextLine();
            int count=1;
            for(int i=0;i<s.length()-1;i++){
                if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
                    count++;
                }
            }
            System.out.println("The total counting of words:"+ count);
        }
    }
}
