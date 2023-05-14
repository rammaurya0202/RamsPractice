
import java .util.ArrayList;
public class ClassroomRevision {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        MainList.add(list1);
        MainList.add(list2);
        MainList.add(list3);


        System.out.println(MainList);

        for(int j=0;j<MainList.size()-1;j++){
            ArrayList<Integer> currList =MainList.get(j);
            System.out.println();


        }

    }
}