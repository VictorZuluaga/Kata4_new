package Controler;

public class Kata4 {


    public static void main(String[] args) throws Exception{
        String fileName = "email.txt";
        View.MailListReader m = new View.MailListReader();
        View.MailHistogramBuilder b = new View.MailHistogramBuilder();
        View.HistogramDisplay d = new View.HistogramDisplay(b.build(m.read(fileName)));
        d.execute();
    }

}