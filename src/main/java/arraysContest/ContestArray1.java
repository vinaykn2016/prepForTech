package arraysContest;
import java.util.*;
import java.util.function.Predicate;

public class ContestArray1 {

  public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
  list.add(1);
  list.add(20);
  list.add(1,30);
  list.add(40);
  list.remove(1);
  list.set(1,4);
  list.add(50);
    System.out.println(list);

  ArrayList<String> list1 = new ArrayList<>();
  list1.add("rose");
  list1.add("jasmine");
  list1.add("lily");
  list1.add("sunflowe");
  list1.remove(list1.indexOf("lily"));
  list1.removeIf(Predicate.<String>isEqual("rose"));
  list1.set(3, "sun");
    System.out.println(list1);

  }
    }




