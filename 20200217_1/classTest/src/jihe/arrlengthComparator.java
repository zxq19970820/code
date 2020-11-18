package jihe;

import java.util.Comparator;

public class arrlengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
       int x= o2.length()-o1.length();
       return  x==0?o1.compareTo(o2):x;
    }


//    public int compare(Object o1, Object o2) {
//
//        String str1=(String) o1;
//        String str2=(String) o2;
//
//        int x= str1.length()-str2.length();
//        return x;
//    }
}
