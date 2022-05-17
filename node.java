package pk4;

public class node
{
    private node nextnode;
    private String msp;
    private String tensp;
    private int dongia;
    private int sl;
    public node (String msp, String tensp, int dongia,int sl)// khoi tao du lieu
    {
        this.msp = msp; // ma sam pham
        this.tensp = tensp;// ten sp
        this.dongia = dongia;// don gia
        this.sl = sl;// so luong
    }
    public node getnextnode ()
    {
        return this.nextnode;
    }
    public String getmsp()
    {
        return this.msp;
    }
    public String gettensp()
    {
        return this.tensp;
    }
    public int getsl()
    {
        return this.sl;
    }
    public int getdongia()
    {
        return this.dongia;
    }

    public void setdata(String msp, String tensp, int dongia,int sl)
    {
        this.msp = msp;
        this.tensp = tensp;
        this.dongia = dongia;
        this.sl = sl;
    }

    public void setnextnode(node nextnode)
    {
        this.nextnode = nextnode;
    }
    @Override
    public String toString()
    {
        return "ma sam pham: "+this.msp + "\nten sam pham: "+this.tensp +"\ngia sam pham:"+this.dongia+"\nso luong: "+this.sl+"\n";
    }
}