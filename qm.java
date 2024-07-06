import java.util.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class ProjectQuizMaker{
    String openQuestion(String q) throws IOException{
        FileInputStream fis = new FileInputStream(q);
        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch=fis.read()) != -1) {
            sb.append((char)ch);
        }
        fis.close();
        String content = sb.toString();
        return content;
    }
    public static void main(String args[]) throws IOException{
        ProjectQuizMaker pq=new ProjectQuizMaker();
        List<String> al=new ArrayList<String>();
        al.add("AbstractWindowToolkit");
        al.add("java.awt.event");
        al.add("html file");
        al.add("Frame");
        al.add("Panel");
        al.add("3");
        al.add("List");
        al.add("Frame");
        al.add("setText()");
        al.add("Label");
        Frame f1=new Frame("WELCOME");
        Frame f2=new Frame("YOU ARE ON TEST");
        Frame f3=new Frame("TEST PROGRESS");
        Frame f4=new Frame();
        Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,d1,d2,d3,d4,d5,score,tq;
        Button b1,b2,b3;
        TextField tf1,tf2,tf3,tf4,tf5;
        b1=new Button("START");
        b1.setBounds(600,300,80,30);
        b1.setBackground(Color.green);
        b2=new Button("SUBMIT");
        b2.setBounds(450,450,80,30);
        b2.setBackground(Color.green);
        b3=new Button("LOGOUT");
        b3.setBounds(450,550,80,30);
        b3.setBackground(Color.green);
        l1=new Label();
        l1.setBounds(10,30,900,40);
        tf1=new TextField();
        tf1.setBounds(10,80,200,30);
        l2=new Label();
        l2.setBounds(10,120,900,40);
        tf2=new TextField();
        tf2.setBounds(10,170,200,30);
        l3=new Label();
        l3.setBounds(10,210,900,40);
        tf3=new TextField();
        tf3.setBounds(10,250,200,30);
        l4=new Label();
        l4.setBounds(10,280,900,40);
        tf4=new TextField();
        tf4.setBounds(10,320,200,30);
        l5=new Label();
        l5.setBounds(10,350,900,40);
        tf5=new TextField();
        tf5.setBounds(10,390,200,30);
        l6=new Label();
        l6.setBounds(10,80,400,20);
        l7=new Label();
        l7.setBounds(10,170,400,20);
        l8=new Label();
        l8.setBounds(10,250,400,20);
        l9=new Label();
        l9.setBounds(10,320,400,20);
        l10=new Label();
        l10.setBounds(10,390,400,20);
        d1=new Label();
        d1.setBounds(450,80,100,20);
        d2=new Label();
        d2.setBounds(450,170,100,20);
        d3=new Label();
        d3.setBounds(450,250,100,20);
        d4=new Label();
        d4.setBounds(450,320,100,20);
        d5=new Label();
        d5.setBounds(450,390,100,20);
        score=new Label();
        score.setBounds(400,450,400,30);
        tq=new Label("THANKYOU FOR TAKING THE TEST!!   HAVE A NICE DAY");
        tq.setForeground(Color.green);
        tq.setBounds(600,300,400,40);
        f1.add(b1);f2.add(l1);f2.add(tf1);f2.add(l2);f2.add(tf2);f2.add(l3);f2.add(tf3);f2.add(l4);f2.add(tf4);f2.add(l5);f2.add(tf5);f2.add(b2);
        Random r=new Random();
        int questionnaire[]=new int[5];
        List<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            int n=r.nextInt(9);
            if(!(a.contains(n))){
                    questionnaire[i]=n+1;//for comparing with file names as it starts with 1
                    a.add(n);//for comparing with answers list from zeroth index 
            }
            else{
                     i-=1;
            }
        }
        String q1,q2,q3,q4,q5;
     
        q1=pq.openQuestion(Integer.toString(questionnaire[0])+".txt");
        q2=pq.openQuestion(Integer.toString(questionnaire[1])+".txt");
        q3=pq.openQuestion(Integer.toString(questionnaire[2])+".txt");
        q4=pq.openQuestion(Integer.toString(questionnaire[3])+".txt");
        q5=pq.openQuestion(Integer.toString(questionnaire[4])+".txt");
        l1.setText("1. "+q1);
        l2.setText("2. "+q2);
        l3.setText("3. "+q3);
        l4.setText("4. "+q4);
        l5.setText("5. "+q5);
        b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               f1.setVisible(false);
               f2.setVisible(true);
           } 
        });
        b2.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               f2.setVisible(false);
               f3.add(l1);f3.add(l2);f3.add(l3);f3.add(l4);f3.add(l5); f3.add(l6);f3.add(l7);f3.add(l8);f3.add(l9);f3.add(l10);
               f3.add(d1);f3.add(d2);f3.add(d3);f3.add(d4);f3.add(d5);f3.add(b3);f3.add(score);
               String a1=tf1.getText(),a2=tf2.getText(),a3=tf3.getText(),a4=tf4.getText(),a5=tf5.getText();
               l6.setText("Your answer is :  "+a1);
               l7.setText("Your answer is :  "+a2);
               l8.setText("Your answer is :  "+a3);
               l9.setText("Your answer is :  "+a4);
               l10.setText("Your answer is :  "+a5);
               f3.setVisible(true);
               int totalscore=0;
               if(al.get(a.get(0)).equals(a1)){
	       d1.setText("Scored 10");
                       d1.setBackground(Color.green);
                       totalscore+=10;
               }
               else {
                       d1.setText("Scored 0");
                       d1.setBackground(Color.red);
               }
               if(al.get(a.get(1)).equals(a2)){
	       d2.setText("Scored 10");
                       d2.setBackground(Color.green);
                       totalscore+=10;
               }
               else {
                       d2.setText("Scored 0");
                       d2.setBackground(Color.red);
               }
               if(al.get(a.get(2)).equals(a3)){
	       d3.setText("Scored 10");
                       d3.setBackground(Color.green);
                       totalscore+=10;
               }
               else {
                       d3.setText("Scored 0");
                       d3.setBackground(Color.red);
               }
               if(al.get(a.get(3)).equals(a4)){
	       d4.setText("Scored 10");
                       d4.setBackground(Color.green);
                       totalscore+=10;
               }
               else {
                       d4.setText("Scored 0");
                       d4.setBackground(Color.red);
               }
               if(al.get(a.get(4)).equals(a5)){
	       d5.setText("Scored 10");
                       d5.setBackground(Color.green);
                       totalscore+=10;
               }
               else {
                       d5.setText("Scored 0");
                       d5.setBackground(Color.red);
               }
               score.setForeground(Color.green);
               score.setText("YOU HAVE TOTALLY SCORED "+(totalscore*100/50)+" PERCENTAGE!!");
           } 
        });
        b3.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               f3.setVisible(false);
               f4.setVisible(true);
               f4.add(tq);
           } 
         });
        f1.setLayout(null);
        f1.setSize(500,500);
        f1.setVisible(true);
        f2.setLayout(null);
        f2.setSize(500,500);
        f3.setLayout(null);
        f3.setSize(500,500);
        f4.setLayout(null);
        f4.setSize(500,500);
    }
}