import java.io.*;
public class FileExample
{
public static void main(String[] args) throws IOException{
int i;
FileOutputStream fout=new FileOutputStream("./myfile.txt", true);
String s="aaTATA";
char ch[]=s.toCharArray();
for (i=0;i<s.length(); i++){
fout.write (ch[i]);
}
fout.close();
}
}