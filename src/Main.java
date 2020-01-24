import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<String> list_string=new ArrayList<String>();
        list_string.add("red");//time complexity=O(1)
        list_string.add("Green");
        list_string.add("Orange");
        list_string.add(0,"PINK");//add at any index
        list_string.add(4,"Yellow");
        for(String element : list_string)
            System.out.println(element);
        // System.out.println(list_string.get(0));//time complexity=O(1)
        //System.out.println(list_string.get(4));
        list_string.set(3,"Blue");
        list_string.remove(2);//tme complexity=O(n)
        if(list_string.contains("Red"))//time complexity=O(nlogn)
            System.out.println("found");
        else
            System.out.println("NOt found");
Collections.sort(list_string);//time complexity=O(nlogn)
        List<String> list1=new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        List<String> list2=new ArrayList<String>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        Collections.copy(list1,list2);


        // System.out.print(list_string);
        /*for(String element : list1)
            System.out.println(element);
*/
        //Collections.shuffle(list_string);//O(n)
       /* for(String element : list_string)
            System.out.println(element);
*/
       Collections.reverse(list_string);//O(n)
        System.out.print(list_string);
        List<String> sublist=list_string.subList(0,4);//O(n)
        System.out.print(sublist);
        List<String> list3=new ArrayList<>();
        list3.add("red");
        list3.add("Pink");
        list3.add("Blue");
        ArrayList<String> c3=new ArrayList<>();
        for(String e: list_string)
            c3.add(list3.contains(e)?"Yes":"No");
        System.out.print(c3);
        Collections.swap(c3,0,2);//O(1)

        System.out.print(c3);
c3.addAll(list3);
        System.out.print(c3);


    }
}
