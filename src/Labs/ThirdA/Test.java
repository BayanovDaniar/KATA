package Labs.ThirdA;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\ThirdA\\Stih.txt");
        FileOutputStream fileOutputStream2 = new FileOutputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\ThirdA\\f2.txt");
        FileOutputStream fileOutputStream3 = new FileOutputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\ThirdA\\f3.txt");
        FileOutputStream fileOutputStream4 = new FileOutputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\ThirdA\\f4.txt");

        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream2);
        DataOutputStream dataOutputStream3 = new DataOutputStream(fileOutputStream3);
        DataOutputStream dataOutputStream4 = new DataOutputStream(fileOutputStream4);

        byte[] b = dataInputStream.readAllBytes();

        int counter = 0;

        for (byte c : b) {
            counter++;
            if ((c) == 13) {
                String a = String.valueOf(counter);
                dataOutputStream2.write(a.getBytes());
                dataOutputStream2.write('\n');
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
                dataOutputStream3.write(a.getBytes());
                dataOutputStream3.write('\n');
                counter = 0;
            }
        }

        FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\ThirdA\\f2.txt");
        FileInputStream fileInputStream2 = new FileInputStream("C:\\Users\\dania\\IdeaProjects\\KATA\\src\\Labs\\ThirdA\\f3.txt");
        DataInputStream dataInputStream1 = new DataInputStream(fileInputStream1);
        DataInputStream dataInputStream2 = new DataInputStream(fileInputStream2);

        int p;
        for(byte k : b){
            if((k) == 13){
                dataOutputStream4.write(' ');
                while((char)(p = dataInputStream1.read()) != '\n'){
                        dataOutputStream4.write(p);
                }
                p =0;
                dataOutputStream4.write(' ');
                while((char)(p = dataInputStream2.read()) != '\n'){
                    dataOutputStream4.write(p);
                }
            }
            fileOutputStream4.write(k);
        }


    }
}
