//package servertcp;

import java.net.*;
import java.io.*;

class ServerTCP {
    static int countclients = 0;//счетчик подключившихся клиентов

    public static void main(String args[]) throws IOException {
        ServerSocket sock = null;
        InputStream is = null;
        OutputStream os = null;
        while (true) {
            try {

                sock = new ServerSocket(1024);
                Socket client = sock.accept();
                is = client.getInputStream(); //получили входной поток для чтения данных
                os = client.getOutputStream();//получили выходной поток для записи данных
                byte[] bytes = new byte[1024];
                is.read(bytes); //чтение иформации, посланной клиентом, из вхоного потока в массив bytes[]
                String str = new String(bytes, "UTF-8"); // переводим тип byte в тип String
                int numbers = Integer.parseInt(str.trim());
                String weather = ""; //переменнная,в которую будут записываться числа делящиеся на 3

                if (numbers == 1) {
                    weather = "15 градусов, солнечно";

                    //os.write(weather);
                }
                else if (numbers == 2) {
                    weather = "12 градусов, облачно";

                }
                else if (numbers == 3) {
                    weather = "10 градусов, ливень";

                }
                else if (numbers == 4) {
                    weather = "12 градусов, солнечно, местами дождь";

                }else if (numbers == 5) {
                    weather = "17 градусов, дождь из лягушек";

                }
                else if (numbers == 6) {
                    weather = "15 градусов, гроза, оранжевый уровень опасности";

                }
                else if (numbers == 7) {
                    weather = "19 градусов, солнечно";

                }
                byte[] b = weather.getBytes();
                os.write(b);
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            } finally {
                is.close();//закрытие входного потока
                os.close();//закрытие входного потока
                sock.close();//закрытие сокета, выделенного для работы с подключившимся клиентом
                System.out.println("Client " + countclients + " disconnected");
            }
        }

    }
}

