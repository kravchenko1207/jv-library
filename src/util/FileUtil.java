package util;

import model.Book;
import java.io.*;
import java.util.List;

public class FileUtil {
    public static void saveToFile(List<Book> books, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Book b : books) {
                writer.write(b.toString());
                writer.newLine();
            }
        }
    }
}
