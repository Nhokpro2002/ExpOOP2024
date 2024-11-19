package hus.oop.lab9.polynomials;

import java.io.FileWriter;
import java.io.IOException;

public class TestAppAnother {

    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Kết quả đã được ghi vào file " + fileName);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi vào file " + fileName + ":");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        Poly ap = new ArrayPoly(new double[]{1, 3, 4, 8});
        Poly lp = new ListPoly(new double[]{1, 3, 4, 8});

        result.append("ap = ").append(ap).append("\n");
        result.append("lp = ").append(lp).append("\n");

        if (ap.equals(lp) && lp.equals(ap)) {
            result.append("ap == lp\n");
        } else {
            result.append("ap != lp\n");
        }

        ap = ap.derivative();
        result.append("ap' = ").append(ap).append("\n");

        ap = ap.derivative();
        result.append("ap'' = ").append(ap).append("\n");

        lp = lp.derivative();
        result.append("lp' = ").append(lp).append("\n");

        lp = lp.derivative();
        result.append("lp'' = ").append(lp).append("\n");

        String fileName = args.length > 0 ? args[0] : "output1.txt";
        writeToFile(fileName, result.toString());
    }
}
