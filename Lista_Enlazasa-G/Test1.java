
public class Test1 {

  public static void main(String[] args) {
    List<Integer> lint = new LinkedList<Integer>();
      lint.insertFirst(10);
      System.out.println(lint);
      lint.insertFirst(14);
      System.out.println(lint);
      lint.insertFirst(7);
      System.out.println(lint);
      lint.insertFirst(19);
      System.out.println(lint);
      lint.insertFirst(25);
      System.out.println(lint);
      lint.remove(9);
      System.out.println(lint);
  }
}
