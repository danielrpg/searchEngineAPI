import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import "rxjs/add/operator/toPromise";
import { Observable } from 'rxjs/Observable';
import { User } from '../models/User';

@Injectable()
export class LoginService {
  public LOGIN_URL:string;
  public headers:any;
  constructor( private http:Http) { 
    this.LOGIN_URL = "http://localhost:8080/api/rest/v1/";
    this.headers = new Headers({'Content-Type': 'application/json'});
  }

  /**
   * This is method to permit authenticate all user
   * and return json response with true or false status
   */
  loginUser(user:User):Promise<Response> {
    let json = JSON.stringify(user);
    return this.http
              .post(this.LOGIN_URL+"authenticate", json,{headers:this.headers})
              .toPromise()
              .then(res => res.json() as Response);
  }

  getMessage(){
    return "Hello from service";
  }

}
