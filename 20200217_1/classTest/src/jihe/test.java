package jihe;

import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new arrlengthComparator());

        ts.add("shdk");
        ts.add("gsuiuhsi");
        ts.add("dg");
        ts.add("sdds");

        for (String str:ts){
            System.out.println(str);
        }
    }

}
