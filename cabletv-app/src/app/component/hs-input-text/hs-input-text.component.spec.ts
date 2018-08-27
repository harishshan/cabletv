import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HsInputTextComponent } from './hs-input-text.component';

describe('HsInputTextComponent', () => {
  let component: HsInputTextComponent;
  let fixture: ComponentFixture<HsInputTextComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HsInputTextComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HsInputTextComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
