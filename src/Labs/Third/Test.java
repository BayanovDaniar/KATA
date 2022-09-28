package Labs.Third;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Third\\Stih.txt");

        byte[] b = fileInputStream.readAllBytes();
        FileOutputStream fileOutputStream2 = new FileOutputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Third\\f2.txt");
        FileOutputStream fileOutputStream3 = new FileOutputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Third\\f3.txt");
        FileOutputStream fileOutputStream4 = new FileOutputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Third\\f4.txt");

        int counter = 0;

        for (byte c : b) {
            counter++;
            if ((c) == 13) {
                String a = String.valueOf(counter);
                fileOutputStream2.write(a.getBytes());
                fileOutputStream2.write('\n');
                counter = 0;
            }
        }

        counter = 0;
        for (byte c : b) {
            if (((char) c) == ' ') {
                counter++;
            } else if (((char) c) == '\n') {
                counter++;
                String a = String.valueOf(counter);
                fileOutputStream3.write(a.getBytes());
                fileOutputStream3.write('\n');
                counter = 0;
            }
        }

        FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Third\\f2.txt");
        FileInputStream fileInputStream2 = new FileInputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\Third\\f3.txt");

//        byte[] c = fileInputStream1.readAllBytes();
//        byte[] d = fileInputStream2.readAllBytes();
        int p;


        for(byte k : b){
            if((k) == 13){
                fileOutputStream4.write(' ');
                while((char)(p = fileInputStream1.read()) != '\n'){
                        fileOutputStream4.write(p);
                }
                p =0;
                fileOutputStream4.write(' ');
                while((char)(p = fileInputStream2.read()) != '\n'){
                    fileOutputStream4.write(p);
                }
            }
            fileOutputStream4.write(k);
        }


    }
}
