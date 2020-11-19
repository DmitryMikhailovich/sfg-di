package guru.springframework.sfgdi.services;

public class PrimatyGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimatyGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
