package model; 

public class Duck extends Bird implements IMove, IFly{

    public Duck(double weight, double height, int age, double wingSpan) {
        super(weight, height, age, wingSpan);
    }

    @Override
    public String communication() {
        return "Quack!!!";
    }

    public String wingSpan() {
        return "wingSpan: " + super.wingSpan;
    }

    @Override
    public String jump(double km){
        return "jumping ... as a duck "; 
    }

    @Override
    public String run(double km){
        return "runnig... as a duck "; 
    } 

    @Override
    public String takeOff(){
        return "the duck is taking off";
    }

    @Override
    public String land(){
        return "the duck is land"; 
    }

    @Override
    public String fly(){
        return "the duck is Flying"; 
    }

    @Override
    public String toString() {
        return "This is a dock I mean, duck";
    }
}
