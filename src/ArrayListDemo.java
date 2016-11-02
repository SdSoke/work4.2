import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 2016/11/1.
 */
public class ArrayListDemo {public static void main(String[] args) {
   List<String> strings=new ArrayList<>();

  strings.add("T");
  strings.add("s");
  strings.add("M");
  strings.add("i");
  strings.add("n");
  strings.add("g");

  System.out.println(strings);
  System.out.println();

  for (String a:strings){
   System.out.print(a);
  }
  System.out.println();

  for(Iterator<String>iterator=strings.iterator();
      iterator.hasNext();)
  {
   System.out.print(iterator.next());
  }
  System.out.println();

  Iterator<String> iter=strings.iterator();
  while(iter.hasNext())
  {
   System.out.print(iter.next());
  }
  System.out.println();

  for (int i = 0; i < strings.size(); i++)
  {
   System.out.print(strings.get(i));
  }




 }
}
