package com.example.problem;

import com.example.problem.ChiliConCarne;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
    private ChiliConCarne chili;

    public PartyService(ChiliConCarne chili) {
        this.chili = chili;
    }

    public String serve() { return "serving "+ chili.taste(); }

}
