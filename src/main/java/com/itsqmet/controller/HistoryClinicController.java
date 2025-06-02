package com.itsqmet.controller;

import com.itsqmet.modelo.HistoryClinic;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HistoryClinicController {

    @GetMapping("/formularioClinico")
    public String mostrarFormulario(Model model) {
        HistoryClinic historia = new HistoryClinic();
        model.addAttribute("historia", historia);
        return "pages/formularioClinico";
    }

    @PostMapping("/vistaClinica")
    public String guardarHistoria(@Valid @ModelAttribute("historia") HistoryClinic historia,
                                  BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("errores", bindingResult.getAllErrors());
            return "pages/formularioClinico";
        }


        model.addAttribute("historia", historia);
        return "pages/vistaClinica";
    }

}
