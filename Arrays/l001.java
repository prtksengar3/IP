public class l001[
    public static void main(String[] args) {
        solve();
    }

    public int minTotalDistance(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        for(int i = 0;i<m;i++){//fill row array
            for(int j=0;j<)     //
            if(grid[i][0]==1);
        }

        for(int j = 0;j<arr[0].length;j++){//fill column array
            if(grid[][])
        }
                                        //find median of row and col
                                        //for loop single 
    }


    public static void solve(){
        {{1,0,0,0,1},
         {0,0,0,0,0},
         {0,0,1,0,0} }
    }

    import java.util.*;
import java.lang.*;

class Main
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
		boolean[] tsieve = new boolean[Math.sqrt(n)+1];
		for(int i = 2;i*i<=n;i++){
			if(!tsieve){
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
		
		ArrayList<Integer> prime = new ArrayList<>();
		for(int i = 2;i<=tsieve.length;i++){
			if(!tsieve) prime.add(i);
		}
		
		int diff = n-m;
		boolean[] sieve = new boolean[diff+1];
		
		for(int i = 0;i<arr.length;i++){
			int idx = Math.floor((i + m)/arr.get(i));
			
			int j = arr.get(i);
			int temp = idx;
			while(temp*j<=diff){
				temp *= j;
				j++;
				if(temp<=diff);
				sieve[temp-m] = true;
				temp = i;
				}
			
		}
		for(int i = 0;i<=diff;i++){
			if(!sieve) System.out.println(i+m);
		}
	}
}
]