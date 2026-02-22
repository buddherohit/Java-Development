public class ArraysSum {
    public static void main(String[] args) {
        float[] marks = { 85.5f, 92.0f, 78.5f, 96.0f, 88.5f };
        float num = 85.5f;
        boolean isInarray = false;
        for (float element : marks) {
            if (num == element) {
                isInarray = true;
                break;
            }
        }
        if (isInarray) {
            System.out.println("The element present in array");
        } else {
            System.out.println("The element not present in array");

        }
    }

}
