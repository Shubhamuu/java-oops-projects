interface Example<T>
{
    void add(T t);
}
class abcd implements Example<Integer>
{
    int t;
    public void add(Integer t)
    {
        this.t = t;

    }
    public int get()
    {
        return t;
    }
}


public class Generic_Interface {
    public static void main(String[] args) {
        abcd ob = new abcd();
        ob.add(10);
        System.out.println(ob.get());
    }
}
