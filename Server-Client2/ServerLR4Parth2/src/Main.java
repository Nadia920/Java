import java.net.*;
import java.io.*;
public class Main {
    public final static int DEFAULT_PORT = 8001;//определение порта
    //сервера
    public final String VERSION_CMD = "VERS";//определение версии
    //команды
    public final String QUIT_CMD = "QUIT";//определение
    //команды «выход»
    public final byte[] VERSION = { 'V', '2', '.', '0' };//создание массива
    //для определения версии сервера
    public final byte[] UNKNOWN_CMD = { 'U', 'n', 'k', 'n', 'o', 'w', 'n', ' ',
            'c', 'o', 'm', 'm', 'a', 'n', 'd' };//неизвестная команда
    public void runServer() throws IOException {//метод сервера runServer
        DatagramSocket s = null;//создание объекта DatagramSocket
        try {
            boolean stopFlag = false;//создание флага stopFlag и его инициализация
//значением false
            //byte[] buf = new byte[512];//буфер для приема/передачи дейтаграммы
            s = new DatagramSocket(DEFAULT_PORT);//привязка сокета к
//реальному объекту с портом DEFAULT_PORT
            //System.out.println("UDPServer: Started on " + s.getLocalAddress() + ":"
                   // + s.getLocalPort());//вывод к консоль сообщения
            //while(!stopFlag) {//цикл до тех пор, пока флаг не примет значение true
               // DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);//создание объекта дейтаграммы для получения данных
               // s.receive(recvPacket);//помещение полученного содержимого в
//объект дейтаграммы
                //String cmd = new String(recvPacket.getData()).trim();//извлечение
//команды из пакета
                //System.out.println("UDPServer: Command: " + cmd);
                //DatagramPacket sendPacket = new DatagramPacket(buf, 0, recvPacket.getAddress(), recvPacket.getPort());//формирование объекта                                                                  // дейтаграммы для отсылки данных
                //int n = 0;//количество байт в ответе
                //if (cmd.equals(VERSION_CMD)) {//проверка версии команды
                    //n = VERSION.length;
                    //System.arraycopy(VERSION, 0, buf, 0, n);
               // }
                //else if (cmd.equals(QUIT_CMD)) {
                   // stopFlag = true;//остановка сервера
                    //continue;
                //}
               // else {
                   // n = UNKNOWN_CMD.length;
                   // System.arraycopy(UNKNOWN_CMD, 0, buf, 0, n);
                //}
                //sendPacket.setData(buf);//установить массив посылаемых данных
                //sendPacket.setLength(n);//установить длину посылаемых данных
               // s.send(sendPacket);//послать сами данные
             // while(server is not stopped)
            //System.out.println("UDPServer: Stopped");
            //ServerSocket serverSocket = null;
            //Socket clientAccepted     = null;//объявление объекта класса Socket
            //ObjectInputStream  sois   = null;//объявление байтового потока ввода
            //ObjectOutputStream soos   = null;//объявление байтового потока вывода
            /* serverSocket = new ServerSocket(2525);//создание сокета сервера для //заданного порта
            clientAccepted = serverSocket.accept();//выполнение метода, который //обеспечивает реальное подключение сервера к клиенту
            System.out.println("connection established....");
//создание потока ввода soos = new
            sois = new ObjectInputStream(clientAccepted.getInputStream());
            soos = new ObjectOutputStream(clientAccepted.getOutputStream());//создание потока
//вывод*/
            /*DatagramPacket x = new DatagramPacket(buf, buf.length);//создание объекта дейтаграммы для получения данных
            s.receive(x);
            DatagramPacket y = new DatagramPacket(buf, buf.length);//создание объекта дейтаграммы для получения данных
            s.receive(y);
            DatagramPacket z = new DatagramPacket(buf, buf.length);//создание объекта дейтаграммы для получения данных
            s.receive(z);*/
            //DatagramPacket X = new DatagramPacket(buf, buf.length);//создание объекта дейтаграммы для получения данных

            /*byte[] bytes = new byte[1024];
            s.receive(bytes); //чтение иформации, посланной клиентом, из вхоного потока в массив bytes[]
            String str = new String(bytes, "UTF-8"); // переводим тип byte в тип String
            String[] numbers = str.split(" "); // разбиваем строку на подстроки пробелами
            //s.receive(X);//помещение полученного содержимого в
//объект дейтаграммы
            int numbers[0] = (int)X;//извлечение*/
//команды из пакета
            byte[] buf = new byte[512];
            DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);//создание объекта дейтаграммы для получения данных
            s.receive(recvPacket);//помещение полученного содержимого в
//объект дейтаграммы
            String X = new String(recvPacket.getData());//извлечение
            int x = Integer.parseInt (X.trim ());
            //DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);//создание объекта дейтаграммы для получения данных
            System.out.print ("я");
            s.receive(recvPacket);//помещение полученного содержимого в
//объект дейтаграммы
            String Y = new String(recvPacket.getData());//извлечение
            int y = Integer.parseInt (Y.trim ());
            s.receive(recvPacket);//помещение полученного содержимого в
//объект дейтаграммы
            String Z = new String(recvPacket.getData());//извлечение
            int z = Integer.parseInt (Z.trim ());

            //текст
              double F = Math.pow(Math.abs(Math.cos(x)-Math.exp(y)), 1+2*Math.pow(Math.log(y),2)) * (1+z+Math.pow(z, 2)/2 + Math.pow(z, 3)/3);
            String F1 = String.valueOf(F);
            byte[] b = F1.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(b, 0, recvPacket.getAddress(), recvPacket.getPort());//формирование объекта                                                                  // дейтаграммы для отсылки данных
            sendPacket.setData(b);//установить массив посылаемых данных
            sendPacket.setLength(b.length);//установить длину посылаемых данных
            s.send(sendPacket);//послать сами данные
        }
        finally {
            if (s != null) {
                s.close();//закрытие сокета сервера
            }
        }
    }
    public static void main(String[] args) {//метод main
        try {
            Main udpSvr = new Main();//создание объекта udpSvr
            udpSvr.runServer();//вызов метода объекта runServer
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}

