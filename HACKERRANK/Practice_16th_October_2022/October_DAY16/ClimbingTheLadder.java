package October_DAY16;

import java.util.*;

public class ClimbingTheLadder {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();

        list.add(100);
        list.add(100);
        list.add(50);
        list.add(40);
        list.add(40);
        list.add(20);
        list.add(10);
        List<Integer>list1=new ArrayList<>();
        list1.add(5);
        list1.add(25);
        list1.add(50);
        list1.add(120);
        System.out.println(ClimbingTheLadder.climbingLeaderboard(list,list1));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked,List<Integer> player) {

//        ranked = ranked.stream().distinct().collect(Collectors.toList());
        Set<Integer>set=new HashSet<>(ranked);

        int element;

        List<Integer>list=new ArrayList<>();
        for(Integer players:player){
            int rank=1;
            Iterator iterator=set.iterator();
            while(iterator.hasNext()){
                if(players<(int)iterator.next()){
                    rank++;
                }

            }
            list.add(rank);
        }



       return list;

    }


}