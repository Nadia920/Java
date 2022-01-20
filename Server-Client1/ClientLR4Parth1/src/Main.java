import java.util.Scanner;
import java.io.*;//импорт пакета, содержащего классы для
// ввода/вывода
import java.net.*;//импорт пакета, содержащего классы для
// работы в сети
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] Matrix;
        Matrix = new int[3][3];
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                int flag=0;
                while (flag==0)
                {

                    System.out.println("Введите число в элемент массива Matrix[" + i + "]" + "[" + j + "]");
                    // in.nextLine();
                    if (in.hasNextInt()) {
                        Matrix[i][j] = in.nextInt();
                        flag++;
                    } else {
                        in.nextLine();
                        in.nextLine();
                        System.out.println("Необходимо ввести число ");
                    }
                }
            }
        }
        System.out.println("Исходная матрица");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }
        try {
            System.out.println("server connecting....");
            Socket clientSocket = new Socket("127.0.0.1", 2525);//установление //соединения между локальной машиной и указанным портом узла сети
            System.out.println("connection established....");
            BufferedReader stdin =
                    new BufferedReader(new InputStreamReader(System.in));//создание
//буферизированного символьного потока ввода
            ObjectOutputStream coos =
                    new ObjectOutputStream(clientSocket.getOutputStream());//создание
//потока вывода
            ObjectInputStream cois =
                    new ObjectInputStream(clientSocket.getInputStream());//создание
//потока ввода
            //текст
            //System.out.println("Enter any string to send to server \n\t('quite' − programme terminate)");
            //String clientMessage = stdin.Matrix;
            //String clientMessage = stdin.readLine();
//System.out.println("you've entered: "+clientMessage); while(!clientMessage.equals("quite")) {//выполнение цикла, пока строка //не будет равна «quite»
//coos.writeObject(clientMessage);//потоку вывода присваивается //значение строковой переменной (передается серверу)
            //clientMessage = Matrix;
            //coos.writeObject(clientMessage);
            //coos.writeObject(Matrix);//потоку вывода присваивается //значение строковой переменной (передается серверу)
            int flag2=0;
            /*String[][] xa = {};
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                   xa[i][j] = String.valueOf(Matrix[i][j]);
                }
            }*/
            coos.writeObject(Matrix);
            System.out.println("Матрица отправлена");
            while (flag2==0){
                System.out.println("Получено сообцение ");
                in.nextLine();
                String text = (String)cois.readObject();
                System.out.println(text);
                System.out.println("Определитель матрицы равен нулю. Пожалуйста, введите другую матрицу");
                if (text.equals ("Определитель матрицы равен нулю. Пожалуйста, введите другую матрицу") == true){
                    System.out.println("Определитель матрицы равен нулю. Пожалуйста, введите другую матрицу");
                    for (int i=0; i<3; i++)
                    {
                        for (int j=0; j<3; j++)
                        {
                            int flag=0;
                            while (flag==0)
                            {

                                System.out.println("Введите число в элемент массива Matrix[" + i + "]" + "[" + j + "]");
                                // in.nextLine();
                                if (in.hasNextInt()) {
                                    Matrix[i][j] = in.nextInt();
                                    flag++;
                                } else {
                                    in.nextLine();
                                    in.nextLine();
                                    System.out.println("Необходимо ввести число ");
                                }
                            }
                        }
                    }

                    coos.writeObject(Matrix);
                }
                else {
                    System.out.println("Матрица в порядке");
                    //break;
                    flag2++;

                }
            }

            System.out.println("Обратная матрица");
            double[][] Matrix1 = (double[][]) cois.readObject();
            System.out.println("Результат");
            ;//выводится на //экран содержимое потока ввода (переданное сервером)
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(Matrix1[i][j] + "\t");
                }
                System.out.println();
            }
            // System.out.println("---------------------------");
                //clientMessage = stdin.readLine();//ввод текста с клавиатуры
                //System.out.println("you've entered: "+clientMessage);//вывод в
//консоль строки и значения строковой переменной
            /*} catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }*/
        coos.close();//закрытие потока вывода
            cois.close();//закрытие потока ввода
            clientSocket.close();//закрытие сокета
        }catch(Exception e)	{
            e.printStackTrace();//выполнение метода исключения е
        }
    }
}
