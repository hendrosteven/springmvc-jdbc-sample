/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service.controller;

import core.entity.Product;
import core.service.dao.ProductDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String goHome() {
        return "home";
    }

    @RequestMapping(value = "/daftar", method = RequestMethod.GET)
    public String toDaftar(ModelMap model) {
        model.addAttribute("products", productDAO.getAll());
        return "daftar";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String goInsert() {
        return "insert";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String goSave(HttpServletRequest request) {
        String kode = request.getParameter("kode");
        String nama = request.getParameter("nama");
        double harga = Double.valueOf(request.getParameter("harga"));
        String keterangan = request.getParameter("keterangan");
        Product product = new Product(0, kode, nama, keterangan, harga);
        productDAO.insert(product);
        return "redirect:/home/daftar";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String goDelete(HttpServletRequest request) {
        int id = Integer.valueOf(request.getParameter("id"));
        productDAO.delete(id);
        return "redirect:/home/daftar";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String goEdit(HttpServletRequest request, ModelMap model) {
        int id = Integer.valueOf(request.getParameter("id"));
        model.addAttribute("product", productDAO.getById(id));
        return "edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String goUpdate(HttpServletRequest request) {
        int id = Integer.valueOf(request.getParameter("id"));
        String kode = request.getParameter("kode");
        String nama = request.getParameter("nama");
        double harga = Double.valueOf(request.getParameter("harga"));
        String keterangan = request.getParameter("keterangan");
        Product product = new Product(id, kode, nama, keterangan, harga);
        productDAO.update(product);
        return "redirect:/home/daftar";
    }
}
