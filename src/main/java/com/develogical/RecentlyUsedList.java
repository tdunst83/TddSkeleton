package com.develogical;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
    List myList = new ArrayList();

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public void addThing(String s) {


        if(myList.contains(s)==false){

            myList.add(0, s);
        }


    }

    public String retrieveItem(int i) {
        return myList.get(i).toString();
    }

    public List<String> asList() {
        return myList;
    }


}
