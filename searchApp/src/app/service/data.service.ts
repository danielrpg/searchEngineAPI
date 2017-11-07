import { Injectable } from '@angular/core';
import { Http, Response, RequestOptions, Headers } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';


@Injectable()
export class DataService {
  private url: string = 'http://localhost/rest/api/';

  constructor(private http: Http) { 

  }

  login(post):Observable<any>{
    console.log(post);
    const LOGIN_API = this.url+'get/login/'+post['username']+'/'+post['password'];
    return this.http
          .get(LOGIN_API, {})
          .map(
            res => {
              if(res.json().status == true){
                localStorage.setItem('currentUser', JSON.stringify(res.json().data));
              }
              return res.json();
            },
            err => {
              return err;
            }
          )
  }

  logout(){
    localStorage.removeItem('currentUser');
  }

  getItem(): Observable<any> {
    const LIST_ITEM_API = this.url+'get/item/list';
    return this.http
            .get(LIST_ITEM_API, {})
            .map(
              res => {
                return res.json();
              },
              err =>{
                return err;
              }
            )
  }

}
