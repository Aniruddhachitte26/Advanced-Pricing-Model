/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Main;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {


        Business business = new Business("Xerox");


        //Creating Supplier Directory and adding 10 products to each supplier

        SupplierDirectory suplierdirectory = business.getSupplierDirectory();
 
        //Supplier 1

        Supplier supplier1 = suplierdirectory.newSupplier("Canon");

        ProductCatalog productcatalog = supplier1.getProductCatalog();

        Product products1p1 = productcatalog.newProduct("Scanner 1", 7000, 16500, 10000);

        Product products1p2 = productcatalog.newProduct("Scanner 2", 10000, 25000, 16500);

        Product products1p3 = productcatalog.newProduct("Printer 3", 22000, 40000, 36500);

        Product products1p4 = productcatalog.newProduct("Photocopier 1", 30000, 70000, 50000);

        Product products1p5 = productcatalog.newProduct("Scanner  3", 19000, 36500, 25000);

        Product products1p6 = productcatalog.newProduct("Scanner 4", 90000, 125000, 105000);

        Product products1p7 = productcatalog.newProduct("Printer 2", 22000, 60000, 36500);

        Product products1p8 = productcatalog.newProduct("Scanner 4", 30000, 70000, 50000);

        Product products1p9 = productcatalog.newProduct("Scanner 5", 30000, 70000, 50000);

        Product products1p10 = productcatalog.newProduct("Printer 1", 30000, 70000, 50000);
 
        //Supplier 2

        Supplier supplier2 = suplierdirectory.newSupplier("Epson");

        productcatalog = supplier2.getProductCatalog();

        Product products2p1 = productcatalog.newProduct("Scanner 13  1", 12000, 26000, 18500);

        Product products2p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000);

        Product products2p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);

        Product products2p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);

        Product products2p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);

        Product products2p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);

        Product products2p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);

        Product products2p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        Product products2p9 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        Product products2p10 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        //Supplier 3

        Supplier supplier3 = suplierdirectory.newSupplier("HP");

        productcatalog = supplier3.getProductCatalog();

        Product products3p1 = productcatalog.newProduct("Scanner 13  1", 2000, 26000, 1000);

        Product products3p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000);

        Product products3p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);

        Product products3p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);

        Product products3p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);

        Product products3p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);

        Product products3p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);

        Product products3p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        Product products3p9 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        Product products3p10 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        //Supplier 4

        Supplier supplier4 = suplierdirectory.newSupplier("Ink Advantage");

        productcatalog = supplier4.getProductCatalog();

        Product products4p1 = productcatalog.newProduct("Scanner 13  1", 12000, 26000, 18500);

        Product products4p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000);

        Product products4p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);

        Product products4p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);

        Product products4p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);

        Product products4p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);

        Product products4p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);

        Product products4p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        Product products4p9 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        Product products4p10 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        //Supplier 5

        Supplier supplier5 = suplierdirectory.newSupplier("Laser Jet");

        productcatalog = supplier5.getProductCatalog();

        Product products5p1 = productcatalog.newProduct("Scanner 13  1", 12000, 26000, 18500);

        Product products5p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000);

        Product products5p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);

        Product products5p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);

        Product products5p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);

        Product products5p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);

        Product products5p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);

        Product products5p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        Product products5p9 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);

        Product products5p10 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);


 
// Create PersonDirectory Object

        PersonDirectory persondirectory = business.getPersonDirectory();

// Creating SalesPerson       

        Person xeroxsalesperson001 = persondirectory.newPerson("SalesMate");
 
 
// We are create person objects to represent customer organizations. 

        Person customer1 = persondirectory.newPerson("Walmart");

        Person customer2 = persondirectory.newPerson("BestBuy");

        Person customer3 = persondirectory.newPerson("Target");

        Person customer4 = persondirectory.newPerson("Amazon");

        Person customer5 = persondirectory.newPerson("Flipkart");

        Person customer6 = persondirectory.newPerson("Kroger");

        Person customer7 = persondirectory.newPerson("Costco");

        Person customer8 = persondirectory.newPerson("Tesco");

        Person customer9 = persondirectory.newPerson("Home Depot");

        Person customer10 = persondirectory.newPerson("IKEA");
 
// Creating Customers

        CustomerDirectory customedirectory = business.getCustomerDirectory();

        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(customer1);

        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(customer2);

        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(customer3);

        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(customer4);

        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(customer5);

        CustomerProfile customerprofile6 = customedirectory.newCustomerProfile(customer6);

        CustomerProfile customerprofile7 = customedirectory.newCustomerProfile(customer7);

        CustomerProfile customerprofile8 = customedirectory.newCustomerProfile(customer8);

        CustomerProfile customerprofile9 = customedirectory.newCustomerProfile(customer9);

        CustomerProfile customerprofile10 = customedirectory.newCustomerProfile(customer10);

 
// Create Sales people

        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();

        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);

// Create User accounts that link to specific sales profiles

        UserAccountDirectory uadirectory = business.getUserAccountDirectory();

        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "XXXX"); /// order products for one of the customers and performed by a sales person
 
// Process 10 default Orders on behalf of sales person and customer

        MasterOrderList masterorderlist = business.getMasterOrderList();

         //Walmart Orders       

        Order Walmart1 = masterorderlist.newOrder(customerprofile1, salespersonprofile);

        OrderItem Walmart11= Walmart1.newOrderItem(products1p1, 17000, 1);

        OrderItem Walmart12 = Walmart1.newOrderItem(products1p2, 9500, 4);

        OrderItem Walmart13 = Walmart1.newOrderItem(products1p3, 29500, 10);

        OrderItem Walmart14 = Walmart1.newOrderItem(products1p4, 30000, 1);

        OrderItem Walmart15 = Walmart1.newOrderItem(products1p5, 2000, 3);

        OrderItem Walmart16 = Walmart1.newOrderItem(products1p6, 95000, 2);

        OrderItem Walmart17 = Walmart1.newOrderItem(products1p7, 26500, 3);

        OrderItem Walmart18 = Walmart1.newOrderItem(products1p8, 40000, 2);

        OrderItem Walmart19 = Walmart1.newOrderItem(products1p8, 40000, 2);

        OrderItem Walmart110 = Walmart1.newOrderItem(products1p8, 40000, 2);

        //BestBuy products

        Order BestBuy1 = masterorderlist.newOrder(customerprofile2, salespersonprofile);

        OrderItem BestBuy11= BestBuy1.newOrderItem(products1p1, 17000, 1);

        OrderItem BestBuy12 = BestBuy1.newOrderItem(products1p2, 9500, 4);

        OrderItem BestBuy13 = BestBuy1.newOrderItem(products1p3, 29500, 10);

        OrderItem BestBuy14 = BestBuy1.newOrderItem(products1p4, 30000, 1);

        OrderItem BestBuy15 = BestBuy1.newOrderItem(products1p5, 2000, 3);

        OrderItem BestBuy16 = BestBuy1.newOrderItem(products1p6, 95000, 2);

        OrderItem BestBuy17 = BestBuy1.newOrderItem(products1p7, 26500, 3);

        OrderItem BestBuy18 = BestBuy1.newOrderItem(products1p8, 40000, 2);

        OrderItem BestBuy19 = BestBuy1.newOrderItem(products1p8, 40000, 2);

        OrderItem BestBuy110 = BestBuy1.newOrderItem(products1p8, 40000, 2);
 
        //Target Orders

        Order Target1 = masterorderlist.newOrder(customerprofile3, salespersonprofile);

        OrderItem Target11= Target1.newOrderItem(products1p1, 17000, 1);

        OrderItem Target12 = Target1.newOrderItem(products1p2, 9500, 4);

        OrderItem Target13 = Target1.newOrderItem(products1p3, 29500, 10);

        OrderItem Target14 = Target1.newOrderItem(products1p4, 30000, 1);

        OrderItem Target15 = Target1.newOrderItem(products1p5, 2000, 3);

        OrderItem Target16 = Target1.newOrderItem(products1p6, 95000, 2);

        OrderItem Target17 = Target1.newOrderItem(products1p7, 26500, 3);

        OrderItem Target18 = Target1.newOrderItem(products1p8, 40000, 2);

        OrderItem Target19 = Target1.newOrderItem(products1p8, 40000, 2);

        OrderItem Target110 = Target1.newOrderItem(products1p8, 40000, 2);

        //Amazon Orders

        Order amazonOrder1 = masterorderlist.newOrder(customerprofile4, salespersonprofile);

        OrderItem amazonOrder11 = amazonOrder1.newOrderItem(products1p1, 18000, 1);

        OrderItem amazonOrder12 = amazonOrder1.newOrderItem(products1p2, 19500, 4);

        OrderItem amazonOrder13 = amazonOrder1.newOrderItem(products1p3, 36500, 10);

        OrderItem amazonOrder14 = amazonOrder1.newOrderItem(products1p4, 50000, 1);

        OrderItem amazonOrder15 = amazonOrder1.newOrderItem(products1p5, 25000, 3);

        OrderItem amazonOrder16 = amazonOrder1.newOrderItem(products1p6, 105000, 2);

        OrderItem amazonOrder17 = amazonOrder1.newOrderItem(products1p7, 36500, 3);

        OrderItem amazonOrder18 = amazonOrder1.newOrderItem(products1p8, 50000, 2);

        OrderItem amazonOrder19 = amazonOrder1.newOrderItem(products1p8, 50000, 2);

        OrderItem amazonOrder110 = amazonOrder1.newOrderItem(products1p8, 50000, 2);
 
        //Flipkart Orders

        Order flipkartOrder1 = masterorderlist.newOrder(customerprofile5, salespersonprofile);

        OrderItem flipkartOrder11 = flipkartOrder1.newOrderItem(products1p1, 17000, 1);

        OrderItem flipkartOrder12 = flipkartOrder1.newOrderItem(products1p2, 9500, 4);

        OrderItem flipkartOrder13 = flipkartOrder1.newOrderItem(products1p3, 29500, 10);

        OrderItem flipkartOrder14 = flipkartOrder1.newOrderItem(products1p4, 30000, 1);

        OrderItem flipkartOrder15 = flipkartOrder1.newOrderItem(products1p5, 2000, 3);

        OrderItem flipkartOrder16 = flipkartOrder1.newOrderItem(products1p6, 95000, 2);

        OrderItem flipkartOrder17 = flipkartOrder1.newOrderItem(products1p7, 26500, 3);

        OrderItem flipkartOrder18 = flipkartOrder1.newOrderItem(products1p8, 40000, 2);

        OrderItem flipkartOrder19 = flipkartOrder1.newOrderItem(products1p8, 40000, 2);

        OrderItem flipkartOrder110 = flipkartOrder1.newOrderItem(products1p8, 40000, 2);

 
       

        return business;


    }

}
