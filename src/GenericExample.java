import java.util.ArrayList;
import java.util.List;

public class GenericExample<T> {

    public List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }
    
    public void lerLista(){
        for (T obj : list){
            System.out.println(obj.toString());
        }
    }




}