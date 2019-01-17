
package controllers;

import java.util.List;
import models.Conectar;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MunicipioController {
    
    private JdbcTemplate jdbcTemplate;

    public MunicipioController() {
        Conectar con = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(con.conectar()); 
    }
    
    
    @RequestMapping(value="list_1?{id}")
    public ModelAndView Listar(
            @PathVariable String id
    
    ){
        ModelAndView mav = new ModelAndView();
        String sql="select * from departamento";
        List datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("datos", datos);
        mav.setViewName("list_1");
        return mav;
    }
}
