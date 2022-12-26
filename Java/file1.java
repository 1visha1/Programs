import java.io.*;
class file1{
    public static void main(String[] args){
        File inf = new File("a1.txt");
        File outf = new File("a2.txt");
        FileReader ins = null;
        FileWriter outs = null;
        try{
            ins = new FileReader(inf);
            outs = new FileWriter(outf);
            int ch;
            while((ch=ins.read()) != -1){
                outs.write(ch);
            }
        }catch(Exception e){}finally{
            try{
                ins.close();
                outs.close();

            }catch(Exception e){}
        }

    }

}