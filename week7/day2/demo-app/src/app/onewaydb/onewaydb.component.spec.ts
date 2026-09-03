import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Onewaydb } from './onewaydb.component';

describe('Onewaydb', () => {
  let component: Onewaydb;
  let fixture: ComponentFixture<Onewaydb>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Onewaydb],
    }).compileComponents();

    fixture = TestBed.createComponent(Onewaydb);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
