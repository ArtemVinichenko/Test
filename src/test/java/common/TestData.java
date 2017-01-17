package common;

import entities.Message;
import entities.User;

public class TestData {
//    public static final String userName = "art8991cy";
//    public static final String userPass = "61496149";
//    public static final String destinationEmail = "vinichencko82@gmail.com";
//    public static final String messageText = "What a fuckin shit";
    public static final String url = "https://mail.yandex.ua";

    public static User MainUser = new User("art8991cy", "61496149");
    public static Message NewMessage = new Message("vinichencko82@gmail.com","What a fuckin shit");
}
