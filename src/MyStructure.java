import java.util.ArrayList;
import java.util.HashMap;

/*
    ამოცანა 6.
        ვქმნი საკუთარ მონეცემთა სტრუქტურას,
        ინახავს ნებისმიერ ელემენტს და შლის O(1) დროში.
*/

public class MyStructure<T> {
    private final ArrayList<T> list;
    private final HashMap<T, Integer> map;

    public MyStructure() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public void add(T item) {
        if (!map.containsKey(item)) { // ვამოწმებ უკვე არის თუ არა მეპში
            list.add(item);
            map.put(item, list.size() - 1);
        }
    }

    public boolean remove(T item) {
        if (map.containsKey(item)) { // ვამოწმებ მეპში
            int index = map.get(item);
            T lastItem = list.get(list.size() - 1);
            list.set(index, lastItem); // გადამაქვს ბოლო წევრი წასაშლელის ადგილას
            map.put(lastItem, index); // გადმოტანილი ბოლო წევრის ინდექსს ვაახლებ
            list.remove(list.size() - 1); // ვშლი ბოლო წევრს ლისტიდან
            map.remove(item); // ვშლი მეპიდან ბოლო წევრს
            return true;
        }
        return false;
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

}

