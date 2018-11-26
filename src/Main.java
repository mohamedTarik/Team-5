
public class Main
{

    public static void main(String[] args)
    {





    }



    public int countprime(int [] arr)  //20160273
    {
        int counter=0;

        for(int i =0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
            {
                counter++;
            }
        }
    return counter;
    }
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false; //number is divisible so its not prime
            }
        }
        return true; //number is prime now
    }
}




