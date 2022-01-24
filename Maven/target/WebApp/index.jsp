<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <%@page contentType="text/html;charset=utf-8"%>
    <title>Document</title>
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="style.css">
</head>

<body>
<%@ page import="java.io.File" %>
<%@ page import="javax.xml.parsers.DocumentBuilderFactory" %>
<%@ page import="javax.xml.parsers.DocumentBuilder" %>
<%@ page import="org.w3c.dom.Document" %>
<%@ page import="org.w3c.dom.NodeList" %>
<%@ page import="org.w3c.dom.Node" %>
<%@ page import="org.w3c.dom.Element" %>
<%@ page import="org.w3c.dom.Element" %>

<%@ page import="deposite.DepositeType" %>
<%@ page import="deposite.Deposite" %>

<body>
<div class="container">
    <h1 class="page-title">Deposite list</h1>
    <%
        try {
            File fXmlFile = new File("D:\\СиТАиРИС\\WebApp\\src\\main\\webapp\\Deposite.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();
    %>
    <table class="deposite-table">
        <tr>
            <th>Тип</th>
            <th>Наименование</th>
            <th>Валюта</th>
            <th>Срок</th>
            <th>Процентная ставка</th>
            <th>Описание</th>
        </tr>
        <%
            NodeList deposites = doc.getElementsByTagName("deposite");
            double avgPercent = 0.0;
            for (int i = 0; i < deposites.getLength(); i++) {
                Node nNode = deposites.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    new Deposite(DepositeType.convert(eElement.getAttribute("enum_type")), eElement.getElementsByTagName("name").item(0).getTextContent(), Double.parseDouble(eElement.getAttribute("percent")), eElement.getAttribute("term"), eElement.getElementsByTagName("description").item(0).getTextContent(), eElement.getAttribute("currency"));
                    avgPercent+=Double.parseDouble(eElement.getAttribute("percent"));
        %>
        <tr>
            <td><%out.println(eElement.getAttribute("type"));%></td>
            <td><%out.println(eElement.getElementsByTagName("name").item(0).getTextContent());%></td>
            <td><%out.println(eElement.getAttribute("currency"));%></td>
            <td><%out.println(eElement.getAttribute("term"));%></td>
            <td><%out.println(eElement.getAttribute("percent")+"%");%></td>
            <td><%out.println(eElement.getElementsByTagName("description").item(0).getTextContent());%></td>
        </tr>
        <%
                }
            }
        %>
    </table>
    <h2 class="statistics">Статистические данные</h2>
    <p class="stat">
        <%out.println("Общее число вкладов : " + deposites.getLength());%><br>
        <%out.println("Средний показатель процентной ставки : " + (avgPercent / deposites.getLength()) + "%");%><br>
        <%out.println("Общее число срочных депозитов : " + Deposite.getHowManyDeposite(deposite.DepositeType.TIME_DEPOSITE));%><br>
        <%out.println("Общее число депозитов до востребования: " + Deposite.getHowManyDeposite(deposite.DepositeType.DEMAND_DEPOSITE));%><br>
        <%out.println("Общее число краткосрочных депозитов : " + Deposite.getHowManyDeposite(deposite.DepositeType.SHORT_TERM_DEPOSITE));%><br>
        <%out.println("Общее число долгосрочных депозитов : " + Deposite.getHowManyDeposite(deposite.DepositeType.LONG_TERM_DEPOSITE));%><br>
        <%out.println("Общее число сберегательных депозитов : " + Deposite.getHowManyDeposite(deposite.DepositeType.SAVING_DEPOSITE));%><br>
    </p>
    <%
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
</div>
</body>
</html>

