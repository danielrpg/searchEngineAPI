import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public listEdicts:any;

  constructor() { }

  ngOnInit() {
  }

  changeListEdicts(event) {
    this.listEdicts = event;
  }

}
