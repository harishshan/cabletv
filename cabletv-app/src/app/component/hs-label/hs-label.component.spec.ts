import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HsLabelComponent } from './hs-label.component';

describe('HsLabelComponent', () => {
  let component: HsLabelComponent;
  let fixture: ComponentFixture<HsLabelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HsLabelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HsLabelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
