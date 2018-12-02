import sun.applet.Main;
import java.util.*;
import java.util.Arrays;

public class Main12
{


	public static void main(String[] args) {

		int y=1;
		while(y==1)
		{

			Scanner in = new Scanner(System.in);
			System.out.println("Size of Array");
			int x = in.nextInt();
			int arr[] = new int[x];
			System.out.println("Enter numbers");
			for (int i = 0; i < x; i++)
				arr[i] = in.nextInt();
			System.out.println("Please Enter String");
			Scanner cin= new Scanner (System.in);
			String word= cin.nextLine();
			System.out.println("Choose Function: ");
			System.out.println("0 For all Functions: ");
			System.out.println("1 For Countprime: ");
			System.out.println("3 For Distinct array: ");
			System.out.println("6 for smallest 3 numbers");
			System.out.println("8 For Palindrom: ");
			System.out.println("9 For Finding Smallest primenumber: ");
			System.out.println("11 For Most Repeated Value: ");
			System.out.println("12 for reverse array: ");
			System.out.println("14 for greatest 3 numbers");
			System.out.println("15 For Average: ");
			System.out.println("17 for getting prime numbers");
			
			

			x = in.nextInt();

			if (x == 0) {
				System.out.println("Total prime number in Arr = " + countprime(arr));
				System.out.println("Check palindrom: " + isPalindrome(word)  );
				System.out.println(primeNum(arr));
				System.out.print("Average: " );
				AVERAGE(arr);;
				System.out.println("Most Repeated Value");
				Most_Repeted_Value(arr);
				System.out.println("");
				System.out.println("The Distinc array:");
				Distinct(arr);
				GetMaximum3Numbers(arr);
				ReverseArray(arr);
				/*Prime Numbers */
				ArrayList<Integer> primeArray = new ArrayList<Integer>();
				primeArray = returnPrimes(arr);
				System.out.println("Prime Numbers : " + primeArray ) ;
				GetMinimum3Numbers(arr);
			
				
			}
			else if (x == 1) {
				System.out.println("Total prime number in Arr = " + countprime(arr));

			}
			else if (x == 2) {


			}

			else if (x == 3) {
				System.out.println("The Distinc array:");

				Distinct(arr);


			}
			else if (x == 4) {


			}
			else if (x == 5) {


			}
			else if (x == 6) {
				GetMinimum3Numbers(arr);

			}
			else if (x == 7) {


			}
			else if (x == 8) {
				System.out.println("Check palindrom: " +isPalindrome(word));

			}
			else if (x == 9) {
				System.out.println(primeNum(arr));

			}
			else if (x == 10) {



			}
			else if (x == 11) {
				Most_Repeted_Value(arr);

			}
			else if (x == 12) {
				ReverseArray(arr);
			}
			else if (x == 13) {


			}
			else if (x == 14) {
				GetMaximum3Numbers(arr);


			}
			else if (x == 15) {
				Main12 m=new Main12();
				m.AVERAGE(arr);

			}
			else if (x == 16) {


			}
			else if (x == 17) {
				ArrayList<Integer> primeArray = new ArrayList<Integer>();
				primeArray = returnPrimes(arr);
				System.out.println("Prime Numbers : " + primeArray ) ;


			}


			System.out.println("Press one if you want to restart");
			y = in.nextInt();


		}
	}
	public static void GetMaximum3Numbers(int arr[]) {
		/*int biggest1 = getmax(arr);
		int arr1[];
		arr1 = Arrays.*/

		int biggest1 = arr[0];
		for(int i:arr) {
			if(i>biggest1) {
				biggest1 = i;
			}
		}
		int biggest2 = arr[0];
		for(int i:arr) {
			if(i > biggest2 && i!=biggest1) {
				biggest2 = i;
			}
		}
		int biggest3 = arr[0];
		for(int i:arr) {
			if(i>biggest3 && i!=biggest1 && i!=biggest2) {
				biggest3 = i;
			}
		}
		System.out.println(biggest1 + ", " +biggest2 + ", " + biggest3);
	}
	public static void GetMinimum3Numbers(int arr[]) {
		int n = arr.length;
		Arrays.sort(arr);
		for(int i = 0 ; i < Math.min(3, n) ; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
	public static int primeNum(int arr []) {

		int least = 1000000000;
		boolean chk = false;

		for(int i = 0; i < arr.length; i++)
			if(primeCheck(arr[i]) && arr[i] < least)
			{
				chk = true;
				least  = arr[i];
			}
		if(chk == true)
		{
			System.out.println("The Least Prime Is: ");
			return least;
		}
		else
		{
			System.out.println("None are prime!!");
			return -1;
		}
	}
	public static boolean  primeCheck(int arr) {
		if(arr== 0 || arr == 1)
			return false;
		else
			for(int i = 2; i <arr; i++)
				if(arr % i == 0)
					return false;
		return true;
	}
	public static int countprime (int [] arr) {
		int counter=0;
		Boolean checker;

		for(int i =0;i<arr.length;i++)
		{
			checker=true;

			for(int j=2; j<arr[i]; j++){
				if(arr[i]%j == 0){
					checker=false;
				}
			}

			if(checker && arr[i]!= 0 && arr[i]!= 1)
			{
				counter++;
			}
		}
		return counter;
	}
	public static boolean isPalindrome(String inputString){
		int length  = inputString.length();
		int i, begin, end, middle;
		begin  = 0;
		end    = length - 1;
		middle = (begin + end)/2;
		for (i = begin; i <= middle; i++) {
			if (inputString.charAt(begin) == inputString.charAt(end)) {
				begin++;
				end--;
			}else {
				break;
			}
		}
		if (i == middle + 1)
		{
			return true;     //yes its palandrome
		}
		else
		{
			return false;  //Not Palandrome
		}

	}
	public static void AVERAGE (int[]arr) {
		// double[] arr = {19, 12.89, 16.5, 200, 13.7};
		int total = 0;

		for(int i=0; i<arr.length; i++){
			total = total + arr[i];
		}
		int average = total / arr.length;


		System.out.print( average);

	}
	public static void bubbleSort(Vector<Integer> z, Vector<Integer> ch) {
		int[] arr = new int[z.size()];
		int[] arr2 = new int[ch.size()];

		for (int i = 0; i < z.size(); i++) {

			arr[i] = z.get(i);
			arr2[i] = ch.get(i);
		}
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					int temp2 = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp2;
				}
		z.clear();
		ch.clear();
		for (int a = 0; a < arr.length; a++) {
			z.add(arr[a]);
			ch.add(arr2[a]);
		}
	}
	public static void Most_Repeted_Value(int[] s_Arr) {
		//int [] s_Arr={1,5,2,4,1,8,8,4,1,2,3,6,5,1,4,1,2,1};
		Vector<Integer> V = new Vector<>();
		Vector<Integer> Counts = new Vector();

		for (int i = 0; i < s_Arr.length; i++) {
			if (!V.contains(s_Arr[i])) {
				V.add(s_Arr[i]);
			}
		}
		//the V has the unique values//

		for (int p = 0; p < V.size(); p++) {
			int match = V.get(p);
			int count = 0;
			for (int u = 0; u < s_Arr.length; u++) {

				if (match == s_Arr[u]) {
					count++;
				}
			}
			Counts.add(count);

		}
		bubbleSort(Counts, V);
		Collections.reverse(Counts);
		Collections.reverse(V);

		System.out.println("Most Repeted Value is : " + V.get(0));
		System.out.println("its Counts : " + Counts.get(0));


	}
	public static void Distinct(int []arr) {

		String temp="";
		String collect="";
		boolean flag=false;
		int x;

		for (int i = 0; i < arr.length; i++)
		{
			collect+=arr[i];
			collect+=" ";
		}
		ArrayList<String> values= new ArrayList<String>(Arrays.asList(collect.split(" ")));
		ArrayList<String> add=new ArrayList<>();

		for(int i=0;i<values.size();i++){

			x=add.indexOf(values.get(i));

			if(x==-1)
				add.add(values.get(i));
		}

		for(int i=0;i<add.size();i++)
			System.out.print(add.get(i)+" ");


	}
	public static void ReverseArray(int[]arr){
		int b[]=new int[arr.length];
		for (int i =0 ; i<arr.length; i++){

			b[i]=arr[arr.length-i-1];
			System.out.println(b[i]);
		}
	}
	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static ArrayList<Integer> returnPrimes(int[]arr){
		ArrayList<Integer> primeArray = new ArrayList<Integer>();
		for(int i =0 ; i< arr.length ;i++ )
		{
			if(isPrime(arr[i])){
				primeArray.add(arr[i]);
			}
		}
		return primeArray;
	}

}
