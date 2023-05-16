class demo {
        private int a =10;
        protected int b = 20;
        int c = 30;
        public int d =40;
        void display(){
            System.out.println("a is private it have the scope of remaining in the same class(whose value is): "+ a);
        }
}
public class acess_modifier_visibility_17 {
    public static void main(String[] args) {
        demo o = new demo();
        o.display();
        System.out.println("protected value(can be used in same package): "+o.b);
        System.out.println("default value(can be used in the same package): "+o.c);
        System.out.println("public value(can be used in the same as well as other packages): "+o.d);
    }
}