public class shapeArea {
    public static int shapeAnArea(int n) {
        int result = (n^2 + 2*n - 3) / 2;
        return result;
}
    public static void main(String[] args) {
        System.out.println(shapeAnArea(24));
}
}
