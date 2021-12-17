package nvc.it.test01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest1 {
    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    public String Tanakorn_Boonsukurt(){
        return "<center>This root page 0 </center> <br> <a href='/name'>Go to name page</a> <br> <a href='/aboutme'>Go to aboutme page</a> <br> <a href='/contact'>Go to contact page</a>";
    }

    @RequestMapping("/name")
    @ResponseBody
    public String name (){
        return "<center>Tanakorn Boonsukurt</center> <br> <a href='/'>Go to index page</a>";
    }
    @RequestMapping("/aboutme")
    @ResponseBody
    public String aboutme (){
        return "<center>ABOUTME <hr> Name : Tanakorn Boonsukurt<br>Brith Day : 05/06/2002 Old:19 <br> PhoneNumber : 0924871742<br> Province : Nakhonphathom</center> <br> <a href='/'>Go to index page</a>";
    }
    @RequestMapping("/contact")
    @ResponseBody
    public String contact (){
        return "<center>CONTACT <hr> Facebook : Boonsukurt Bew <br>Line ID : kaniingbmw <br> IG : borwor_0506</center> <br> <a href='/'>Go to index page</a>";
    }
    }
    

