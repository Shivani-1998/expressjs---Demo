# java program on tree set in collection of framemwork.
import java.util.*;

  public class TreeSet {
  public static void main(String[] args) {
     TreeSet<String> treeset = new TreeSet<String>();
          treeset.add("Red");
          treeset.add("Green");
          treeset.add("Black");
          treeset.add("Pink");
          treeset.add("orange");
     System.out.println("Original tree set: " + treeset);
    System.out.println("Size of the tree set: " + treeset.size());
   }
}
