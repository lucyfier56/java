package oops.staticfinal;

public class FinalSample {
    int x;

    // Final variables must be initialized at the time of declaration or In EVERY constructor
    final int y=10;
    final int z;
    static final int myVal=300;
    public FinalSample(){
        z=100;
    }
    public FinalSample(int temp){
        z=temp;
    }
}
