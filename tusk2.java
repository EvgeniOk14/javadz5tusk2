import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class tusk2
{
    public static void main(String[] args)
    {
        Map<String, String> base = new HashMap<String, String>();
        base.put("Иванов", "Иван");
        base.put("Петрова", "Светлана");
        base.put("Белова", "Кристина");
        base.put("Мусина", "Анна");
        base.put("Крутова", "Анна");
        base.put("Юрин", "Иван");
        base.put("Лыков", "Петр");
        base.put("Чернов", "Павел");
        base.put("Чернышов", "Петр");
        base.put("Федорова", "Мария");
        base.put("Светлова", "Марина");
        base.put("Савина", "Мария");
        base.put("Рыкова", "Мария");
        base.put("Лугова", "Марина");
        base.put("Владимирова", "Анна");
        base.put("Мечников", "Иван");
        base.put("Петин", "Петр");
        base.put("Ежов", "Иван");
        for(var item : base.entrySet())
        {
        System.out.printf("[%s : %s]\n", item.getKey(), item.getValue());
        }

        TreeMap<String, Integer> newbase = new TreeMap<String, Integer>();
        ArrayList<String> names = new ArrayList<String>();

            for(var item : base.values())
                {
                    names.add(item);
                }
                System.out.println(names); 


                for(String item : names)
                    {
                        if(newbase.containsKey(item))
                        {
                            newbase.put(item, newbase.get(item)+1);
                        }  
                        else
                        {
                            newbase.put(item,1);
                        }
                    } 


                ArrayList <Integer> sortList = new ArrayList<Integer>();

                for(var item : newbase.values())
                    {
                        if(!sortList.contains(item.intValue()))
                        sortList.add(item);
                    }
                System.out.println(sortList);
                Collections.sort(sortList, Collections.reverseOrder());
                System.out.println(sortList);


                for (int i = 0; i < sortList.size(); i++)
                    {
                        for(var item : newbase.entrySet())
                        {
                            if (item.getValue()==sortList.get(i))
                                {
                                 System.out.printf("[%s :%d]\n", item.getKey(), item.getValue());
                                }
                        }
                    }      
    }
}