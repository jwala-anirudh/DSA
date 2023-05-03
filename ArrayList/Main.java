import java.util.Scanner;
class ArrayList<T>
{ Object[] arr;
    int size;
    int capacity;
    ArrayList()
    {
        capacity = 0;
        size = 0;
        arr = new Object[capacity];
    }
    ArrayList(int c)
    {
        capacity = c;
        size = 0;
        arr = new Object[capacity];
    }
    int currentCapacity()
    {
        return capacity;
    }
    void add(T item) //To add element at last
    {
        if(size == capacity)
        {
            Object brr[] = new Object[size];
            System.arraycopy(arr, 0, brr, 0, size);
            capacity = capacity +1;
            arr = new Object[capacity];
            if (size >= 0) System.arraycopy(brr, 0, arr, 0, size);
        }
        arr[size++] = item;
    }
    void checkIndex(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index = " + index + " size = " + size);
    }
    void addFirst(T item)
    {
        if(size == capacity)
        {
            Object brr[] = new Object[size];
            for(int i = 0; i < size; i++)
                brr[i] = arr[i];

            capacity = capacity +1;
            arr = new Object[capacity];
            for(int i = size -1; i >= 0; i--)
                arr[i + 1] = brr[i];
        }
        arr[0] = item;
        size++;
    }
    T get(int index)
    {
        return (T)arr[index];
    }
    public int indexOf(Object theElement)
    {
        for (int i = 0; i < size; i++)
            if (arr[i].equals(theElement))
                return i;
        return -1;
    }
    public Object remove(int index)
    { checkIndex(index);
        Object removedElement = arr[index];
        for (int i = index + 1; i < size; i++)
            arr[i-1] = arr[i];
        size=size-1;
        arr[size] = null;
        return removedElement;
    }
    int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        if(size==0)
            return true;
        else
            return false;
    }
    public String toString()
    {
        StringBuffer s = new StringBuffer("[");
        for (int i = 0; i < size; i++)
            if (arr[i] == null) s.append("null, ");
            else s.append(arr[i].toString() + ", ");
        if (size > 0) s.delete(s.length() - 2, s.length()); // remove last
        s.append("]");
        return new String(s);
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> a = new ArrayList();

        System.out.println(a.currentCapacity());
        System.out.println("Enter the size = ");
        int s = input.nextInt();
        System.out.println("Enter the elements = ");
        for (int i =0; i < s; i++)
        {
            String n = input.next();
            a.add(n);
        }
        int k = a.currentCapacity();
        System.out.println("Array = ");
        for (int j = 0; j < a.size(); j++)
        {
            System.out.println(a.get(j));
        }
        System.out.println("Size = " + a.currentCapacity());
        System.out.println("Enter new element = ");
        String n = input.next();
        a.addFirst(n);
        System.out.println(" New Array With Element Added At First = ");
        for (int j = 0; j < a.size(); j++)
        {
            System.out.println(a.get(j));
        }
        System.out.println("Size = " + a.currentCapacity());
        System.out.println("Enter an element = ");
        String l = input.next();
        a.add(l);
        System.out.println(" New Array With Element Added At Last = ");
        for (int j = 0; j < a.size(); j++)
        {
            System.out.println(a.get(j));
        }
        System.out.println("Size = " + a.currentCapacity());
        System.out.println("Is Empty?");
        System.out.println(a.isEmpty());
        System.out.println("Removed element present at last: ");
        a.remove(a.indexOf(l));
        for (int j = 0; j < a.size(); j++)
        {
            System.out.println(a.get(j));
        }
        System.out.println("Removed element present at First: ");
        a.remove(a.indexOf(n));
        for (int j = 0; j < a.size(); j++)
        {
            System.out.println(a.get(j));
        }
        System.out.println("String Conversion: ");
        System.out.println(a.toString());

    }
}
