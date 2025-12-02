public class JavaBasics {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor()); // p1.color is not accesable becoz it is private

    }   
    
}

class Pen {

    private String color;
    private int tip;

    // getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {// setters
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip; // this.tip property of object and tip is variable
    }

}
