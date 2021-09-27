class fetchData extends Thread {
    public void part1()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("This Fetch Data Thread");
            try{
                Thread.sleep(5000);
            }
            catch(Exception e)
            {

            }

        }
    }
}
class processData implements Runnable
{
    public void part2(){
        for(int i=1;i<=3;i++)
        {
            System.out.println("this is process data");
            try{
                Thread.sleep(10000);
            }
            catch(Exception e)
            {

            }
        }
    }
}
public class question3{
    public static void main(String args[])
    {
        fetchData obj= new fetchData();
        processData obj1=new processData();
        obj.part1();
        obj1.part2();
    }
}