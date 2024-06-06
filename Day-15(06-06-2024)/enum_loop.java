enum fruits{
    APPLE,ORANGE,GRAPES,BANANA;
}

public class enum_loop {
    public static void main(String[] args) {
        for(fruits myfruits:fruits.values()){
            System.err.println("my favorite fruits is"+" "+myfruits);
        }
    }
}
