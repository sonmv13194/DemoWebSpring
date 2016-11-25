package market.controller;

import market.model.Category;
import market.model.Event;
import market.model.Location;
import market.model.Product;
import market.model.Supplier;
import market.model.User;
import market.service.CartItemService;
import market.service.CategoryService;
import market.service.EventService;
import market.service.LocationService;
import market.service.ProductService;
import market.service.SecurityService;
import market.service.SupplierService;
import market.service.UserService;
import market.validator.UserValidator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@Autowired
	CategoryService categoryservice;
	@Autowired
	ProductService productservice;
	@Autowired
	SupplierService suppliservice;
	@Autowired
	LocationService locationservice;
	@Autowired
	CartItemService cartitemservice;
	@Autowired
	EventService eventservice;
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Tài khoản hoặc mật khẩu không đúng.");
 
         if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String welcome(Model model) {
    	
    	List<Product> listproduct= productservice.getAll();
		List<Category> listcategory=categoryservice.getAll();
		List<Supplier> supplier= suppliservice.getAll();	
		List<Location> location=locationservice.getAll();	
		List<Product> productnew=productservice.getAllNewest();
		List<Event> listevent= eventservice.getAllEvent();
		model.addAttribute("Lproduct", listproduct);
		model.addAttribute("newest", productnew);
		model.addAttribute("Lcate", listcategory);
		model.addAttribute("Lsup", supplier);
		model.addAttribute("location", location);
		model.addAttribute("event", listevent);
        return "index";
    }
    @RequestMapping(value="/cancel")
    public String cancelRegister(){
    	return "redirect:/registration";
    }
}
