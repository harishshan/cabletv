import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HsLabelInputTextComponent } from './hs-label-input-text.component';

describe('HsLabelInputTextComponent', () => {
  let component: HsLabelInputTextComponent;
  let fixture: ComponentFixture<HsLabelInputTextComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HsLabelInputTextComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HsLabelInputTextComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
