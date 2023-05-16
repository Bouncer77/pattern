package ru.pczver.pattern.strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
