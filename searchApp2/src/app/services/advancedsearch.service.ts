import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import { Observable } from 'rxjs/Observable';
import {AdvancedQuery} from '../models/AdvancedQuery';

@Injectable()
export class AdvancedsearchService {

  public SEARCH_API_URL: string;
  public headers: any;
  constructor( private http: Http) {
    this.SEARCH_API_URL = 'http://localhost:8080/api/rest/v1/';
    this.headers = new Headers({'Content-Type': 'application/json'});
  }

  searchAdvancedQuery( searchQuery: AdvancedQuery): any {
    const json = JSON.stringify(searchQuery);
    return this.http
              .post(this.SEARCH_API_URL + 'searchAdvancedSearch', json, { headers: this.headers })
              .toPromise()
              .then(res => res.json());
  }

}
