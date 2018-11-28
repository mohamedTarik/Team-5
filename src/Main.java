import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

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
            String word= in.nextLine();
            System.out.println("Choose Function: ");
            System.out.println("0 For all Functions: ");
            System.out.println("1 For Countprime: ");
            System.out.println("8 For Palindrom: ");
            System.out.println("9 For Finding Smallest primenumber: ");
            x = in.nextInt();

            if (x == 0) {
                System.out.println("Total prime number in Arr = " + countprime(arr));
                System.out.println("Check palindrom: " + isPalindrome(word)  );
                System.out.println(primeNum(arr))

            }
            else if (x == 1) {
                System.out.println("Total prime number in Arr = " + countprime(arr));

            }
            else if (x == 2) {


            }

            else if (x == 3) {


            }
            else if (x == 4) {


            }
            else if (x == 5) {


            }
            else if (x == 6) {


            }
            else if (x == 7) {


            }
            else if (x == 8) {
              System.out.println("Check palindrom: " +isPalindrome(word));

            }
            else if (x == 9) {
              System.out.println(primeNum(arr))

            }
            else if (x == 10) {


            }
            else if (x == 11) {


            }
            else if (x == 12) {


            }
            else if (x == 13) {


            }
            else if (x == 14) {


            }
            else if (x == 15) {


            }
            else if (x == 16) {


            }
            else if (x == 17) {


            }




            System.out.println("Press one if you want to restart");
            y = in.nextInt();


        }
    }
  



    public static int primeNum(int arr [])
    {

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
    public static boolean  primeCheck(int arr)
    {
        if(arr== 0 || arr == 1 ||arr == 2)
            return false;
        else
            for(int i = 2; i <arr; i++)
                if(arr % i == 0)
                    return false;
        return true;
    }




    public static int countprime (int [] arr)
    {
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

            if(checker && arr[i]!= 0 && arr[i]!= 1 && arr[i]!=2)
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
        if (i == middle + 1) {
            return true;\\ yes its palandrome 
        }else {
            return false;\\not palandrome
        }
    }




}




