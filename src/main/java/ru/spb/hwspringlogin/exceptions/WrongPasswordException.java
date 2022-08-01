package ru.spb.hwspringlogin.exceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        System.out.println("Не верный пароль");
    }
}
