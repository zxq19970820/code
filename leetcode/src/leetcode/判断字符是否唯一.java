package leetcode;


//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。

//输入: s = "leetcode"
//        输出: false
//        示例 2：
//
//        输入: s = "abc"
//        输出: true
//        限制：
//
//        0 <= len(s) <= 100
//        如果你不使用额外的数据结构，会很加分。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/is-unique-lcci
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。



import java.util.Scanner;

public class 判断字符是否唯一 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        boolean temp = isunique(sc.next());
        System.out.println(temp);

    }

    private static boolean isunique(String str) {
        char[] charArray = str.toCharArray();
        boolean t = true;
        for (int i = 0; i < charArray.length; i++) {
            if (str.indexOf(charArray[i]) != str.lastIndexOf(charArray[i])) {
                t = false;
            }

        }
        return t;
    }

}
