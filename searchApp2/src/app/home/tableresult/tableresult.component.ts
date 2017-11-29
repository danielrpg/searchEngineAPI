import { Component, OnInit, Input } from '@angular/core';
;

import { Edict } from '../../models/Edict';

declare var jQuery:any;
declare var $:any;

@Component({
  selector: 'app-tableresult',
  templateUrl: './tableresult.component.html',
  styleUrls: ['./tableresult.component.css']
})
export class TableresultComponent implements OnInit {

  @Input() listEdicts:any;
  
  public edicts : Array<Edict> = [];
  
  constructor( ) {
    
  }

  detailEdict(edict:any){
  }


  ngOnInit() {
   
  }

}
