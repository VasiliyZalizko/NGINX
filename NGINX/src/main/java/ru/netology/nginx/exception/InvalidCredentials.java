package ru.netology.nginx.exception;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }

    public void printStackTrace() {
    }
}