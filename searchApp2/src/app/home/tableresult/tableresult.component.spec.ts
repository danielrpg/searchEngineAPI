import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TableresultComponent } from './tableresult.component';

describe('TableresultComponent', () => {
  let component: TableresultComponent;
  let fixture: ComponentFixture<TableresultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TableresultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TableresultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
