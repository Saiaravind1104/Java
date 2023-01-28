class example
{
    int rno;
    float fee;
    example(int r,float f)
    {
        rno=r;
        fee=f;
    }
    void show()
    {
        System.out.println(rno+""+fee);
    }
}
class dummy
{
    public static void main(String[]args)
    {
        example ex=new example(2,277.f);
        ex.show();

    }
}