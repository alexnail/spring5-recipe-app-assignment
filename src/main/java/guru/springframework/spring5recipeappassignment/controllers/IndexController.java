package guru.springframework.spring5recipeappassignment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:alexnail@gmail.com">Alexander Fridman</a>
 * Date: 7/12/18
 * Time: 11:54 PM
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        return "index";
    }
}
