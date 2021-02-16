# How to build an ecommerce marketplace website from scratch

This project will teach you how to build an ecommerce marketplace website from scratch. The website will work similar to Amazon Fresh.

The features for this ecommerce site are described below and each feature will include the technologies and development knowledge needed to build that feature.

## Prerequisites

The first step will be to deploy a "Hello World!" web application to the cloud. A web application includes a backend system where a website does not. This will teach us some dev ops to get the web site deployed. We will incrementally improve the website from there.

#### Application server

We will be using Java as our backend programming language and Spring Boot as the application server. We will need to install Java and run the Spring Boot initializer to create the initial application.

Skills:
* Install Java (https://adoptopenjdk.net/)
* Create a Spring Boot application (https://start.spring.io)
* index.html basics
    * HTML, HEAD, TITLE, BODY, H1
* Add bootstrap (https://getbootstrap.com/)
#### Google Cloud Platform

Since this ecommerce store will be deployed to the cloud, we will use Google Cloud Platform and we will need to install that and its prerequisite, Python.

Once we have installed these platform tools, we will publish the web application GCP on Google App Engine. We will want the ecommerce store to be secure so we will need to issue and configure the web application to use a SSL/TLS certificate. We will also need to register a domain and configure DNS settings.

We will also setup a database.

Skills:
* Install Python
* Install Google Cloud SDK
* Create a GCP project
* Deploy a project to Google App Engine
* Register a custom domain
* Configure our project to use HTTPS only
* Install database
## What are the features of this ecommerce website?

The following is a list of features for an ecommerce website.
### Customer view

Customers should be able to view and buy products whether they logged in or not.

Logged in customers will be able to view their current open orders as well as their past orders. Customers can also save products in their shopping cart and move products to save for later.

We should display a recently viewed product history for logged in customers too.

Customers will browse products by category as the default view. Customers can run a keyword search which will list all products scoring greater than zero sorted by search score.

Payment and shipping addresses should be saved for logged in customers.

#### Browse products by category

This is the default view.

Customers should be able to see products by catetory. Categories can be in rows with products in the category in columns. Scrolling through the products in a category can work like amazon fresh.

Categories can have subcategories. When a customer is browsing products, they can click on a category and the view will change to rows of subcategories within the category clicked.

Skills:
* HTML
    * div, img, span, a or button, template
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * template string substitution
    * append element
    * ajax REST GET requests
* Java/Spring Boot
    * receive http get request
    * connect to database
    * select information from database
    * data transfer objects
* Database
    * SQL
        * select
            * join
            * where
            * order by
##### Search for products by keyword

There should be a keyword search at the top of the page. Products getting a search score greater than zero will be displayed in descending score order.

Skills:
* HTML
    * div, img, span, a or button, template
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * template string substitution
    * append element
    * ajax REST GET request
* Java/Spring Boot
    * receive http get request
    * connect to database
    * select information from database
    * data transfer objects
* Database
    * SQL
        * select
            * join
            * where
            * order by
            * group by
            * sum
#### View product

When a customer clicks on a product while browsing, they will be taken to the product view which will have a title, description, price, options, and images.

Skills:
* HTML
    * div, img, span, a or button, template
    * form, input, select, submit
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * template string substitution
    * append element
    * ajax REST GET request
* Java/Spring Boot
    * receive http get request
    * connect to database
    * select information from database
    * data transfer objects
* Database
    * SQL
        * select
            * join
            * where
#### View shopping cart

When a customer adds a product to their shopping cart, a counter will be displayed at the top of the page. When the customer clicks on the cart, the items in the cart will be displayed. Customers should be able to change item quantities there and they should be able to remove products.

Skills:
* HTML
    * div, img, span, a or button, select, template
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * template string substitution
    * append element
    * ajax REST GET request
* Java/Spring Boot
    * receive http get request
    * connect to database
    * select information from database
    * data transfer objects 
* Database
    * SQL
        * select
            * join
            * where
#### Checkout

When a customer is viewing their cart, they will have the option to checkout. On the checkout page, the customer can add the shipping address and payment information. If the customer is logged in, they can pick between previously save shipping addresses and payment information.

Skills:
* HTML
    * div, img, span, a or button, select, template
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * template string substitution
    * append element
    * Stripe js 
        * include library
        * send payment information to server
    * Ajax REST POST request
* Java/Spring Boot
    * receive http post request
    * connect to database
    * select information from database
    * Stripe payment processing
    * insert information into database
    * update information in database
    * data transfer objects
* Database
    * SQL
        * select
            * join
            * where
        * update
            * where
        * insert into
#### Product reviews

Products will have customer reviews that have a star rating, a heading and a comment. This should appear at the bottom of the product page.

Skills:
* HTML
    * div, img, span, a or button, select, template
    * form, input, textarea, submit
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * template string substitution
    * append element
    * Ajax REST GET request
    * Ajax REST POST request
* Java/Spring Boot
    * receive http post request
    * save information to database
* Database
    * SQL
        * insert into
#### Login

A customer can login to view their shopping cart and can track their current and previous orders.

Skills:
* HTML
    * div, span, a or button, input
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * Ajax REST POST request
* Java/Spring Boot
    * receive http post request
    * encryption
    * database lookup
    * http cookies
* SQL
    * select
    * where
#### Save for later

When a customer is logged in and viewing items in their shopping cart, they can move an item to save for later.

Skills:
* HTML
    * div, a
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * Ajax REST POST request
* Java/Spring Boot
    * receive http post request
    * insert information into database
* Database
    * create table
    * table index
    * database normalization
* SQL
    * insert into
#### My orders

When a customer is logged in they can view their order history.

Skills:
* HTML
    * div, img, span, a or button, template
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * template string substitution
    * append element
    * ajax REST GET request
* Java/Spring Boot
    * connect to database
    * select information from database
* Database
    * SQL
        * select
        * join
        * where
#### Track orders

When a customer is lgged in they can track orders in their order history.

Skills:
* HTML
    * div, img, span, a or button, select, template
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * template string substitution
    * append element
    * ajax REST GET request
* Java/Spring Boot
    * connect to database
    * select information from database
    * receive http post request
    * get shipment tracking information from UPS/FedEx/USPS    
* Database
    * SQL
        * select
        * join
        * where
### Merchant view

Whether this ecommerce website has a single seller or it is a marketplace, we will build it as a marketplace. Merchants should be able to register and sell their products on the store.

Merchants can build their own store too. If a customer clicks on a merchants page link, the products displayed will be those of the merchant selected.

#### Add products

A merchant can add products to their store and they will show up on the main store. Products can have a title and description. A product can also have multiple options and prices. Maybe there should be a default product price that is overridden or added to by the options. This means an option price can be absolute or additive.

Skills:
* HTML
    * div, a, img
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * upload image
    * get element by id
    * Ajax REST POST request
* Java/Spring Boot
    * receive http post request
    * insert information into database
* Database
    * create table
    * table index
    * database normalization
    * SQL
        * insert into
#### Categorize products

A merchant can assign products to a category that will make it easier for customers to find a product.

Skills:
* HTML
    * div, a, img
    * form, input, textarea, submit
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * upload image
    * get element by id
    * Ajax REST GET request
    * Ajax REST POST request
    * Ajax REST PUT request
    * Ajax REST DELETE requesst
* Java/Spring Boot
    * receive http post request
    * select information from database
    * insert information into database
    * update information in database
    * delete information from database
* Database
    * create table
    * table index
    * database normalization
    * SQL
        * select
            * where
            * order by
        * insert
        * update
            * where
        * delete
            * where
#### Process orders

When a customer places and order, the merchant needs to process and ship the order. When logged in a merchant can view their current orders, select them for processing, the mark them as shipped with tracking information.

Skills:
* HTML
    * div, a, img
    * form, input, textarea, submit
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * Ajax REST POST request
    * Ajax REST PUT request
* Java/Spring Boot
    * receive http post request
    * insert information into database
    * update information in database
* Database
    * create table
    * table index
    * database normalization
    * SQL
        * insert
        * update
#### Modify orders

Merchants may need to modify orders to process refunds, give discounts, or other customer service activities.

Skills:
* HTML
    * div, a, img
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * Ajax REST GET, POST, DELETE requests
* Java/Spring Boot
    * receive http get, post, put, delete requests
    * select, insert, update, delete information from database
* Database
    * create table
    * table index
    * database normalization
    * SQL
        * insert
        * update
        * delete
#### Merchant settings

Merchants will need to setup the Stripe checkout information so they can receive payment for products sold.

Skills:
* HTML
    * div, a, img
    * form, input, textarea, select, submit
* CSS
    * class
* Bootstrap
    * container, row, column, grid or flexbox
* JavaScript
    * var const let
    * JSON
        * arrays
        * objects
    * for loop
    * if else
    * functions
    * get element by id
    * Ajax REST GET, POST, PUT, DELETE request
* Java/Spring Boot
    * receive http get, post, put, delete request
    * get, insert, update, delete information from database
* Database
    * create table
    * table index
    * database normalization
* SQL
    * select
    * insert
    * update
    * delete




Skills:
* HTML
    * html, head, title, body, script, style
    * div, span, img, a, button, template
    * form, input, textarea, select, submit
* CSS
    * Class attribute
    * Stylesheet basics
    * Selectors
* Bootstrap
    * Layout: breakpoints, containers, grid, columns, gutters
    * Content: images, tables
    * Forms: form control, select, checks & radios, layout, validation
    * Components: breadcrumb, buttons, dropdowns, modal, pagination
    * Utilities: borders, colors, display, flex, float, text, vertical align
* JavaScript
    * Variables: var const let
    * Expressions and operators
    * Conditionals: if else, operators, switch
    * JSON: objects, arrays, parse, stringify
    * Loops: for, while
    * Functions
    * Get element by id
    * Get elements by class
    * Template string substitution
    * Append element
    * REST: Fetch API GET, POST, PUT, DELETE requests
    * Stripe JS get credit card information
* Java/Spring Boot
    * Java
        * Installation
        * Variables type
        * Expressions and operators
        * Conditionals: if else, operators, switch
        * JSON: objects, arrays, fromJson, toJson
        * Loops: for, while
        * Functions
        * Classes
    * Spring Boot
        * Create Spring Boot app
        * REST: receive HTTP GET, POST, PUT, DELETE requests
        * Connect to database
    * Select, insert, update, delete information from database
    * Stripe API submit payment
    * Get shipment tracking information from UPS/FedEx/USPS    
* Database
    * Install database
    * Create table
    * Create index
    * Normalization
    * SQL
        * select
            * join
            * where
            * order by
            * group by
            * sum
        * insert
        * update
            * where
        * delete
            * where
