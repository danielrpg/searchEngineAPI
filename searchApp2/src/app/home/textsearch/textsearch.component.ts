import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { SearchService } from '../../services/search.service';

import { SearchQuery } from '../../models/SearchQuery';

@Component({
  selector: 'app-textsearch',
  templateUrl: './textsearch.component.html',
  styleUrls: ['./textsearch.component.css'],
  providers : [SearchService]
})
export class TextsearchComponent implements OnInit {
  public searchQuery : SearchQuery;
  
  @Output('updateTable')
  change: EventEmitter<any> = new EventEmitter<any>();

  constructor(private searchService:SearchService) {
    this.searchQuery = new SearchQuery("");
  }

  searchText(){
    this.searchService.searchTextService(this.searchQuery)
                      .then(response => {
                          console.log(response);
                          this.change.emit(response);
                      });
  }

  ngOnInit() {
  }

}
