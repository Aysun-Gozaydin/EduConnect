package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Ders;
import service.dersService;

@RestController
@RequestMapping("/dersler")
public class DersController {

    private final dersService dersService;

    public DersController(dersService dersService) {
        this.dersService = dersService;
    }

    @PostMapping("/quiz")
    public Ders quizDersOlustur() {
        return dersService.dersOlustur("quiz", "Java Quiz", "Java Temelleri", 100,
                                        "Ahmet", "Quiz İçeriği", 60, 15);
    }

    @GetMapping("/tum")
    public List<Ders> tumDersleriGetir() {
        return dersService.tumDersleriGetir();
    }
}
