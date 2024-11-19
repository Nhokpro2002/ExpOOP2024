package hus.oop.lab9.polynomials;

import java.io.FileWriter;
import java.io.IOException;

public class TestApp {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output1.txt")) {
            Poly ap = new ArrayPoly(new double[]{1, 3, 4, 8});
            Poly lp = new ListPoly(new double[]{1, 3, 4, 8});

            writer.write("ap = " + ap + "\n");
            writer.write("lp = " + lp + "\n");

            if (ap.equals(lp) && lp.equals(ap)) {
                writer.write("ap == lp\n");
            } else {
                writer.write("ap != lp\n");
            }

            ap = ap.derivative();
            writer.write("ap' = " + ap.toString() + "\n");

            ap = ap.derivative();
            writer.write("ap'' = " + ap.toString() + "\n");

            lp = lp.derivative();
            writer.write("lp' = " + lp.toString() + "\n");

            lp = lp.derivative();
            writer.write("lp'' = " + lp.toString() + "\n");

            System.out.println("Kết quả đã được ghi vào file output1.txt.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi vào file: " + e.getMessage());
        }
    }
}
