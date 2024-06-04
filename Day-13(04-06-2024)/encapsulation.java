class employee{
    private String name;
    private int age;

    public void setName(String newName){
        name = newName;
    }
    public  String getName(){
        return name;
    }
    public void setAge(int newAge){
         age=newAge;
    }

         public void ageint(){
            age++;
         }
         public void agedec(){
            age--;
         }
    
    public  int getAge(){
        return age;     
    }
}



public class encapsulation{
    public static void main(String[] args){
        employee empobj = new employee();
        empobj.setName("Soorya");
        empobj.setAge(20);
        System.out.println(empobj.getName());
        System.out.println(empobj.getAge());
        empobj.agedec();
        System.out.println(empobj.getAge());
        empobj.ageint();



}
}