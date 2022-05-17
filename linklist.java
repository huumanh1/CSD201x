package pk4;
import java.io.*;
public class linklist 
{
    private node head;

    public void insert(String msp, String tensp, int dongia,int sl) // then du liau vao cuoi
    {
        int x = 0;
        node newnode = new node(msp,tensp,dongia,sl);
        node curent = this.head;
        node curent2 = this.head; 
        while(curent2 !=null ) // dieu kien thoat
        {
        x = x+1;
        curent = curent2;
        curent2 = curent2.getnextnode();
        }
        if (x ==0 && this.head == null)// tao du lieu dau tien
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
    
    public void read(linklist link) // doc du lieu tu file
    {
        try{
            RandomAccessFile input = new RandomAccessFile("data.txt" , "rw");
            input.seek(0);
            
            while (input.readLine() != null)
            {
            String msp = input.readLine();
            String tensp = input.readLine();
            String slsp = input.readLine();
            String gia = input.readLine();
            int sl = cdint(slsp);
            int giasp = cdint(gia);
            link.insert(msp, tensp, giasp, sl);// ghi vao ink
            }
            input.seek(0);
            System.out.println("doc thanh cong");
            input.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
    public void save(String s) // luu vao data
    {
        File file = new File(s);
        try{
            FileOutputStream input = new FileOutputStream(file);
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
    public void output(String s) // luu vao output
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
    public int cdint(String data)// chuyen doi tu string sang int
    {
        int num = 0;
        for(int i = 0 ; i < data.length();i++)
        {

        num = (data.charAt(i)*1-48) + num*10; // chuen tu char snag int
        }
        return num;
    }
   public void serch(String serch1) // tim kiem
   {
       int stt = 0;
       node curent1 = this.head;
       while(curent1 != null && stt == 0)
       {
           if(curent1.getmsp().equals(serch1) )
           {
               stt = 1;
               System.out.println("ma sam pham: "+curent1.getmsp());
               System.out.println("ten sam pham: "+curent1.gettensp());
               System.out.println("gia sam pham: "+curent1.getdongia());
               System.out.println("so luong sam pham: "+curent1.getsl());
           }
           curent1 = curent1.getnextnode();
       }
       if (stt == 0)
       {
        System.out.println("khong co gia tri phu hop");
       }
   }
   public void delete(String msp) // xoa
   {
    int stt = 0;
    int vt = 0;
    node curent1 = this.head;
    node curent2 = this.head;
    node curent3 = this.head;
    while(curent1 != null && stt == 0)
    {
        
        vt = vt+1;
        curent3 = curent2;
        curent2 = curent1;
        if(curent1.getmsp().equals(msp) )
        {
            stt = 1;
        } 
        curent1 = curent1.getnextnode();
    }
    if (stt == 0)
    {
     System.out.println("khong co gia tri phu hop");
    } 
    else
    {
        if(vt == 1)
            {
                this.head = curent1;
            }
            else if(curent2.getnextnode() == null)
            {
                System.out.println("sad");
                curent3.setnextnode(null);
            }
            else
            {
                curent3.setnextnode(curent1);
            }
    }
}
    public void sapxep()// sap xep
    {

        int x = 1;
        while(x != 0)
        {
            x = 0;
            node curent1 = this.head;
            node curent2 = this.head;

            while (curent2 != null)
            {

                if(cdint(curent1.getmsp()) > cdint(curent2.getmsp()))
                {
                    x = x+1;
                    String msp = curent1.getmsp();
                    String tensp = curent1.gettensp();
                    int sl  = curent1.getsl();
                    int dongia = curent1.getdongia();
                    curent1.setdata(curent2.getmsp(), curent2.gettensp(), curent2.getdongia(), curent2.getsl());
                    curent2.setdata(msp, tensp, dongia, sl);
                }
                
                curent1 = curent2;
                curent2 = curent2.getnextnode();

            }
        }
    }

   public int cdnhiphan(int x) // chuyen doi nhi phan
   {
        int np = 0;
        int np1 = 0 ;
       if(x == 1)
       {
            return 1;
       }
       else
       {
            np = x%2;
            np1 = x / 2; 
           return np+cdnhiphan(np1)*10; 
       }
   }
   public int np()// nap du lieu chuyen doi nhi phan 
   {
       node curent = this.head;
       int x = cdnhiphan(curent.getsl());
       return x;
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
