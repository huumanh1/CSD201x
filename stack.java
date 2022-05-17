package pk4;
import java.io.*;
public class stack extends linklist {
    public node head;

    public void pop(String msp, String tensp, int dongia,int sl) // set up data
    {
        node newnode = new node(msp,tensp,dongia,sl); 
        newnode.setnextnode(this.head);
        this.head = newnode; 
        
    }
    public void read(stack link) // doc file
    {
        try{
            RandomAccessFile input = new RandomAccessFile("data.txt" , "rw");
            input.seek(0);
            
            while (input.readLine() != null)
            {
            String msp = input.readLine(); // lay du lieu
            String tensp = input.readLine();
            String slsp = input.readLine();
            String gia = input.readLine();
            int sl = cdint(slsp);//chuyen doi du lieu
            int giasp = cdint(gia);
            link.pop(msp, tensp, sl, giasp);
            }
            input.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
    public void output(String s) // in vao file out put
    {
        File file = new File(s);
        try{
            FileOutputStream input = new FileOutputStream(file,true);
            node curent = this.head;
            while(curent != null)
            {
                String text = ""; 
                text = "\n";
                byte buff [] = text.getBytes();
                input.write(buff,0,buff.length);// chuyrn strig sang char

                text = curent.getmsp();
                byte buff1 [] = text.getBytes();
                input.write(buff1,0,buff1.length);

                text = "\n";
                byte buff2 [] = text.getBytes();
                input.write(buff2,0,buff2.length);

                text = curent.gettensp();
                byte buff3 [] = text.getBytes();
                input.write(buff3,0,buff3.length);

                text = "\n";
                byte buff4 [] = text.getBytes();
                input.write(buff4,0,buff4.length);

                text = String.valueOf(curent.getsl());
                byte buff5 [] = text.getBytes();
                input.write(buff5,0,buff5.length);

                text = "\n";
                byte buff6 [] = text.getBytes();
                input.write(buff6,0,buff6.length);

                text = String.valueOf(curent.getdongia());
                byte buff7 [] = text.getBytes();
                input.write(buff7,0,buff7.length);
                curent = curent.getnextnode();

                text = "\n";
                byte buff8 [] = text.getBytes();
                input.write(buff8,0,buff8.length);

            }
            input.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
    public void push() // lay thong tin
    {
        node curent = this.head;
        System.out.println("ma sam pham:" + curent.getmsp());
        System.out.println("ten sam pham:" + curent.gettensp());
        System.out.println("gia pham:" + curent.getdongia());
        System.out.println("sl sam pham:" + curent.getsl());
        this.head = curent.getnextnode();
    }
    public void thongtin() // in ra man hinh
    {
        while(this.head != null)
        {
            push();
            System.out.println("");
        }
    }
    public void peek()//doc thogn tin
    {
        node curent = this.head;
        System.out.println("ma sam pham:" + curent.getmsp());
        System.out.println("ten sam pham:" + curent.gettensp());
        System.out.println("gia pham:" + curent.getdongia());
        System.out.println("sl sam pham:" + curent.getsl());
    }
    @Override
    public String toString()
    {
        String reslt ="";
        node current = this.head;
        while(current != null)
        {
            reslt =reslt + current.toString()+"\n";
            current = current.getnextnode();
        }
        return reslt;
    }
}
