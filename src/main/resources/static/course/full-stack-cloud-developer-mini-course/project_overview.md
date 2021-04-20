# Project Overview

## Landing Page Service - One Pager

The following describes the desired features for our landing page service.

We have some courses and other digital products we would like to create landing pages for that will collect the email addresses of people interested in each of these products.

We would like to collect the email addresses somewhere so we can send out emails to inform our prospective customers about the products they are interested in. It would be nice if the system would automatically send a response email thanking the prospective customer for registering. That would give the customer an immediate response rather than waiting for us to notice that a new customer registered and then sending them an email manually much later.

Since we will have several digital products the emails sent to the customer should be tailored to the product they are interested in. That way, we can customize the email sent out for a particular product.

It would be nice to have the ability to create an email template for a product that way we can personalize the email with their name or other information about the product.

We have seen other email marketing systems that can send out a series of emails spaced out with a couple of days in between. We would like to be able to schedule a series of emails for a product and specify the number of days in between each email and the next one.

Some of the emails may have links to PDFs or other downloadable links.

Once a customer purchases a product, they should no longer receive sales related emails and they should now be sent product related update emails.

We would like to track where an email addresses was submitted from so we can see which marketing campaigns were successful and which ones were not and at what point the customer converted. There could be several locations with the email input form and it is possible we will add this to blog articles or other places.

A customer should be able to unsubscribe from receiving emails. If customer registers again after unsubscribing we would like that email address to be reactivated from where they left off.

## Landing Page Service - Workflow Diagram

The workflow diagram below describes our landing page service and the resources that will fullfil the requirements from the One-Pager. The resources in blue define our minimum viable product (MVP), the thing we will build first.

![workflow diagram](https://github.com/bigspotteddog/landing-page-service/blob/main/landing_page_service_tasked.png?raw=true)

## Landing Page Service - Task Breakdown

### Allow customers to register with their email (post request to database, send email)

#### Publish landing page

* Task 1: Get an application server running locally with template landing page
* Task 2: Get template landing page hosted on the Internet
* Task 3: Modify the landing page to customize it for our business
* Task 4: Modify the landing page to send a post request to a url with a fake campaign\_id and the entered email address

#### Save email addresses

* Task 5: Create an email endpoint to receive the email post request
* Task 6: Create a database table to save email addresses
* Task 7: Save the email address received to the email database table

#### Send email response

* Task 8: Modify the email endpoint to send a thank you response email
* Task 9: Modify the landing page to popup a thank you message

#### This is now a functional MVP!

### Process emails (restful processing, database)

#### Administrative pages (add authentication)

* Task 10: Create an administrative website for restricted access
* Task 11: Add authentication to the website for administrative pages
* Task 12: Add an administrative user account

#### Get the list of email addresses (get request to return a list)

* Task 13: Add an endpoint that returns the list of emails
* Task 14: Add a web page that displays the list of emails

#### Add products (post request to create records in the database)

* Task 15: Create a web page to post a product
* Task 16: Create a product endpoint to receive the product post request
* Task 17: Create a database table to save products
* Task 18: Save the product received to the product database table

#### Add campaigns (containment database relationships)

* Task 19: Create a web page to post a campaign
* Task 20: Create a campaign endpoint to receive the campaign post request
* Task 21: Create a database table to save campaigns
* Task 22: Save the campaign received to the campaign database table

#### Associate emails to products by campaign (aggregate database relationships)

* Task 23: Modify the email endpoint to look up the campaign
* Task 24: Create a database table to save the product-email associations
* Task 25: Modify the email endpoint to create the product-email association
* Task 26: Modify the email listing to show the products an email is interested in

#### Email templates (using templates)

* Task 27: Create an email template to use for sending the thank you response email
* Task 28: Modify the thank you response email to use the template
* Task 29: Create a web page to post an email template
* Task 30: Create an endpoint to receive an email template
* Task 31: Create a database table to save the email template
* Task 32: Save the email template received to the email template database table
* Task 33: Use the email template to send the thank you response email

### Scheduling tasks (restful, database, sending emails)

#### Schedule email (more restful)

* Task 34: Create an endpoint to receive a scheduled email
* Task 35: Create a database table to save the scheduled email
* Task 36: Create a web page to post a scheduled email
* Task 37: Save the scheduled email to the scheduled email database table

#### Send scheduled emails (running scheduled tasks)

* Task 38: Create a scheduled process that sends scheduled emails
* Task 39: Fetch scheduled emails to send
* Task 40: Send emails

#### Campaign flow (scheduling the next task)

* Task 41: Modify the scheduled process to schedule the next email template as a scheduled email
