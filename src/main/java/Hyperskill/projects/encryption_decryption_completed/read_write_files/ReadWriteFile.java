package Hyperskill.projects.encryption_decryption_completed.read_write_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadWriteFile {

    private static String absoluteFilePath = "C:\\Users\\Ilia_Solovev\\IdeaProjects\\Encryption-Decryption5\\Encryption-Decryption\\task\\src\\";

    //функция считывания данных из файла
    public static String readFile (String filePath){

        String absoluteFilePathForRead = absoluteFilePath.concat(filePath);
        String result = "";
        try {
            result =  Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    //функция записи в файл
    public static void writeFile (String filePath, String data){

        String absoluteFilePathForWrite= absoluteFilePath.concat(filePath);

        File file = new File(filePath);
        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(data);
        } catch (IOException e){
            System.out.println("Error while writing file");
        }
    }
}
