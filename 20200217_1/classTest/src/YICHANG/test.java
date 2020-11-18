package YICHANG;

public class test {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.length());

        try {
            int i = 10;
            int j = 0;
            System.out.println("123456");
            System.out.println(10 / 0);
            System.out.println(10.0 / 0);

        } catch (NullPointerException e) {
            System.out.println("除数不能为零");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("其他异常");
            e.printStackTrace();
            System.exit(0);
            return;
        }finally {
            System.out.println("德玛西亚");
        }

        System.out.println("程序结束");
    }
}
