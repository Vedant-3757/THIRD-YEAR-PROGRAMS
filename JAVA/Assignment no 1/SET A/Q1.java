//Volume of sphere 4/3*π*r*r*r;
class Q1 {
    public static void main(String args[]) {
        double r = Double.parseDouble(args[0]);
        double volume = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println("Volume of sphere with radius " + r + " is: " + volume);
    }
}
