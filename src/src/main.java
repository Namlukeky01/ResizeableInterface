package src;

public class main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();


        for (Shape sp : shape) {
            try {
                System.out.println(sp.getArea());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("before use method resize()");

        //before use method resize()
        for (Shape sp1 : shape) {
            try {
                System.out.println(sp1.resize(0.01) * sp1.getArea());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
