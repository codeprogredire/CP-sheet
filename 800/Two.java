//Link: https://codeforces.com/problemset/problem/1901/A

import java.util.Scanner;
public class Two {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();

        while(test-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int ans=arr[0];

            for(int i=1;i<n;i++){
                ans=Math.max(ans,arr[i]-arr[i-1]);
            }

            ans=Math.max(ans,2*(x-arr[n-1]));

            System.out.println(ans);
        }
        sc.close();
    }
}
