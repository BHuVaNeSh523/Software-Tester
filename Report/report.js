$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/project.feature");
formatter.feature({
  "name": "Contact Us Form Submission",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User submits the contact us form successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "project.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to the About Us page",
  "keyword": "When "
});
formatter.match({
  "location": "project.the_user_navigates_to_the_About_Us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user scrolls down and selects the Hotel, Office, and Healthcare tabs",
  "keyword": "And "
});
formatter.match({
  "location": "project.the_user_scrolls_down_and_selects_tabs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to the Our Services page",
  "keyword": "And "
});
formatter.match({
  "location": "project.the_user_navigates_to_the_Our_Services_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to the Contact Us page",
  "keyword": "And "
});
formatter.match({
  "location": "project.the_user_navigates_to_the_Contact_Us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills out the contact form",
  "keyword": "And "
});
formatter.match({
  "location": "project.the_user_fills_out_the_contact_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the contact form",
  "keyword": "And "
});
formatter.match({
  "location": "project.the_user_submits_the_contact_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see a confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "project.the_user_should_see_a_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
});