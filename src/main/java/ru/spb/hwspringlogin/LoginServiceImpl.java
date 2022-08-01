package ru.spb.hwspringlogin;

import org.springframework.stereotype.Service;
import ru.spb.hwspringlogin.exceptions.WrongLoginException;
import ru.spb.hwspringlogin.exceptions.WrongPasswordException;

@Service
public class LoginServiceImpl implements LoginService {

    public String login(String user, String pass, String passConfirm) {
        int requiredLength = 20;
        if (!checkValue(user, requiredLength)) {
            throw new WrongLoginException();
        }
        if (!checkValue(pass, requiredLength)) {
            throw new WrongPasswordException();
        }
        if (pass.equals(passConfirm)) {
            return "Удачный вход " + user;
        } else {
            return "Пароли не совпадают";
        }
    }

    private boolean checkValue(String value, int length) {
        return value.length() < length && value.matches("^[a-zA-Z0-9+_]+$");
    }
}
