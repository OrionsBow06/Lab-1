public class Reduce
{
    public static void main(String[] args)
    {
        int num = 100;
        int step = 0;
        while (true)
        {
            if (num%2 == 0 )
            {
                step++;
                num = num/2;
            }
            else
            {
                num = num -1;
                step++;
            }

            if(num == 0)
                break;

        }
        System.out.println(step);
    }
}
