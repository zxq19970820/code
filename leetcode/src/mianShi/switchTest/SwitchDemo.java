package mianShi.switchTest;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/13 20:41
 * 4
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Character character = new Character('s');

        switch (character) {
            default:{
                System.out.println("默认");
            }
            case 'a': {
                System.out.println("a");
                break;
            }
            case 'b':{
                System.out.println("b");
                break;
            }
            case 'd':{
                System.out.println("d");
            }

        }
    }
}
