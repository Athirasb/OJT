  class rectangle{
    int length, breadth, area;
 rectangle() {
     System.out.println("Calculating yhe area of a rectangle");
    }

    void calarea(int length, int breadth){
        area=length*breadth;
        System.out.println("The area of the rectangle is " + area);

    }
}
 class constructor{
    public static void main(String[] args){
        rectangle rec = new rectangle();
        rec.calarea(10, 25);
}
}
