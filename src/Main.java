import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massiv = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt( 2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }
        System.out.println(arrayList+"озгорудон алдын -arrayList");
        System.out.println(linkedList+"озгорудон алдын -linkedList ");
        System.out.println(massiv+"озгорудон алдын");
        Arrays.sort(massiv);
        System.out.println(sort(massiv)+"massiv");
        Collections.sort(arrayList);
        System.out.println(sortBy(arrayList)+"arrayList");
        Collections.sort(linkedList);
        System.out.println(sortBy(linkedList)+"linkedList");
    }

    public static int[] sort(int[] arrays) {
        Arrays.sort(arrays);
        return arrays;
    }

    public static ArrayList<Integer> sortBy(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }
    public static LinkedList<Integer> sortBy(LinkedList<Integer> linkedlist) {
        Collections.sort(linkedlist);
        return linkedlist;
    }

}