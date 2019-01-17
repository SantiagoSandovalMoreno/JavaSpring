/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Conectar;
import models.Departamento;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Santiago
 */
@Controller
public class DepartamentoController {
    
    private JdbcTemplate jdbcTemplate;

    public DepartamentoController() {
        Conectar con = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping(value="list")
    public ModelAndView Listar(){
        
        ModelAndView mav = new ModelAndView();
        String sql="select * from departamento";
        List datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("datos", datos);
        mav.setViewName("list");
        return mav;
    }
    
    @RequestMapping(value="add")
    public ModelAndView Add(){
        
        ModelAndView mav = new ModelAndView();
      
        Map< String, String > phones = new HashMap<String, String>();
        phones.put("activo", "Activo");
        phones.put("inactivo", "Inactivo");
        mav.addObject("estado", phones);
        
        mav.addObject("departamento", new Departamento());
        
        mav.setViewName("add");
        return mav;
    }
    
    @RequestMapping(value="add",method=RequestMethod.POST)
    public ModelAndView form
            (
                @ModelAttribute("departamento") Departamento d,
                BindingResult result,
                SessionStatus status
            ){
                this.jdbcTemplate.update
                (
                "insert into departamento (nombre,estado) values (?,?)",
                 d.getNombre(),d.getEstado()
                );
                return new ModelAndView("redirect:/list.htm");
            }
    
    
}
    
    
    