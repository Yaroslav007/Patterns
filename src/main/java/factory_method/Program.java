package main.java.factory_method;

import main.java.factory_method.factory.impl.CppDeveloperFactory;
import main.java.factory_method.factory.impl.JavaDeveloperFactory;

import java.util.Objects;

public class Program {

    public static void main(String[] args) throws Exception {
        Developer java = createDeveloperBySpeciality("java");
        java.writeCode();
    }

    private static Developer createDeveloperBySpeciality(String type) throws Exception {
        if (Objects.equals(type, "java")){
            return new JavaDeveloperFactory().createDeveloper();
        } else if (Objects.equals(type, "cpp")){
            return new CppDeveloperFactory().createDeveloper();
        }else {
            throw new Exception("Unknown developer type...");
        }
    }
}
