public class Cube {
    private int side;
    public Cube(){
        side = 1;
    }
    public Cube(int side){
        this.side = side;
        if(side<1) throw new IllegalArgumentException("A cube's side length must be equal to or greater than 1!");
    }
    public double getSide(){
        return side;
    }
    public void setSide(int side){
        this.side=side;
        if(side<1) throw new IllegalArgumentException("A cube's side length must be equal to or greater than 1!");
    }
    public int calculateSurfaceArea(){
        return 6*side*side;
    }
    public int calculateVolume(){
        return side*side*side;
    }
    public String toString(){
        return "Cube{side=" + side + "}";
    }
}
