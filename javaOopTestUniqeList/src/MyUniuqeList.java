import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MyUniuqeList<T> implements Iterable<T> {
    private List<T> unique = new ArrayList<>();
   private List<String> tempList = new ArrayList<>();
    private String secretKey;
    private int count = 0;

    public MyUniuqeList(String secretKey) {
        this.secretKey = secretKey;
    }

    public void add(T s) {
        int count = 0;
        for (int i = 0; i < unique.size(); i++) {
            if (s == unique.get(i))
                count++;
        }
        if (count == 0)
            unique.add(s);
    }

    public List<T> getUnique() {
        return unique;
    }

    public void remove(String s) throws Exception {
        if (s.isEmpty() || s.equalsIgnoreCase(null))
            throw new Exception("you cant delete an empty value");
        unique.remove(s);
    }

    public void removeAt(int index) throws Exception {
        if (index < 0 || index > unique.size())
            throw new Exception("you cant delete index smaller then 0 or bigger then the list size");
        unique.remove(index);
    }

    public void clear(String s) throws Exception {
        if (s.equalsIgnoreCase(secretKey))
            unique.clear();
        else
            throw new Exception("secret key is really not true");
    }

    public void sort(String s) throws Exception {
        if (s.equalsIgnoreCase(secretKey)) {
            for (int i = 0; i < unique.size(); i++) {
                tempList.add(unique.get(i).toString());

            }
            Collections.sort(tempList);
            unique = (List<T>) tempList;
        } else
            throw new Exception("secret key is really not true");
    }

    @Override
    public String toString() {
        return "MyUniuqeList{" +
                "unique=" + unique +
                ", secretKey='" + secretKey + '\'' +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator(this);
    }

    //inner Class
    private class MyIterator implements Iterator<T> {
        private MyUniuqeList<T> list;
        private int index = 0;

        public MyIterator(MyUniuqeList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.unique.size());
        }

        @Override
        public T next() {
            return list.unique.get(0);
        }

    }
}