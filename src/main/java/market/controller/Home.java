package market.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import market.model.CartItem;
import market.model.Category;
import market.model.Customer;
import market.model.Event;
import market.model.Location;
import market.model.OrderDetail;
import market.model.Product;
import market.model.Supplier;
import market.service.AddressService;
import market.service.CartItemService;
import market.service.CategoryService;
import market.service.CustomerService;
import market.service.EventService;
import market.service.LocationService;
import market.service.OrderService;
import market.service.OrderdetailService;
import market.service.ProductService;
import market.service.SupplierService;
import market.service.UserService;
import market.validator.UserValidator;


@Controller
@RequestMapping("/")
public class Home {
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
	AddressService addressservice;
	@Autowired
	CustomerService customerservice;
	@Autowired
	EventService eventservice;
	@Autowired
	OrderService orderservice;
	@Autowired
	UserService userservice;
	@Autowired
	OrderdetailService detailservice;
	@Autowired
	UserValidator uservalidator;
	@RequestMapping(value="/home")
	public String getAll(Model model){
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
	@RequestMapping(value="/category")
	public String getAllCategory(Model model){
		List<Category> listcategory= categoryservice.getAll();	
		model.addAttribute("Lcate", listcategory);
		return "index";
	}
	@RequestMapping(value="/cate")
	public String findCate(@RequestParam int idcategory,Model model){
		Category cate= categoryservice.findId(idcategory);
		if(cate.getIdcategory()==1){
			model.addAttribute("name", cate);
			
			
		}
		if(cate.getIdcategory()==2){
			model.addAttribute("name", cate);
		}
		if(cate.getIdcategory()==3){
			model.addAttribute("name", cate);
		}
		if(cate.getIdcategory()==4){
			model.addAttribute("name", cate);
		}
		model.addAttribute("find", cate);
		List<Location> location= locationservice.getAll();
		model.addAttribute("location", location);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		return "product";
	}
	@RequestMapping(value="/search")
	public String find(@RequestParam String name,Model model){
		List<Product> product= productservice.findByNameLike(name);
		model.addAttribute("Lproduct", product);
		List<Category> listcategory= categoryservice.getAll();	
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		List<Location> location= locationservice.getAll();
		model.addAttribute("location", location);
		return "index";
	}
	@RequestMapping(value="/supplier")
	public String getSupply(Model model){
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		return "index";
	}
	@RequestMapping(value="/supply")
	public String findSup(@RequestParam int idsupplier,Model model){
		List<Category> listcategory= categoryservice.getAll();
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		Supplier sup= suppliservice.findId(idsupplier);
		
		model.addAttribute("findsup", sup);	
		return "product";
	}
	@RequestMapping(value="/detail")
	public String getProduct(@RequestParam int idproduct, Model model){
		List<Category> listcategory= categoryservice.getAll();
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		Product product= productservice.findId(idproduct);
		if(product.getCategory().getIdcategory()==1){
			if(isExistProduct(idproduct)){
				productservice.updateView(idproduct);
			}
			model.addAttribute("pdetail", product);
			return "pkdetail";
		}
		else if(product.getCategory().getIdcategory()==4){
			if(isExistProduct(idproduct)){
				productservice.updateView(idproduct);
			}
			model.addAttribute("pdetail", product);
			return "product-detail";
		}
		else if(product.getCategory().getIdcategory()==3){
			if(isExistProduct(idproduct)){
				productservice.updateView(idproduct);
			}
			model.addAttribute("listsupply", suppliservice.getAll());
			model.addAttribute("listlocation", locationservice.getAll());
			model.addAttribute("pdetail", product);
			return "tabletdetail";
		}
		
		
		return "product-detail";
	}
	public boolean isExistProduct(int idproduct){
		for(Product p: productservice.getAllProduct()){
			if(p.getIdproduct()==idproduct)
				return true;
		}
		return false;
	}
	@RequestMapping(value="/location")
	public String getLocation(@RequestParam int idlocation,Model model){
		List<Category> listcategory= categoryservice.getAll();
		model.addAttribute("Lcate", listcategory);
		List<Supplier> supplier= suppliservice.getAll();
		model.addAttribute("Lsup", supplier);
		List<Location> loca=locationservice.getAll();
		model.addAttribute("loca", loca);
		Location location=locationservice.findId(idlocation);
		model.addAttribute("location", location);
		return "product";
	}
	@RequestMapping(value="/deletecart")
	public String deletecart(@RequestParam int idproduct,HttpSession session){
		@SuppressWarnings("unchecked")
		List<CartItem> listitem= (List<CartItem>) session.getAttribute("cart");
		int index= isExisting(idproduct, session);
		listitem.remove(index);
		return "phonecart";
	}
	@RequestMapping(value="/addcart")
	public String addCart(@RequestParam int idproduct,Model model,HttpSession session){
		Product product=productservice.findId(idproduct);
		if(session.getAttribute("cart")==null){
			List<CartItem> items= new ArrayList<CartItem>();
			items.add(new CartItem(1, product));
			session.setAttribute("cart", items);
		}else{
			@SuppressWarnings("unchecked")
			List<CartItem> listitem= (List<CartItem>) session.getAttribute("cart");
			int index= isExisting(idproduct, session);
			if(index==-1){
				listitem.add(new CartItem(1, product));
			}
			else{
			int quantity= listitem.get(index).getQuantity()+1;
			listitem.get(index).setQuantity(quantity);
			}
			session.setAttribute("cart", listitem);
		}
		return "phonecart";
		
	}
	private int isExisting(int idproduct, HttpSession session){
		@SuppressWarnings("unchecked")
		List<CartItem> carts = (List<CartItem>)session.getAttribute("cart");
		for(int i = 0; i < carts.size(); i++){
			if(carts.get(i).getProduct().getIdproduct()==idproduct){
				return i;
			}
		}
		return -1;
	}	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String cartUpdate(HttpServletRequest request, HttpSession session){
		@SuppressWarnings("unchecked")
		List<CartItem> carts = (List<CartItem>)session.getAttribute("cart");
		String []quantity = request.getParameterValues("quantity");
		for(int i = 0; i < carts.size(); i++){
			carts.get(i).setQuantity(Integer.parseInt(quantity[i]));
		}
		session.setAttribute("cart", carts);
		return "phonecart";
	}
	@RequestMapping(value="/order")
	public String signup(@ModelAttribute Customer customer){
		customerservice.create(customer);
		return "redirect:/listcust";
	}
	@RequestMapping(value="/viewcart")
	public String viewCart(Model model,HttpSession session){
		@SuppressWarnings("unchecked")
		List<CartItem> list= (List<CartItem>) session.getAttribute("cart");
		session.setAttribute("cart", list);
		return "phonecart";
	}
	@RequestMapping(value="/checkout",method=RequestMethod.GET)
	public String register(Model model){
		model.addAttribute("neworder", new Customer());
		return "order";
	}
	@RequestMapping(value="/checkout",method=RequestMethod.POST)
	public String checkout(HttpSession session, Model model,@ModelAttribute("neworder") Customer customer,BindingResult result){
		uservalidator.validateCus(customer, result);
		if(result.hasErrors()){
			return "checkout";
		}
		customerservice.create(customer);
		@SuppressWarnings("unchecked")
		List<CartItem> listitem= (List<CartItem>) session.getAttribute("cart");
		for(CartItem cartitem: listitem){
			OrderDetail orderdetail= new OrderDetail(cartitem.getProduct().getPrice()*cartitem.getQuantity(), cartitem.getQuantity(), new Date(), "Chưa xử lý",cartitem.getProduct() , customer, null);
			detailservice.create(orderdetail);
		}
		return "thankyou";
	}
}
