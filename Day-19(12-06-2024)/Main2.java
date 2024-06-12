class EncapsulatedClass{
    private String date;

    public String getData(){
        return date;
    }
    public void setData(String data){
        this.date=data;
    }
}
public class Main2 {
    public static void main(String[] args) {
        EncapsulatedClass obj=new EncapsulatedClass();
        obj.setData("Hello");
        System.out.println(obj.getData());
    }
}
