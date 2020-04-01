package Hyperskill.projects.encryption_decryption_completed.consoleparsing;

import Hyperskill.projects.encryption_decryption_completed.algorithms.ShiftAlgorithm;
import Hyperskill.projects.encryption_decryption_completed.algorithms.UnicodeAlgorithm;
import Hyperskill.projects.encryption_decryption_completed.read_write_files.ReadWriteFile;

public class ConsoleParsing {

    public void parse(String[] args) {

        String mode ="enc";
        int key = 0; // ключ для шифровки / дешифровки
        StringBuilder data = new StringBuilder(); // строка которую де/шифруем
        int  _dataMode = 1; // если есть арг-ты -data и -in, то предпочтение -data; 0 -чтение аогумента, 1 - файла
        int out = 0; // если нет аргумента -out: 0 - вывод в консоль ; 1 - в файл
        StringBuilder inFilePath = new StringBuilder("./");
        StringBuilder outFilePath = new StringBuilder("./");
        String alg  = "shift"; // выбор алгоритма шифровки / дешифровки

        //  int count = 0; // если 0, то не верный ввод команды. вывод сообщения об ошибке
        if (args.length == 0) {
            System.out.println("Error no input data");
        } else {
            //поиск ключа
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-key")) {
                    key = Integer.parseInt(args[i + 1]);
                }
                if (args[i].equals("-mode")) {
                    mode = args[i + 1];
                }
                if (args[i].equals("-data")) {
                    data.append(args[i + 1]);
                    _dataMode = 0; //есть аргумент -data, значит игнорируем чтение из файла
                }
                if (args[i].equals("-in")) {
                    inFilePath.append(args[i + 1]);
                }
                if (args[i].equals("-out")) {
                    outFilePath.append(args[i + 1]);
                    out = 1; //вывод в файл
                }
                if (args[i].equals("-alg")) {
                    alg = args[i + 1];
                }
            }

            if (_dataMode == 1) {
                data = new StringBuilder(ReadWriteFile.readFile(inFilePath.toString()));
            }

            switch (alg) {
                case "shift":
                    switch (mode) {
                        case "enc":
                            data = new StringBuilder(new ShiftAlgorithm().encryption(data.toString(), key));
                            break;
                        case "dec":
                            data = new StringBuilder(new ShiftAlgorithm().decryption(data.toString(), key));
                            break;
                    }
                    break;
                case "unicode":
                    switch (mode) {
                        case "enc":
                            data = new StringBuilder(new UnicodeAlgorithm().encryption(data.toString(), key));
                            break;
                        case "dec":
                            data = new StringBuilder(new UnicodeAlgorithm().decryption(data.toString(), key));
                            break;
                    }
                    break;
            }

            //вывод результата программы в консоль или в файл
            switch (out) {
                case 0:
                    System.out.println(data);
                    break;
                case 1:
                    ReadWriteFile.writeFile(outFilePath.toString(), data.toString());
                    break;
            }
        }
    }
}
