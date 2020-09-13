import java.util.*;
// import java.lang.*;
class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int p = 0;p<t;p++){
			int m = scn.nextInt();
			int n = scn.nextInt();
			segmentedsieve(m,n);
		}
	}
	
	public static void segmentedsieve(int m,int n){
		boolean[] tsieve = new boolean[(int)Math.sqrt((double)n)+1];
		for(int i = 2;i*i<=Math.sqrt((double)n);i++){
			if(!tsieve[i]){
				int j = i;
				int temp = i;
				while(temp*j<Math.sqrt(n)){
					temp *= j;
					j++;
					if(temp<Math.sqrt(n));
					tsieve[temp] = true;
					temp = i;
				}
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 2;i<tsieve.length;i++){
			if(!tsieve[i]) arr.add(i);
		}
		
		int diff = n-m;
		boolean[] sieve = new boolean[diff+1];
		
		for(int i = 0;i<arr.size();i++){
			int idx = (int)Math.ceil((double)((0.0 + m)/arr.get(i)));
			// System.out.println(idx);
			int j = arr.get(i);
            int temp = idx*j;
			while(temp<=n){
                if(temp!=j)
				sieve[temp-m] = true;
                temp+=j;
            }
			
		}
		for(int i = 0;i<=diff;i++){
            if(i+m<=1) continue;
			if(!sieve[i]) System.out.println(i+m);
        }
        // for(int i = 0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
	}
}

// import java.util.*;
// import java.lang.*;

 

// class main
// {
//     public static void main (String[] args) throws java.lang.Exception
//     {
// Scanner scn = new Scanner(System.in);
// int t = scn.nextInt();
// for(int i=1;i<=t;i++){
//  int m = scn.nextInt();
//  int n = scn.nextInt();
//  segmentedSieve(m,n);   
// }
//     }
//     public static void segmentedSieve(int m, int n){
//        boolean[] arr = new boolean[n-m+1];
//        double d = (double)n;
//         int sn = (int)Math.sqrt(d);
//         boolean[] sarr = new boolean[sn+1];
//          for(int i=2;i*i<=sn;i++){
//              if(sarr[i]==false){
//                  int jump = 2;
//                  for(int j=i;j*jump<=sn;jump++){
//                     // System.out.println(j);
//                     if(j<=sn)
//                sarr[j*jump]=true;
//             }
//         }
//         }
//         for(int i=2;i<=sn;i++){
//             if(sarr[i]==false){
//                 double ce = (double)(m/i);
//                 int c = (int)Math.ceil(ce);
//                 int f = c*i;
//                 int jump = 1;
//                 System.out.println(i);
//              for(int j=f;j*jump<=n;jump++){
//                  j+=i;
//                  int idx = j-m;
//                  if(idx<=n)
//                  arr[idx]=true;
//             }
//             }
//         }
//         for(int i=0;i<=(n-m);i++){
//             if(arr[i]==false){
//                 System.out.println(i+m);
//             }
//         }
//     }
        
        
//     }


// import java.util.*;
// import java.lang.*;
// class main
// {
//     public static void main (String[] args) throws java.lang.Exception
//     {
// Scanner scn = new Scanner(System.in);
// int t = scn.nextInt();
// for(int i=1;i<=t;i++){
//  int m = scn.nextInt();
//  int n = scn.nextInt();
//  segmentedSieve(m,n);   
// }
//     }
//     public static void segmentedSieve(int m, int n){
//        boolean[] arr = new boolean[n-m+1];
//        double d = (double)n;
//         int sn = (int)Math.sqrt(d);
//         boolean[] sarr = new boolean[sn+1];
//          for(int i=2;i*i<=sn;i++){
//         if(sarr[i]!=true){
//             int jump = 2;
//         for(int j=i;j*jump<=sn;jump++){
//                sarr[j*jump]=true;
//             }
//         }
//     }

//     for(int i=2;i<=sn;i++){
//         if(sarr[i]==false){
//             double ce = ((0.0+m)/i);
//             int c = (int)Math.ceil(ce);
//             int f = c*i; 
//             // System.out.println(f);

//               for(int j=f;j<=n;){
//               int idx = j-m;
//               if(i!=j)
//                arr[idx]=true;
//                       j=j+i;
//             }
//             }
//         }
//         for(int i=0;i<=(n-m);i++){
//             if((i+m)<=1) continue;
//             if(arr[i]==false){
//                 System.out.println(i+m);
//             }
//         }
//     }
//     }

// public class main {
//     static int a;

//     static{
//         System.out.println("I am first");
//         a = 5;
//     }
//     static{
//         System.out.println("I am second");
        
//     }
//     public static void main(String args[]) {
//         System.out.println("Hello World!"+a);
//     }

//     static{
//         System.out.println("I am third");
//     }
// }
