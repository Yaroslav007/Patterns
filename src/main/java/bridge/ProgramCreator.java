package main.java.bridge;

import main.java.bridge.impl.CppDeveloper;
import main.java.bridge.impl.JavaDeveloper;
import main.java.bridge.programs.BankSystem;
import main.java.bridge.programs.StockExchange;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs= {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program: programs){
            program.developProgram();
        }
    }
}
