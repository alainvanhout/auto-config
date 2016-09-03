package demodependency;

import demodependency3.ExclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private ExclamationService exclamationService;

    public String hello(){
        return exclamationService.yell("hello");
    }
}
