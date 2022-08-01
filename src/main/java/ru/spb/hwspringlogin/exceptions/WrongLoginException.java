package ru.spb.hwspringlogin.exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        System.out.println("Логин не верный");
    }
}
