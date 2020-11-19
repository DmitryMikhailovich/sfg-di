package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {


    @Override
    public String getEnglishGreeting() {
        return "Hello World - EN";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo Welt - DE";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo - ES";
    }
}
