class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] x = num1.split("\\+");
        String[] y = num2.split("\\+");

        int a_real = Integer.valueOf(x[0]);
        int a_img = Integer.valueOf(x[1].replace("i",""));
        int b_real = Integer.valueOf(y[0]);
        int b_img = Integer.valueOf(y[1].replace("i",""));

        return (a_real * b_real - a_img * b_img) + "+" +
                (a_img * b_real + a_real * b_img) + "i";

    }
}