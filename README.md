# How to Plan and Build a Project from Scratch

"I have an project idea I would like build, but I don't know where to start." I have seen this statment made many times and I often find that I say this to myself too. Whether you are a beginner or an experienced developer, "writer's block" is likely to occur without doing the very short and simple steps described here I use to get myself started.

What I have learned and have been doing for many years now is to create three very short and simple artifacts before I start buildng my projects. Whether these projects are smaller personal projects or large projects with a team of developers, I have learned that these three artifacts make developing projects so much easier and they remove the writer's block I usually experience if I don't do this.

The three artifacts are created in this order. A one-page description of the project in human terms. Anyone should be able to read this single page and know what the project will do. Next, a workflow diagram which is actually a combination sequence, class, and workflow diagram. Once the workflow diagram is done, a task list is created from the workflow diagram with tasks broken down into single day units of work. That's it. This process typlically takes a day or less depending on the size of the project.

The following describes these three artifacts in detail using a small project as an example.

## How to Write a One-Pager

A one-pager is typically single page or less that describes the project in human terms so anyone reading it will know what the project will do. I usually just start writing about the project, usually starting with the problem that needs to be solved, then go into the description of how this project solves that problem.

&lt;Include an annotated one-pager example&gt;

## How to Create a Workflow Diagram

Next, I create a workflow diagram from the one-pager description. This workflow diagram is a combination of a sequence diagram and a class diagram done in a workflow like form. This diagram does not use strict UML, just boxes and lines with arrows or diamonds, and a bunch on text in the whitespace to describe that part of the diagram. I often number the steps or show some form of entry point so the reader knows where to start from. The boxes are classes or screen mockups, the lines with arrows indicate the direction of flow while the lines with diamonds indicate class relationships. Once the task breakdown step is completed (below) the tasks identified are added to the workflow diagram to show what part of the system the task improves.

![workflow diagram](https://github.com/bigspotteddog/landing-page-service/blob/main/landing_page_service.png?raw=true)

## How to Create a Task Breakdown

With the workflow diagram completed, I start from the entry point and created a task list to complete that one box or line on the diagram. This could be a single task it in can be completed in a day; otherwise, it ends up being a dscription of what needs to be accomplished and a list of subtasks are created in single day chunks until the task is completely tasked out. Then it is on to the next box or line in the work flow. Sometimes, there are multiple entry points so each of those are addressed in the same manner.

### Sample Task Breakdown
# Landing Page Service

## Allow customers to register with their email (post request to database, send email)

### Publish landing page

* Task 1: Get template landing page hosted on the Internet
* Task 2: Modify the landing page to customize it for your business
* Task 3: Modify the landing page to send a post request to a url with a fake campaign_id and the entered email address

### Save email addresses

* Task 4: Create an email endpoint to receive the email post request
* Task 5: Create a database table to save email addresses
* Task 6: Save the email address received to the email database table

### Send email response

* Task 7: Modify the email endpoint to send a thank you response email

### This is now a functional MVP!

## Process emails (restful processing, database)

### Administrative pages (add authentication)

* Task 8: Create an administrative website for restricted access
* Task 9: Add authentication to the website for administrative pages
* Task 10: Add an administrative user account

### Get the list of email addresses (get request to return a list)

* Task 11: Add an endpoint that returns the list of emails
* Task 12: Add a web page that displays the list of emails

### Add products (post request to create records in the database)

* Task 13: Create a web page to post a product
* Task 14: Create a product endpoint to receive the product post request
* Task 15: Create a database table to save products
* Task 16: Save the product received to the product database table

### Add campaigns (containment database relationships)

* Task 17: Create a web page to post a campaign
* Task 18: Create a campaign endpoint to receive the campaing post request
* Task 19: Create a database table to save campaigns
* Task 20: Save the campaign received to the campaign database table

### Associate emails to products by campaign (aggregate database relationships)

* Task 21: Modify the email endpoint to look up the campaign
* Task 22: Create a database table to save the product-email associations
* Task 23: Modify the email endpoint to create the product-email association
* Task 24: Modify the email listing to show the products an email is interested in

### Email templates (using templates)

* Task 25: Create an email template to use for sending the thank you response email
* Task 26: Modify the thank you response email to use the template
* Task 27: Create a web page to post an email template
* Task 28: Create an endpoint to receive an email template
* Task 29: Create a database table to save the email template
* Task 30: Save the email template received to the email template database table
* Task 31: Use the email template to send the thank you response email

## Scheduling tasks (restful, database, sending emails)

### Schedule email (more restful)

* Task 32: Create an endpoint to receive a scheduled email
* Task 33: Create a database table to save the scheduled email
* Task 34: Create a web page to post a scheduled email
* Task 35: Save the scheduled eamil to the scheduled email database table

### Send scheduled emails (running scheduled tasks)

* Task 36: Create a scheduled process that sends scheduled emails
* Task 37: Fetch scheduled emails to send
* Task 38: Send emails

### Campaign flow (scheduling the next task)

* Task 39: Modify the scheduled process to schedule the next email template as a scheduled email
