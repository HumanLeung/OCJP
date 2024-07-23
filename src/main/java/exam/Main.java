package exam;

/**
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test1(){
        int x = 0, y = 6;
        for (; x < y ; x++, y--){
            if (x % 2 == 0){
                continue;
            }
            System.out.println(x+"-"+y);
        }
    }

    private static void test2(){
        int i = 10;
        do {
            for (int j = i / 2; j > 0; j--) {
                System.out.print(j + " ");
            }
            i -= 2;
        }while (i > 0);
    }

    private static void test3(){
        StringBuilder sb = new StringBuilder();
        sb.append("HOWDY");
        sb.insert(0,' ');
        sb.replace(3, 5, "LL");
        sb.insert(6, "COW");
        System.out.println(sb);
        sb.delete(2, 7);
        System.out.println(sb);
        System.out.println(sb.length());
    }

    private static void test4(){
        for (int i = 0; i < 10; i++){

        }
    }

}
