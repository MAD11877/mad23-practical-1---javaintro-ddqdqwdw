import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int mode = 0;
    int highest = 0;
    int e = in.nextInt();
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    for (int count = e; count > 0; count--)
    {
      boolean present = false;
      int entry = in.nextInt();
      for (int i = 0; i < list.size(); i++)
      {
        List<Integer> listemp = list.get(i);
        int uniq = listemp.get(0);
        if (entry == uniq)
        {
          int temp = listemp.get(1);
          temp += 1;
          listemp.set(1, temp);
          list.set(i, listemp);
        } 
      }
      if (present == false)
      {
        List<Integer> listemp = new ArrayList<Integer>();
        listemp.add(entry);
        listemp.add(1);
        list.add(listemp);
      }
    }
    for (int i = 0; i < list.size(); i++)
    {
      List<Integer> listemp = list.get(i);
      if (listemp.get(1) > highest)
      {
        mode = listemp.get(0);
      }
    }
    System.out.println(mode);
  }
}
