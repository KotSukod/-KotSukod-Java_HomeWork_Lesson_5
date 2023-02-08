package Home_Work;

import java.util.HashMap;
import java.util.TreeMap;

public class Task_1 {
    public static void main(String[] args) {

        //1.Создать словарь HashMap. Обобщение <Integer, String>.

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        

        //2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        
        map.put(4, "Four");
        map.put(5, "Five");
        map.putIfAbsent(6, "Six");

        //3.Изменить значения дописав восклицательные знаки.
        map.put(1, map.get(1) + '!');
        map.put(2, map.get(2) + '!');

        //4. Создать TreeMap, заполнить аналогично.

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        treeMap.putIfAbsent(6, "Six");

        //5. Увеличить количество элементов до 1000 случайными ключами и общей строкой.

        for (int i = 4; i < 1001; i++) {

            treeMap.put(i, "Test");
            
        }
        System.out.println(treeMap);

    }

    

    
}
