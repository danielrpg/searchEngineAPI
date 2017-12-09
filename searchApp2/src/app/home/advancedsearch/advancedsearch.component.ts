import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-advancedsearch',
  templateUrl: './advancedsearch.component.html',
  styleUrls: ['./advancedsearch.component.css']
})
export class AdvancedsearchComponent implements OnInit {

  public listEdicts: any;

  constructor() { }

  ngOnInit() {
  }

  changeListEdicts(event) {
    this.listEdicts = event;
  }

}
