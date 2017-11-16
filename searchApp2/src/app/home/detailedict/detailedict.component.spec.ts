import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailedictComponent } from './detailedict.component';

describe('DetailedictComponent', () => {
  let component: DetailedictComponent;
  let fixture: ComponentFixture<DetailedictComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailedictComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailedictComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
