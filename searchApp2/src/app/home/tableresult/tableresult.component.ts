import { Component, OnInit, Input } from '@angular/core';

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
  
  public edicts : Array<Edict> = [
    { title:"Edicto 001", context:"contexto", date:"12-11-2017" },
    { title:"Edicto 001", context:"contexto", date:"12-11-2017" }
  ];
  
  constructor() {
    
  }

  detailEdict(edict:any){
    console.log(edict);
    $('#detailEdictModal').open();
  }


  ngOnInit() {
   
  }

}
