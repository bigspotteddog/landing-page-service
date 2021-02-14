# How to build an ecommerce website from scratch

The project will teach you how to build an ecommerce website from scratch. The website will work similar to Amazon Fresh.

The features for this ecommerce site are described below and they will each feature will include the technologiess and development knowledge needed to build that feature.

The first step will be to deploy a "Hello World!" web application to the cloud. A web application includes a backend system where a website does not. This will teach us some dev ops to get the web site deployed. We will incrementally improve the website from there.

## What are the features of this ecommerce website?

The following is a list of features for an ecommerce website.

### Customer view

Customers should be able to view and buy products whether they logged in or not.

Logged in customers will be able to view their current open orders as well as their past orders. Customers can also save products in their shopping cart and move products to save for later.

We should display a recently viewed product history for customers too.

Customers will browse products by category as the default view. Customers can run a keyword search which will list all products scoring greater than zero sorted by search score.

Payment and shipping addresses should be saved for logged in customers.

#### Browse products

Customers should be able to see products by catetory. Categories can be in rows with products in the category in columns. Scrolling through the products in a category can work like amazon fresh.

Categories can have subcategories. When a customer is browsing products, they can click on a category and the view will change to rows of subcategories within the category clicked.

##### Browse by category

This is the default view.

##### Search for products by keyword

There should be a keyword search at the top of the page. Products getting a search score greater than zero will be displayed in descending score order.

#### Shopping cart

When a customer adds a product to their shopping cart, a counter will be displayed at the top of the page. When the customer clicks on the cart, the items in the cart will be displayed. Customers should be able to change item quantities there and they should be able to remove products.

#### Checkout

When a customer is viewing their cart, they will have the option to checkout. On the checkout page, the customer can add the shipping address and payment information. If the customer is logged in, they can pick between previously save shipping addresses and payment information.

#### Login

A customer can login to view their shopping cart and can track their current and previous orders.

#### Save for later

When a customer is logged in and viewing items in their shopping cart, they can move an item to save for later.

#### My orders

When a customer is logged in they can view their order history.

#### Track orders

When a customer is lgged in they can track orders in their order history.

### Merchant view

Whether this ecommerce website has a single seller or it is a marketplace, we will build it as a marketplace. Merchants should be able to register and sell their products on the store.

Merchants can build their own store too. If a customer clicks on a merchants page link, the products displayed will be those of the merchant selected.

#### Add products

A merchant can add products to their store and they will show up on the main store. Products can have a title and description. A product can also have multiple options and prices. Maybe there should be a default product price that is overridden or added to by the options. This means an option price can be absolute or additive.

#### Categorize products

A merchant can assign products to a category that will make it easier for customers to find a product.

#### Process orders

When a customer places and order, the merchant needs to process and ship the order. When logged in a merchant can view their current orders, select them for processing, the mark them as shipped with tracking information.

#### Modify orders

Merchants may need to modify orders to process refunds, give discounts, or other customer service activities.

#### Merchant settings

Merchants will need to setup the Stripe checkout information so they can receive payment for products sold.
