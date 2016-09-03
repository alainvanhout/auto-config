package demodependency3;

import org.springframework.stereotype.Service;

@Service
public class ExclamationService {
    public String yell(String text){
        return text + "!";
    }
}
