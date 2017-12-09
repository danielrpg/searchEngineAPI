import {Component, EventEmitter, OnInit, Output} from '@angular/core';

import { AdvancedQuery } from '../../../models/AdvancedQuery';
import { NewspapperService } from '../../../services/newspapper.service';
import {AdvancedsearchService} from '../../../services/advancedsearch.service';

@Component({
  selector: 'app-advancedform',
  templateUrl: './advancedform.component.html',
  styleUrls: ['./advancedform.component.css'],
  providers : [NewspapperService, AdvancedsearchService]
})
export class AdvancedformComponent implements OnInit {

  public advancedSearchQuery: AdvancedQuery;
  public newspapers: Array<any> = [];

  @Output('updateTable')
  change: EventEmitter<any> = new EventEmitter<any>();

  constructor(private newspaperService: NewspapperService,
              private advancedSearchService: AdvancedsearchService) {
    this.advancedSearchQuery = new AdvancedQuery('', '', '', '', '');
  }

  ngOnInit() {
    this.getListNewspaper();
  }

  getListNewspaper() {
    this.newspaperService.getListNewspaper()
      .then(response => {
        this.newspapers = response.newspapers;
      });
  }

  searchAdvanced() {
    this.advancedSearchService.searchAdvancedQuery(this.advancedSearchQuery)
        .then(response => {
          this.change.emit(response);
        });
  }
}
