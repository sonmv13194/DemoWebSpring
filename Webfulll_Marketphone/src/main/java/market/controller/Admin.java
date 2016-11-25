package market.controller;


import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import market.model.Category;
import market.model.Comment;
import market.model.Customer;
import market.model.Event;
import market.model.Location;
import market.model.OrderDetail;
import market.model.Product;
import market.model.Supplier;
import market.service.CategoryService;
import market.service.CommentService;
import market.service.CustomerService;
import market.service.DetailProductService;
import market.service.EventService;
import market.service.LocationService;
import market.service.OrderdetailService;
import market.service.ProductService;
import market.service.SupplierService;
import market.validator.UserValidator;
@Controller
public class Admin {
	@Autowired
	CustomerService customerservice;
	@Autowired
	ProductService productservice;
	@Autowired 
	CategoryService categoryservice;
	@Autowired
	SupplierService supplierservice;
	@Autowired
	OrderdetailService detailservice;
	@Autowired
	LocationService locationservice;	
	@Autowired
	DetailProductService detailproductservice;
	@Autowired
	OrderdetailService orderservice;
	@Autowired
	UserValidator uservalidator;
	@Autowired
	SupplierService suppliservice;
	@Autowired
	EventService eventservice;
	@Autowired
	CommentService commentService;
	@RequestMapping(value="/admin")
	public String admin(Model model){
		List<Product> list= productservice.getAll();
		model.addAttribute("Lproduct", list);
		return "admin";
	}
	@RequestMapping(value="/pageAd")
	public String pagingAdmin(Model model,@RequestParam int pagenumber){
		Page<Product> pageProduct= productservice.findAll(new PageRequest(pagenumber, 8,Direction.ASC,"idproduct"));
		List<Product> stackProduct=pageProduct.getContent();
		int totalPage=pageProduct.getTotalPages();
		model.addAttribute("totalPage",totalPage );
		model.addAttribute("Lproduct", stackProduct);
		return "admin";
	}
	@RequestMapping(value="/addproduct",method=RequestMethod.GET)
	public String newProduct(Model model){
		List<Location> listlocation= locationservice.getAll();
		List<Category> listcate= categoryservice.getAll();
		List<Supplier> listsup= supplierservice.getAll();
		model.addAttribute("location", listlocation);
		model.addAttribute("category", listcate);
		model.addAttribute("sup", listsup);
		Product product= new Product();
		model.addAttribute("product", product);
		return "addnewproduct";
	}
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product,BindingResult result,Model model){
		uservalidator.validateProduct(product, result);
		if(result.hasErrors()){
			result.resolveMessageCodes("message", "Thêm thất bại");
			return "addnewproduct";
		}
		productservice.addnew(product);
		model.addAttribute("message", "Thêm thành công");
		List<Product> list= productservice.getAll();
		model.addAttribute("listp", list);
		return "admin";
	}
	public String findCustomer(@RequestParam int idcustomer,Model model){
		if(customerservice.findId(idcustomer)!=null){
			Customer customer= new Customer();
			customer=customerservice.findId(idcustomer);
			model.addAttribute("custorder", customer);
			return "customerorder";
		}
		else{
			return "direct:/admin";
		}
	}
	@RequestMapping(value="/editproduct",method=RequestMethod.GET)
	public String updateproduct(Model model,@RequestParam Integer idproduct){
		Product product= productservice.findId(idproduct);
		model.addAttribute("product", product);
		List<Location> listlocation= locationservice.getAll();
		List<Category> listcate= categoryservice.getAll();
		List<Supplier> listsup= supplierservice.getAll();
		model.addAttribute("location", listlocation);
		model.addAttribute("category", listcate);
		model.addAttribute("sup", listsup);
		return "editproduct";
	}
	@RequestMapping(value="/editproduct",method=RequestMethod.POST)
	public String editedproduct(Model model,@ModelAttribute("product") Product product){
		productservice.update(product);
		return "redirect:/admin";
	}
	@RequestMapping(value="/deleteproduct")
	public String deleteproduct(@RequestParam int idproduct,Model model){
		if(productservice.findId(idproduct)!=null){
			productservice.delete(idproduct);
		}
		return "redirect:/admin";
	}
	@RequestMapping(value="/{pagenumber}")
	public String page(@PathVariable int pagenumber,Model model){
		List<Category> listcategory=categoryservice.getAll();
		List<Supplier> supplier= suppliservice.getAll();	
		List<Location> location=locationservice.getAll();	
		List<Product> productnew=productservice.getAllNewest();
		List<Event> listevent= eventservice.getAllEvent();
		model.addAttribute("newest", productnew);
		model.addAttribute("Lcate", listcategory);
		model.addAttribute("Lsup", supplier);
		model.addAttribute("location", location);
		model.addAttribute("event", listevent);
		Page<Product> pageProduct= productservice.findAll(new PageRequest(pagenumber, 8,Direction.ASC,"idproduct"));
		List<Product> stackProduct=pageProduct.getContent();
		int totalPage=pageProduct.getTotalPages();
		model.addAttribute("totalPage",totalPage );
		model.addAttribute("Lproduct", stackProduct);
		return "index";
	}
	@RequestMapping(value="/checkorder")
	public String checkorder(Model model){
		
		return "null";
	}
	@RequestMapping(value="/orderpage")
	public String orderpage(Model model){
		List<OrderDetail> listdetail= detailservice.getAll();
		model.addAttribute("listorder", listdetail);
		return "orderpage";
	}
	@RequestMapping(value="/vieworderdetail")
	public String vieworder(Model model,@RequestParam int idorderdetail){
		OrderDetail detailorder= detailservice.findId(idorderdetail);
		model.addAttribute("vieworderid", detailorder);
		return "detailorder";
	}
	@RequestMapping(value="/deleteorder")
	public String deleteorder(Model model,@RequestParam int idorderdetail){
		if(detailservice.findId(idorderdetail)!=null){
			detailservice.delete(idorderdetail);
		}
			return "redirect:/orderpage";
	}
	@RequestMapping(value="/customer")
	public String getCustomer(Model model){
		List<Customer> list= customerservice.getAll();
		model.addAttribute("listcust", list);
		return "customer";
	}
	@RequestMapping(value="/deletecust")
	public String deletecust(@RequestParam int idcustomer,Model model){
		if(customerservice.findId(idcustomer)!=null){
			customerservice.delete(idcustomer);
		}else{
			model.addAttribute("message", "Không tìm thấy dữ liệu");
		}
		return "redirect:/customer";
	}
	@RequestMapping(value="/editcustomer",method=RequestMethod.GET)
	public String updateCustomer(@RequestParam Integer idcustomer,Model model){
		Customer customer= customerservice.findId(idcustomer);
		model.addAttribute("customer", customer);
		return "editcustomer";
	}
	@RequestMapping(value="/editcustomer",method=RequestMethod.POST)
	public String editcustomer(@RequestParam Integer idcustomer, @ModelAttribute("customer") Customer customer,Model model){
		customerservice.update(customer);
		List<Customer> list= customerservice.getAll();
		model.addAttribute("listcust", list);
		return "customer";
	}
	@RequestMapping(value="/editorderdetail",method=RequestMethod.GET)
	public String updatedOrderdetail(@RequestParam int idorderdetail,Model model ){
		OrderDetail orderdetail= orderservice.findId(idorderdetail);
		orderdetail.setCreatedate(new Date());
		model.addAttribute("orderdetail", orderdetail);
		return "editeorderpage";
	}
	@RequestMapping(value="/updateDetail",method=RequestMethod.GET)
	public String updatedOrderdetail(@RequestParam("id")int id){
		OrderDetail orderUpdate = orderservice.findId(id);
		orderUpdate.setStatus("Đã xử lý");
		orderUpdate.setLastupdate(new Date());
		orderservice.update(orderUpdate);
		return "redirect:/orderpage";
	}
	@RequestMapping(value="/getAllCategory")
	public String getAllCatgegory(Model model){
		List<Category> categoryGroup= categoryservice.getAll();
		model.addAttribute("allCateg", categoryGroup);
		return "listcategory";
	}
	@RequestMapping(value="/addcategory",method=RequestMethod.GET)
	public String addcategory(Model model){
		model.addAttribute("category", new Category());
		return "addcategory";
	}
	@RequestMapping(value="/addcategory",method=RequestMethod.POST)
	public String addedcategory(@ModelAttribute("category") Category category){
		categoryservice.create(category);
		return "redirect:/getAllCategory";
	}
	@RequestMapping(value="/removeCategory")
	public String removeCategory(@RequestParam int idcategory){
		categoryservice.delete(idcategory);
		return "redirect:/getAllCategory";
	}
	@RequestMapping(value="/editcategory",method=RequestMethod.GET)
	public String editCategory(@RequestParam int idcategory,Model model){
		Category category= categoryservice.findId(idcategory);
		model.addAttribute("editcategory", category);
		return "editcategory";
	}
	@RequestMapping(value="/editcategory",method=RequestMethod.POST)
	public String editedCategory(@ModelAttribute("editcategory") Category category){
		categoryservice.update(category);
		return "redirect:/getAllCategory";
	}
	@RequestMapping(value="/getAllSupply")
	public String getAllSupply(Model model){
		List<Supplier> supplyGroup=supplierservice.getAll();
		model.addAttribute("listSup", supplyGroup);
		return "listsupply";
	}
	@RequestMapping(value="/addsupply",method=RequestMethod.GET)
	public String addSupply(Model model){
		model.addAttribute("newsupply", new Supplier());
		return "addsupply";
	}
	@RequestMapping(value="/addsupply",method=RequestMethod.POST)
	public String addedSuply(@ModelAttribute("newsupply") Supplier supply){
		supplierservice.creat(supply);
		return "redirect:/getAllSupply";
	}
	@RequestMapping(value="/editsupply",method=RequestMethod.GET)
	public String editSupply(@RequestParam int idsupply,Model model){
		Supplier supply= supplierservice.findId(idsupply);
		model.addAttribute("supply", supply);
		return "editsupply";
	}
	@RequestMapping(value="/editsupply",method=RequestMethod.POST)
	public String editedSupply(@ModelAttribute("supply") Supplier supply){
		supplierservice.update(supply);
		return "redirect:/getAllSupply";
	}
	@RequestMapping(value="/removeSupply")
	public String removeSupply(@RequestParam int idsupplier){
		supplierservice.delete(idsupplier);
		return "redirect:/getAllSupply";
	}
/*	@RequestMapping(value="/comment",method=RequestMethod.GET)
	public String comments(Model model){
		model.addAttribute("comment", new Comment());
		return "comment";
	}
	@RequestMapping(value="/comment",method=RequestMethod.POST)
	public String comment(@RequestParam String name,@RequestParam String email,@RequestParam int idproduct,Model model,HttpServletRequest request){
		Customer customer=customerservice.findByNameAndEmail(name, email);
		Product product=productservice.findId(idproduct);
		List<Comment> commentGroup=commentService.getAll();
		String content=request.getParameter("content");
		Comment comment= new Comment(content, customer, product);
		commentService.create(comment);
		model.addAttribute("comment", commentGroup);
		return "redirect:/detail?idproduct"+idproduct;
	}*/
}

