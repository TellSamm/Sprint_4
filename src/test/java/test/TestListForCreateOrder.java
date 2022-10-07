package test;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import pageobject.MainPage;
import pageobject.OrderPage;
import pageobject.BaseSelenium;
import test.test_data.Order;
import test.test_data.User;

import static org.hamcrest.CoreMatchers.containsString;

//Проверки формирования заказов через GoogleChrome.
public class TestListForCreateOrder extends BaseSelenium {

    @Test
    public void shouldCreateCorrectOrderForDeliverySamokat() {
        OrderPage objectOrderPage = new OrderPage();
        User userForOrder = new User();
        Order dateForOrder = new Order();
        MainPage odjectMainPage = new MainPage();

        odjectMainPage.clickButtonOrder();
        objectOrderPage.setFieldName(userForOrder.setNameUser("Семен"));
        objectOrderPage.setFieldLasteName(userForOrder.setLastName("Черников"));
        objectOrderPage.setAdress(dateForOrder.setAddress("Эльменя 23"));
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetro();
        objectOrderPage.setNumberPhone(dateForOrder.setNumberPhone("89196742969"));
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat(dateForOrder.setDeliveryDate("10.09.2022"));
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setColorSamokat();
        objectOrderPage.setCommentForDelivery(dateForOrder.setComment("Тестовый комментарий"));
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAcceptOrder();
        String expected = "Заказ оформлен";
        String actual = objectOrderPage.getOrderText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));
    }

    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatNumberTwo() {
        OrderPage objectOrderPage = new OrderPage();
        User userForOrder = new User();
        Order dateForOrder = new Order();
        MainPage odjectMainPage = new MainPage();

        odjectMainPage.clickButtonOrder();
        objectOrderPage.setFieldName(userForOrder.setNameUser("Петр"));
        objectOrderPage.setFieldLasteName(userForOrder.setLastName("Иванович"));
        objectOrderPage.setAdress(dateForOrder.setAddress("Ленина 48"));
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone(dateForOrder.setNumberPhone("89236743457"));
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat(dateForOrder.setDeliveryDate("11.01.2022"));
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setColorSamokat();
        objectOrderPage.setCommentForDelivery(dateForOrder.setComment("Тестовый комментарий №1"));
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAcceptOrder();
        String expected = "Заказ оформлен";
        String actual = objectOrderPage.getOrderText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));
    }

    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatWithHelpDownOrderButton() {
        OrderPage objectOrderPage = new OrderPage();
        User userForOrder = new User();
        Order dateForOrder = new Order();
        MainPage odjectMainPage = new MainPage();

        odjectMainPage.clickButtonOrder();
        objectOrderPage.setFieldName(userForOrder.setNameUser("Петр"));
        objectOrderPage.setFieldLasteName(userForOrder.setLastName("Корнилов"));
        objectOrderPage.setAdress(dateForOrder.setAddress("Карла Маркса 14 корпус 3"));
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone(dateForOrder.setNumberPhone("89137754457"));
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat(dateForOrder.setDeliveryDate("12.12.2022"));
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setChooseColorSamokatGrey();
        objectOrderPage.setCommentForDelivery(dateForOrder.setComment("Тестовый комментарий №3 !"));
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAcceptOrder();
        String expected = "Заказ оформлен";
        String actual = objectOrderPage.getOrderText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));

    }


    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatWithHelpDownOrderButtonNumberTwo() {
        OrderPage objectOrderPage = new OrderPage();
        User userForOrder = new User();
        Order dateForOrder = new Order();
        MainPage odjectMainPage = new MainPage();

        odjectMainPage.clickButtonOrder();
        objectOrderPage.setFieldName(userForOrder.setNameUser("Анастасия"));
        objectOrderPage.setFieldLasteName(userForOrder.setLastName("Михайлова"));
        objectOrderPage.setAdress(dateForOrder.setAddress("Петрова 84"));
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone(dateForOrder.setNumberPhone("89137654386"));
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat(dateForOrder.setDeliveryDate("1.11.2022"));
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setChooseColorSamokatGrey();
        objectOrderPage.setCommentForDelivery(dateForOrder.setComment("Тестовый комментарий №@#!# 12345 !"));
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAcceptOrder();
        String expected = "Заказ оформлен";
        String actual = objectOrderPage.getOrderText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));

    }
}

