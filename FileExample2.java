import java.io.*;
public class FileExample2{
public static void main (String [] args) throws IOException{
int i;
FileInputStream fis=new FileInputStream("./myfile.txt");
do{
i=fis.read();
if (1!=-1){
System.out.print ((char) i);
}
}while (i!=-1);
fis.close();
}
}