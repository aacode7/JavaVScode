class Shape{
    void draw(){
            System.out.println("CAn't say the shape");
    }
}

class Square extends Shape{
    @Override
    void draw()
    {
        System.out.println("Square Shape");
    }
}

class demover{
    public static void main(String args[])
    {
        Shape r = new Square();
        r.draw();
    }
}