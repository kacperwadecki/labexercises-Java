package lab11;

public class Pair<T>
{
    public Pair()
    {
        first = null;
        second = null;
    }

    public Pair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst()
    {
        return first;
    }

    public T getSecond()
    {
        return second;
    }

    public void setFirst(T newValue)
    {
        first = newValue;
    }

    public void setSecond(T newValue)
    {
        second = newValue;
    }

    public void swap(){
        T tmp1 = this.first;
        this.first = this.second;
        this.second = tmp1;
    }

    private T first;
    private T second;
}

