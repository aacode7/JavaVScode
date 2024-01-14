interface A{
    void show();
}

interface B{
    void show();
}
class Multiple implements A,B{
    public void show(){
        System.out.println("Interfaces of both A and B");
    }
    public static void main(String args[]){
        Multiple m = new Multiple();
        m.show();
    }
}