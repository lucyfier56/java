package oops.staticfinal;

public class test {
    public static void main(String[] args) {
        staticSample obj = new staticSample();
        obj.x = 10;
        System.out.println(++obj.x);
        staticSample obj1 = new staticSample();
        obj1.x = 11;
        System.out.println(++obj1.x);

        // class level resource. no need to create an object
        staticSample.y=100;
        staticSample.y++;
        System.out.println(staticSample.y);

        staticSample.show();


        FinalSample obj3 = new FinalSample();
//        FinalSample.y=100; // not allowed, final keyword is like constant
        FinalSample obj4 = new FinalSample(200);
        System.out.println(obj4.z);

        System.out.println(FinalSample.myVal);
    }
}
