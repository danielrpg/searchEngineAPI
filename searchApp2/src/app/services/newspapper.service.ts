import { Injectable } from '@angular/core';
import {Headers, Http} from '@angular/http';

@Injectable()
export class NewspapperService {
  public SEARCH_API_URL: string;
  public headers: any;
  constructor( private http: Http) {
    this.SEARCH_API_URL = 'http://localhost:8080/api/rest/v1/';
    this.headers = new Headers({'Content-Type': 'application/json'});
  }

  getListNewspaper(): any{
    return this.http
      .get(this.SEARCH_API_URL + 'getListNewspapers',  { headers: this.headers })
      .toPromise()
      .then(res => res.json());
  }

}
