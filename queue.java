package pk4;
import java.io.*;

public class queue extends linklist
{
    public node tall;
    public node head = this.tall;
    public int mang;
    int index1 = 0;
    int index2 = 0;

    public void enqueue(String msp, String tensp, int dongia,int sl)
    {
        int x = 0;
        node newnode = new node(msp,tensp,dongia,sl);
        node curent = this.head;
        node curent2 = this.head; 
        while(curent2 !=null )
        {
        x = x+1;
        curent = curent2;
        curent2 = curent2.getnextnode();
        }
        if (x ==0)
        {
            newnode.setnextnode(this.head);
            this.head = newnode;
        }
        else
        {
        curent.setnextnode(newnode);
        newnode = null;
        }
    }
    public void read(queue link)
    {
        try{
            RandomAccessFile input = new RandomAccessFile("data.txt" , "rw");
            input.seek(0);
            
            while (input.readLine() != null)
            {
            index2 = index2 +1;
            String msp = input.readLine();
            String tensp = input.readLine();
            String slsp = input.readLine();
            String gia = input.readLine();
            int sl = cdint(slsp);
            int giasp = cdint(gia);
            link.enqueue(msp, tensp, giasp, sl);
            }
            input.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
    public void peek()
    {
        node curent = this.head;
        if(index2 == mang - 1)
        {
            index2 = 0;
        }
        index2 = index2 + 1;
        System.out.println("ma sam pham:" + curent.getmsp());
        System.out.println("ten sam pham:" + curent.gettensp());
        System.out.println("gia pham:" + curent.getdongia());
        System.out.println("sl sam pham:" + curent.getsl());
        this.head = curent.getnextnode();
    }
    public void output(String s)
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
                input.write(buff,0,buff.length);

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
