package ru.pczver.pattern.strategy;

import ru.pczver.pattern.strategy.auth.UserChecker;
import ru.pczver.pattern.strategy.strategy.DBAuth;
import ru.pczver.pattern.strategy.strategy.FileAuth;

import java.io.File;

public class Start {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc://etc"));

        userChecker.check(new FileAuth(new File("file.txt")));
    }
}
