import java.io.*;//импорт пакета, содержащего классы для
//ввода/вывода
import java.net.*;//импорт пакета, содержащего классы для работы в
//сети Internet
public class Main {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientAccepted     = null;//объявление объекта класса Socket
        ObjectInputStream  sois   = null;//объявление байтового потока ввода
        ObjectOutputStream soos   = null;//объявление байтового потока вывода
        try {
            System.out.println("server starting....");
            serverSocket = new ServerSocket(2525);//создание сокета сервера для //заданного порта
            clientAccepted = serverSocket.accept();//выполнение метода, который //обеспечивает реальное подключение сервера к клиенту
            System.out.println("connection established....");
//создание потока ввода soos = new

            sois = new ObjectInputStream(clientAccepted.getInputStream());

            soos = new ObjectOutputStream(clientAccepted.getOutputStream());//создание потока
//вывода

            //текст
            int[][] clientMessageRecieved;
            clientMessageRecieved = new int[3][3];
            double opred = 0.0;
            int flag1 = 0;
            clientMessageRecieved = (int[][]) sois.readObject();
            while (flag1 == 0) {
                //объявление //строки и присваивание ей данных потока ввода, представленных
//в виде строки (передано клиентом)
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(clientMessageRecieved[i][j] + "\t");
                    }
                    System.out.println();
                }
                opred = 1.0f / (clientMessageRecieved[0][0] * clientMessageRecieved[1][1] * clientMessageRecieved[2][2] + clientMessageRecieved[2][0] * clientMessageRecieved[0][1] * clientMessageRecieved[1][2] + clientMessageRecieved[1][0] * clientMessageRecieved[2][1] * clientMessageRecieved[0][2] - clientMessageRecieved[2][0] * clientMessageRecieved[1][1] * clientMessageRecieved[0][2] - clientMessageRecieved[0][0] * clientMessageRecieved[2][1] * clientMessageRecieved[1][2] - clientMessageRecieved[1][0] * clientMessageRecieved[0][1] * clientMessageRecieved[2][2]);
                System.out.println("Делим на " + (clientMessageRecieved[0][0] * clientMessageRecieved[1][1] * clientMessageRecieved[2][2] + clientMessageRecieved[2][0] * clientMessageRecieved[0][1] * clientMessageRecieved[1][2] + clientMessageRecieved[1][0] * clientMessageRecieved[2][1] * clientMessageRecieved[0][2] - clientMessageRecieved[2][0] * clientMessageRecieved[1][1] * clientMessageRecieved[0][2] - clientMessageRecieved[0][0] * clientMessageRecieved[2][1] * clientMessageRecieved[1][2] - clientMessageRecieved[1][0] * clientMessageRecieved[0][1] * clientMessageRecieved[2][2]));

                if (clientMessageRecieved[0][0] * clientMessageRecieved[1][1] * clientMessageRecieved[2][2] + clientMessageRecieved[2][0] * clientMessageRecieved[0][1] * clientMessageRecieved[1][2] + clientMessageRecieved[1][0] * clientMessageRecieved[2][1] * clientMessageRecieved[0][2] - clientMessageRecieved[2][0] * clientMessageRecieved[1][1] * clientMessageRecieved[0][2] - clientMessageRecieved[0][0] * clientMessageRecieved[2][1] * clientMessageRecieved[1][2] - clientMessageRecieved[1][0] * clientMessageRecieved[0][1] * clientMessageRecieved[2][2] == 0) {
                    soos.writeObject("Определитель матрицы равен нулю. Пожалуйста, введите другую матрицу");
                    System.out.println("Новая матрица");
                    clientMessageRecieved = (int[][]) sois.readObject();
                } else {
                    soos.writeObject("Матрица в порядке");
                    flag1++;
                }
            }
            //System.out.println("Определитель данной матрицы равен " + opred);
            //int[][] TransformMatrix;

            double [][] TransformMatrix;
            TransformMatrix = new double[3][3];
            TransformMatrix[0][0] = clientMessageRecieved[0][0];
            TransformMatrix[0][1] = clientMessageRecieved[1][0];
            TransformMatrix[0][2] = clientMessageRecieved[2][0];
            TransformMatrix[1][0] = clientMessageRecieved[0][1];
            TransformMatrix[1][1] = clientMessageRecieved[1][1];
            TransformMatrix[1][2] = clientMessageRecieved[2][1];
            TransformMatrix[2][0] = clientMessageRecieved[0][2];
            TransformMatrix[2][1] = clientMessageRecieved[1][2];
            TransformMatrix[2][2] = clientMessageRecieved[2][2];
            System.out.println("Обратная матрица");
          for (int i=0; i<3; i++)
          {
              for (int j=0; j<3; j++){
                  TransformMatrix[i][j] = opred * TransformMatrix[i][j];

              }
          }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(TransformMatrix[i][j] + "\t");
                }
                System.out.println();
            }
                soos.writeObject(TransformMatrix);//потоку вывода
//присваивается значение строковой переменной (передается клиенту)
                //clientMessageRecieved = (int[][])sois.readObject();//строке
//присваиваются данные потока ввода, представленные в виде строки
//(передано клиентом)
              } catch(Exception e)	{
        } finally {
            try {
                sois.close();//закрытие потока ввода
                soos.close();//закрытие потока вывода
                clientAccepted.close();//закрытие сокета, выделенного для клиента
                serverSocket.close();//закрытие сокета сервера
            } catch(Exception e) {
                e.printStackTrace();//вызывается метод исключения е
            }
        }

    }
}
