//Link: https://codeforces.com/problemset/problem/1903/A

import java.util.Scanner;
public class One{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();


        while(test-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            if(k==1){
                String ans="YES";
                for(int i=1;i<n;i++){
                    if(arr[i]<arr[i-1]){
                        ans="NO";
                        break;
                    }
                }
                System.out.println(ans);
            } 
            else{
                System.out.println("YES");
            }
            
        }
        sc.close();
    }
}