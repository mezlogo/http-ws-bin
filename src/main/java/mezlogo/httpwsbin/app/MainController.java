package mezlogo.httpwsbin.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;


@Controller
public class MainController {
    private final ObjectMapper objectMapper;

    public MainController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public String home(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) throws JsonProcessingException {
//        model.addAttribute("echo", objectMapper.writeValueAsString(service.get(request)));
//        model.addAttribute("counter", objectMapper.writeValueAsString(service.counter(request, response, session)));
        return "home";
    }
}

