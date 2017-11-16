import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import "rxjs/add/operator/toPromise";
import { Observable } from 'rxjs/Observable';
import { SearchQuery } from '../models/SearchQuery';

@Injectable()
export class SearchService {
  public SEARCH_API_URL:string;
  public headers:any;
  constructor( private http:Http) {
    this.SEARCH_API_URL = "http://localhost:8080/api/rest/v1/";
    this.headers = new Headers({'Content-Type': 'application/json'});
   }

   searchTextService(searchQuery:SearchQuery):any{
     let json = JSON.stringify(searchQuery);
     return this.http
                .post(this.SEARCH_API_URL+"searchFullText", json, {headers:this.headers})
                .toPromise()
                .then(res => res.json());
   }
}
;