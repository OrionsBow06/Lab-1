public class Multiples
{
    public static void main(String[] args)
    {
        int bound = 1000;
        int count = 0;
        for(int i = 1; i < bound; i++ )
        {
            if (i%3 == 0 && i%5 == 0)
                count++;
            else if (i%3 == 0 || i%5 == 0)
                count++;
        }
        System.out.println(count);
    }
}
