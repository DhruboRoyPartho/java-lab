import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

class RandomAccessFileExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            RandomAccessFile file = new RandomAccessFile("FileRandom.txt", "rw");
            
            file.setLength(0);

            Random random = new Random();

            for(int i=0;i<4;i++){
                file.seek(file.length());
                int randomNum = random.nextInt(50)+100;
                file.writeInt(randomNum);
            }

            System.out.println("Random values: ");

            file.seek(0);
            int itr = (int)file.length()/4;
            while(itr != 0){
                --itr;
                System.out.println(file.readInt());
            }

            System.out.println("===========");

            System.out.print("Which number of data do you want to change: ");
            int idx = sc.nextInt();
            System.out.print("Enter a number: ");
            int c_num = sc.nextInt();
            --idx;
            file.seek(idx*4);
            file.writeInt(c_num);

            System.out.println("After change " + idx + " number value: ");

            file.seek(0);
            itr = (int)file.length()/4;
            while(itr != 0){
                --itr;
                System.out.println(file.readInt());
            }

            file.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void display(int itr){

    }
}