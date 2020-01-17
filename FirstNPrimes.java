//Joseph Charuhas
// test question # 25/26


public class FirstNPrimes
{
    public static void printPrimes(int n)
    {
        int num = 2;
        int i = 0;
        while(i < n)
        {
            if(isPrime(num))
            {
                System.out.print(num + " ");
                i++;
            }
            num++;
        }
    }
    static boolean isPrime(int n)
    {
        for (int i = 2; i <=Math.sqrt(n) ; i++) 
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        int N = 5;
        printPrimes(N);
        System.out.println();
        N = 20;
        printPrimes(N);
    }

}
 