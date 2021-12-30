package Controler;

import java.util.*;
import Model.*;
import View.*;

public class Kata4 {


    MailListReader mailListReader;
    List<Mail> lista;
    MailHistogramBuilder mailHistogramBuilder;
    Histogram <String> histogram;

    public static void main(String[] args) throws Exception{
        String fileName = "email.txt";
        MailListReader m = new MailListReader();
        MailHistogramBuilder b = new MailHistogramBuilder();
        HistogramDisplay d = new HistogramDisplay(b.build(m.read(fileName)));
        d.execute();
        Kata4 k1 = new Kata4();
        k1.execute();
    }
    public void execute()throws Exception{
        input();
        process();
        output();
    }
    protected void input()throws Exception{
        mailListReader = new MailListReader();
        lista = mailListReader.read("email.txt");
        mailHistogramBuilder = new MailHistogramBuilder();
    }
    protected void process(){
        histogram = mailHistogramBuilder.build(lista);
    }
    protected void output(){
        new HistogramDisplay(histogram).execute();
    }

}