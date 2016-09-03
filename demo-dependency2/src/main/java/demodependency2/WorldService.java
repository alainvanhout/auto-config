package demodependency2;

import demodependency3.ExclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorldService {

    @Autowired
    private ExclamationService exclamationService;

    public String world(){
        return exclamationService.yell("world");
    }
}
