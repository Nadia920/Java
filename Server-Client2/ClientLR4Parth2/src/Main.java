import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Main {//описание класса клиента
    public void runClient() throws IOException {//метод клиента runClient
        DatagramSocket s = null;//создание дейтаграммы
        Scanner in = new Scanner(System.in);
        try {
            byte[] buf = new byte[512]; //буфер для приема/передачи дейтаграммы
            s = new DatagramSocket();//привязка сокета к реальному объету
           System.out.println("UDPClient: Started");
            //byte[] verCmd = { 'V', 'E', 'R', 'S' };
            //DatagramPacket sendPacket = new DatagramPacket(verCmd, verCmd.length, InetAddress.getByName("127.0.0.1"), 8001);//создание
//дейтаграммы для отсылки данных
           //s.send(sendPacket);//посылка дейтаграммы
            //DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);//создание дейтаграммы для получения данных
           // s.receive(recvPacket);//получение дейтаграммы
            //String version = new String(recvPacket.getData()).trim();//извлечение
//данных (версии сервера)
            /*System.out.println("UDPClient: Server Version: " + version);
            byte[] quitCmd = { 'Q', 'U', 'I', 'T' };
            sendPacket.setData(quitCmd);//установить массив посылаемых данных
            sendPacket.setLength(quitCmd.length);//установить длину посылаемых
// данных
            s.send(sendPacket); //послать данные серверу
            System.out.println("UDPClient: Ended");*/
            //текст

            int x=0, y=0, z=0;
            System.out.println("Введите значение переменных для высчитывания значения функции");
            System.out.println("x = ");
            int flag=0;
            while(flag == 0) {
                if (in.hasNextInt()) {
                    x = in.nextInt();
                    flag++;
                } else {
                    in.nextLine();
                    System.out.println("Необходимо ввести число ");
                }
            }
            System.out.println("y = ");
            int flag1=0;
            while(flag1 == 0) {
                if (in.hasNextInt()) {
                    y = in.nextInt();
                    flag1++;
                } else {
                    in.nextLine();
                    System.out.println("Необходимо ввести число ");
                }
            }
            System.out.println("z = ");
            int flag2=0;
            while(flag2 == 0) {
                if (in.hasNextInt()) {
                    z = in.nextInt();
                    flag2++;
                } else {
                    in.nextLine();
                    System.out.println("Необходимо ввести число ");
                }
            }
            System.out.println(x);
            String xa = Integer.toString(x);
            System.out.println(xa);
            byte[] xb = xa.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(xb, xb.length, InetAddress.getByName("127.0.0.1"), 8001);//создание
//дейтаграммы для отсылки данных
            //sendPacket.setData(xb);//установить массив посылаемых данных
            //sendPacket.setLength(xb.length);//установить длину посылаемых
// данных
            s.send(sendPacket);

            String ya = Integer.toString(y);
             xb = ya.getBytes();
            sendPacket.setData(xb);//установить массив посылаемых данных
            sendPacket.setLength(xb.length);//установить длину посылаемых
// данных
            s.send(sendPacket);

            String za = Integer.toString(z);
             xb = za.getBytes();
            sendPacket.setData(xb);//установить массив посылаемых данных
            sendPacket.setLength(xb.length);//установить длину посылаемых
// данных
            s.send(sendPacket);
            DatagramPacket recvPacket1 = new DatagramPacket(buf, buf.length);//создание дейтаграммы для получения данных
            s.receive(recvPacket1);
            String Y = new String(recvPacket1.getData()).trim();//извлечение
            double Function = Double.parseDouble (Y.trim ());
            System.out.println("Значение функции равно " + Function);
        }
        finally {
            if (s != null) {
                s.close();//закрытие сокета клиента
            }  }  }
    public static void main(String[] args) {//метод main
        try {
            Scanner in = new Scanner(System.in);
            Main client = new Main();//создание объекта client
            client.runClient();//вызов метода объекта client
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}

