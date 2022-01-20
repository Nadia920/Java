import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;

public class Laba {
    public static void main(String[] args) {
        //JList list = new JList();
        List list = new List();
        list.setVisible(true);
    }
}

class List extends JFrame {
    public DefaultListModel listModel = new DefaultListModel();
    public DefaultListModel listModelthree = new DefaultListModel();
    public JButton button;
    public String[] data = {"one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve"
    };
    public JList text1 = new JList(data);
    public JList text2, text3;
    public CheckboxGroup g1 = new CheckboxGroup();
    public CheckboxGroup g = new CheckboxGroup();

    List() {
        super("Списки");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(830, 600);

        button = new JButton("Переместить");

        //text1 = new JList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve");
        text2 = new JList();
        text3 = new JList();
        setLayout(null);//swing
        button.setSize(250, 50);
        button.setLocation(10, 320);
        text1.setSize(246, 300);
        text1.setLocation(10, 10);
        text2.setSize(246, 300);
        text2.setLocation(276, 10);
        text3.setSize(246, 300);
        text3.setLocation(542, 10);
        add(button);
        add(text1);
        add(text2);
        add(text3);
        //setLayout (new GridLayout(3, 1));

        //CheckBox one, two, three, four, five, six, seven, eight, nine, ten;
        //Checkbox one_list = new Checkbox("one list", g1, false);
        //one_list.setBounds(10, 380, 236, 30);
        Checkbox two_list = new Checkbox("two list", g1, false);
        two_list.setBounds(10, 420, 236, 30);
        Checkbox three_list = new Checkbox("three list", g1, false);
        three_list.setBounds(10, 460, 236, 30);
        //add(one_list);
        add(two_list);
        add(three_list);
        //setLayout (new GridLayout(10, 1));

        //CheckBox one, two, three, four, five, six, seven, eight, nine, ten;
        Checkbox one = new Checkbox("one", g, false);
        one.setBounds(266, 330, 96, 75);
        Checkbox two = new Checkbox("two", g, false);
        two.setBounds(372, 330, 96, 75);
        Checkbox three = new Checkbox("three", g, false);
        three.setBounds(478, 330, 96, 75);
        Checkbox four = new Checkbox("four", g, true);
        four.setBounds(584, 330, 96, 75);
        Checkbox five = new Checkbox("five", g, false);
        five.setBounds(690, 330, 96, 75);
        Checkbox six = new Checkbox("six", g, false);
        six.setBounds(266, 415, 96, 75);
        Checkbox seven = new Checkbox("seven", g, false);
        seven.setBounds(372, 415, 96, 75);
        Checkbox eight = new Checkbox("eight", g, false);
        eight.setBounds(478, 415, 96, 75);
        Checkbox nine = new Checkbox("nine", g, false);
        nine.setBounds(584, 415, 96, 75);
        Checkbox ten = new Checkbox("ten", g, false);
        ten.setBounds(690, 415, 96, 75);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(ten);
        button.addActionListener(new ButtonActionLisener());
    }

    public class ButtonActionLisener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            String first = g1.getSelectedCheckbox().getLabel();

            String second = g.getSelectedCheckbox().getLabel();

            int selectionIndex = text1.getSelectedIndex();

            System.out.println("1" + first + "2" + second);
            if (Objects.equals(second, "one") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex);
                String datanew = (String) text1.getSelectedValue();
                listModel.addElement(datanew);
                text2.setModel(listModel);
            }
            if (Objects.equals(second, "one") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex);
                String datanew1 = (String) text1.getSelectedValue();
                listModelthree.addElement(datanew1);
                text3.setModel(listModelthree);
            }
            if (Objects.equals(second, "two") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 1);
                Object[] datanew2 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew2, datanew2.length, String[].class);
                for (int il = 0; il < 2; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "two") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 1);
                Object[] datanew3 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew3, datanew3.length, String[].class);
                for (int il = 0; il < 2; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }
            if (Objects.equals(second, "three") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 2);
                Object[] datanew4 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew4, datanew4.length, String[].class);
                for (int il = 0; il < 3; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "three") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 2);
                Object[] datanew5 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew5, datanew5.length, String[].class);
                for (int il = 0; il < 3; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }
            if (Objects.equals(second, "four") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 3);
                Object[] datanew6 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew6, datanew6.length, String[].class);
                for (int il = 0; il < 4; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "four") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 3);
                Object[] datanew7 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew7, datanew7.length, String[].class);
                for (int il = 0; il < 4; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }
            if (Objects.equals(second, "five") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 4);
                Object[] datanew8 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew8, datanew8.length, String[].class);
                for (int il = 0; il < 5; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "five") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 4);
                Object[] datanew9 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew9, datanew9.length, String[].class);
                for (int il = 0; il < 5; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }
            if (Objects.equals(second, "six") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 5);
                Object[] datanew10 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew10, datanew10.length, String[].class);
                for (int il = 0; il < 6; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "six") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 5);
                Object[] datanew11 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew11, datanew11.length, String[].class);
                for (int il = 0; il < 6; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }
            if (Objects.equals(second, "seven") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 6);
                Object[] datanew12 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew12, datanew12.length, String[].class);
                for (int il = 0; il < 7; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "seven") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 6);
                Object[] datanew13 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew13, datanew13.length, String[].class);
                for (int il = 0; il < 7; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }
            if (Objects.equals(second, "eight") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 7);
                Object[] datanew14 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew14, datanew14.length, String[].class);
                for (int il = 0; il < 8; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "eight") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 7);
                Object[] datanew15 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew15, datanew15.length, String[].class);
                for (int il = 0; il < 8; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }
            if (Objects.equals(second, "nine") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 8);
                Object[] datanew16 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew16, datanew16.length, String[].class);
                for (int il = 0; il < 9; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "nine") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 8);
                Object[] datanew17 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew17, datanew17.length, String[].class);
                for (int il = 0; il < 9; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }
            if (Objects.equals(second, "ten") && Objects.equals(first, "two list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 9);
                Object[] datanew18 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew18, datanew18.length, String[].class);
                for (int il = 0; il < 10; il++) {
                    listModel.addElement(stringArray[il]);
                    text2.setModel(listModel);
                }
            }
            if (Objects.equals(second, "ten") && Objects.equals(first, "three list")) {
                text1.setSelectionInterval(selectionIndex, selectionIndex + 9);
                Object[] datanew19 = text1.getSelectedValuesList().toArray();
                String[] stringArray = Arrays.copyOf(datanew19, datanew19.length, String[].class);
                for (int il = 0; il < 10; il++) {
                    listModelthree.addElement(stringArray[il]);
                    text3.setModel(listModelthree);
                }
            }

        }
    }
}


