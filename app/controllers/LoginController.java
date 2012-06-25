package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class LoginController extends Controller {
  
  public static Result index() {
    return ok(views.html.Login.login.render());
  }

  
  public static Result welcome() {
  	return ok(views.html.Login.welcome.render());
  }
  
}