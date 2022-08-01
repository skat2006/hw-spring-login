package ru.spb.hwspringlogin;

public interface LoginService {

    String login(String user, String password, String pasConfirmation);
}
