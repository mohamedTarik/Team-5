public class Main
{

    public static void main(String[] args)
    {







    }









    public int countprime (int [] arr)  //20160273
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

            if(checker && arr[i]!=0 && arr[i]!=1)
            {
                counter++;
            }
        }
    return counter;
    }

}




