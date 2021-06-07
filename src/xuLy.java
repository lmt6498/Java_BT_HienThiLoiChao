import java.util.Scanner;

public class xuLy {
    public static void main(String[] args) {
        String name;
        Scanner nhap  = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        name = nhap.nextLine();

        System.out.println("Hello: " +name);
    }
}
