import java.io.IOException;
import java.util.Scanner;


public class codeforcesProblem {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0)
        {
            String str =in.next();
            in.nextLine();
            char [] arr = str.toCharArray();
            boolean flag = false;
            if(arr[0]=='a'&&arr[1]=='b'&&arr[2]=='c')
            {
                flag=true;
            }
            else if((arr[0]=='c'&&arr[2]=='a')||(arr[0]=='b'&&arr[1]=='a')||(arr[1]=='c'&&arr[2]=='b'))
            {
                flag=true;
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }


    }
}
