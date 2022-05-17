package pk4;
import java.util.Scanner;
public class hanghoa {
    public static void main(String[] args)
    {   
        linklist link = new linklist();
        stack sstack = new stack();
        queue qqueue = new queue();
        Scanner in = new Scanner(System.in);
        int run = 1;
        while(run == 1)
        {
            System.out.println("menu");
            System.out.println("1: doc du lieu tu file lu vao link list");
            System.out.println("2: nhap sam pham vao cuoi danh sach");
            System.out.println("3: hien thi thon gtin sam pham tron linked list");
            System.out.println("4: luu danh sach vao file");
            System.out.println("5: tim kiem thong tin theo id");
            System.out.println("6:xoa sam pham theo id");
            System.out.println("7:sap xep cac sam pham trong danh sach theo id ");
            System.out.println("8 bieu dien so luong sam pham");
            System.out.println("9 doc du lieu tu file luu vao stack. liet ke ra man hinh");
            System.out.println("10 doc du lieu tu file luu vao queue.hien thi ra man hinh");
            System.out.println("exit");
            int luachon = 0;
            System.out.print("nhap lua chon: ");
            luachon = in.nextInt();
            System.out.println("");
            switch (luachon)
            {
                case 1:
                link.read(link);
                break;
                case 2:
                System.out.print("nhap ma sam pham: ");
                String mmsp = in.next();
                System.out.println("");
                
                System.out.print("nhap ten sam pham: ");
                String tsp = in.next();
                System.out.println("");

                System.out.print("nhap so luong sam pham: ");
                int sl = in.nextInt();
                System.out.println("");

                System.out.print("nhap don gia sam pham: ");
                int dongia = in.nextInt();
                System.out.println("");
                link.insert(mmsp, tsp, dongia, sl);
                break;

                case 3:
                link.output("output.txt");
                System.out.println(link.toString());
                break;

                case 4:
                link.save("data.txt");
                break;

                case 5:
                System.out.print("nhap ma sam pham can tim: ");
                String msp = in.next();
                System.out.println("");
                link.serch(msp);
                break;

                case 6:
                System.out.print("nhap ma sam pham: ");
                String msp1 = in.next();
                System.out.println("");
                link.delete(msp1);
                break;

                case 7:
                System.out.println("day sau sap xep la");
                link.sapxep();
                System.out.println(link.toString());
                break;

                case 8:
                System.out.println("sam pham nhi phan");
                System.out.println(link.np());
                
                break;

                case 9:
                System.out.println("day stack la");
                sstack.read(sstack);
                sstack.output("output.txt");
                System.out.println(sstack.toString());
                
                break;

                case 10:
                System.out.println("day queue la");
                qqueue.read(qqueue);
                qqueue.output("output.txt");
                System.out.println(qqueue.toString());
                
                break;
                default:
                System.out.println("thank you");
                run = 0;
            }
            
        }
    }
}