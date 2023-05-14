import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProtectosComponent } from './protectos.component';

describe('ProtectosComponent', () => {
  let component: ProtectosComponent;
  let fixture: ComponentFixture<ProtectosComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProtectosComponent]
    });
    fixture = TestBed.createComponent(ProtectosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
